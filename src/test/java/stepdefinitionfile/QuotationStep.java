package stepdefinitionfile;

import org.openqa.selenium.chrome.ChromeDriver;
import base.baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DatabaseSelectionObjects;
//import pages.LoginObjects;
import pages.Loginclick;
import pages.QuotationObjects;

public class QuotationStep extends baseclass {

	@Given("the user opens application and navigates to home page")
	public void the_user_opens_application_and_navigates_to_home_page() throws Exception {
		System.setProperty("webdriver.chrome.driver", Configproperties().getProperty("driverpath"));
		d = new ChromeDriver();
		d.get(Configproperties().getProperty("url"));
		d.manage().window().maximize();
		Thread.sleep(3000);
		//login = new LoginObjects();
		//login.LoginApplication();

		Thread.sleep(2000);
		data = new DatabaseSelectionObjects(d);
		data.Database();
		Thread.sleep(2000);
		Thread.sleep(2000);
		loginclick = new Loginclick(d);
		loginclick.EnterApplication();

	}

	@Given("the user navigates to Sales module and click Quotation button")
	public void the_user_navigates_to_sales_module_and_click_quotation_button() throws Exception {
		quotation = new QuotationObjects(d);
		quotation.Quotationpage();

	}

	@When("the user click create button")
	public void the_user_click_create_button() throws Exception {
		quotation.CreateQuotationDetails();

	}

	@Then("the user fills the field and clicks the save button")
	public void the_user_fills_the_field_and_clicks_the_save_button() throws Exception {
		quotation.QuotationNumber();

	}

	@Then("user click the Send for Approval button for generating Quotation number")
	public void user_click_the_send_for_approval_button_for_generating_quotation_number() throws Exception {
		quotation.QuotationnumberGenerate();
	}

	@Then("Quotation Number is generated and user take picture {string}")
	public void quotation_number_is_generated_and_user_take_picture(String screenshotname) throws Exception {

		Screenshot(screenshotname);
	}

	@Then("user click the Approve button to generate the Sale order number")
	public void user_click_the_approve_button_to_generate_the_sale_order_number() throws Exception {
		quotation.SaleOrderNumber();

	}

	@Then("user takes picture {string}")
	public void user_takes_picture_(String name) throws Exception {
		Screenshot(name);
	}

	@Then("user click create Invoice button and fill the mandatory fields")
	public void user_click_create_Invoice_button_and_fill_the_mandatory_fields() throws Exception {
		quotation.InvoiceNumberDetails();

	}

	@Then("user should click save button and validate button")
	public void user_should_click_save_button_and_validate_button() throws Exception {
		quotation.Invoicenumber();
	}

	@Then("Invoice number is generated and user take picture {string}")
	public void Invoice_number_is_generated_and_user_take_picture(String screenname) throws Exception {
		Screenshot(screenname);
		Thread.sleep(5000);
		d.close();
	}

	@Then("the user without fills the field and clicks the save button")
	public void the_user_without_fills_the_field_and_clicks_the_save_button() throws Exception {
		quotation.QuotationNegativeScenario();

	}

	@Then("takes the picture as {string} and close the Browser")
	public void takes_the_picture_as_and_close_the_browser(String negative) throws Exception {
		Screenshot(negative);
		Thread.sleep(5000);
		d.quit();
	}

}
