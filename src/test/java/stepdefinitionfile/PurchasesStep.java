package stepdefinitionfile;

import org.openqa.selenium.chrome.ChromeDriver;
import base.baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DatabaseSelectionObjects;
//import pages.LoginObjects;
import pages.Loginclick;
import pages.PurchaseObjects;

public class PurchasesStep extends baseclass {

	@Given("the user should opens application and navigates to home page")
	public void the_user_should_opens_application_and_navigates_to_home_page() throws Exception {
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
		loginclick = new Loginclick(d);
		loginclick.EnterApplication();

	}

	@Given("the user navigates to Purchases module and click Purchase Order button")
	public void the_user_navigates_to_purchases_module_and_click_purchase_order_button() throws Exception {
		purchase = new PurchaseObjects(d);
		purchase.purchasepage();
	}

	@When("the user should clicks the create button of Purchase Order module")
	public void the_user_should_clicks_the_create_button_of_purchase_order_module() throws Exception {
		purchase.CreatePurchaseDetails();
	}

	@Then("the user should enter the Information and clicks the save button")
	public void the_user_should_enter_the_information_and_clicks_the_save_button() throws Exception {
		purchase.PurchaseQuotationNumber();
	}

	@Then("the user clicks the Send For Approval button and takes the picture {string}")
	public void the_user_clicks_the_send_for_approval_button_and_takes_the_picture(String PQnumber) throws Exception {
		purchase.PurchaseQuotationnumberGenerate();
		Screenshot(PQnumber);
	}

	@Then("the user clicks the Approve button it generates the Purchase order Number")
	public void the_user_clicks_the_approve_button_it_generates_the_purchase_order_number() throws Exception {
		purchase.PurchaseOrderNumberGenerate();
	}

	@Then("the user takes picture as {string}")
	public void the_user_takes_picture_as(String POnumber) throws Exception {
		Screenshot(POnumber);
	}

	@Then("the user clicks the Recieve products and Validate the Invoice it Generate the Supplier Invoice Number")
	public void the_user_clicks_the_recieve_products_and_validate_the_invoice_it_generate_the_supplier_invoice_number()
			throws Exception {
		purchase.SupplierInvoiceNumberGenerate();
	}

	@Then("the user should take the picture as {string} and close the browser")
	public void the_user_should_take_the_picture_as_and_close_the_browser(String SuppInvoicenumber) throws Exception {
		Screenshot(SuppInvoicenumber);
		Thread.sleep(8000);
		d.close();
	}

	@Then("the user without enter the Information and clicks the save button")
	public void the_user_without_enter_the_information_and_clicks_the_save_button() throws Exception {
		purchase.PurchaseNegativeCase();
	}

	@Then("the user takes the Negative case picture as {string} and close the browser")
	public void the_user_takes_the_negative_case_picture_as_and_close_the_browser(String negative) throws Exception {
		Screenshot(negative);
		Thread.sleep(5000);
		d.quit();
	}

}
