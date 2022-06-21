package stepdefinitionfile;

import org.openqa.selenium.chrome.ChromeDriver;
import base.baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CustomerObjects;
import pages.DatabaseSelectionObjects;
import pages.LoginObjects;
import pages.Loginclick;

public class CustomerCreationStep extends baseclass {

	@Given("user open the application and navigates to home page")
	public void user_open_the_application_and_navigates_to_home_page() throws Exception {
		System.setProperty("webdriver.chrome.driver", Configproperties().getProperty("driverpath"));
		d = new ChromeDriver();
		d.get(Configproperties().getProperty("url"));
		d.manage().window().maximize();
		Thread.sleep(3000);

		login = new LoginObjects();
		login.LoginApplication();
		Thread.sleep(2000);
		data = new DatabaseSelectionObjects(d);
		data.Database();
		Thread.sleep(2000);
		loginclick = new Loginclick(d);
		loginclick.EnterApplication();
	}

	@Given("user navigates to Sales module and click Customer button")
	public void user_navigates_to_sales_module_and_click_customer_button() throws Exception {
		Thread.sleep(8000);
		pageclass = new CustomerObjects(d);
		pageclass.Create();
	}

	@When("user click create button")
	public void user_click_create_button() throws Exception {
		Thread.sleep(8000);
		pageclass.CustomerCreates();

	}

	@Then("user fills the field and clicks the save button")
	public void user_fills_the_field_and_clicks_the_save_button() throws Exception {
		Thread.sleep(8000);

		pageclass.Enter();

	}

	@Then("user without fills the field and clicks the save button")
	public void user_without_fills_the_field_and_clicks_the_save_button() throws Exception {
		Thread.sleep(5000);
		pageclass.NegativeScenario();
	}

	@Then("the user is successfully created the Customer information and take picture {string}")
	public void the_user_is_successfully_created_the_customer_information_and_take_picture(String screenshot)
			throws Exception {
		Thread.sleep(3000);
		System.out.println("The User is Successfully Created the Customer Information");
		Screenshot(screenshot);
	}

	@Then("take picture {string}")
	public void take_picture(String screenshot) throws Exception {
		Thread.sleep(1000);
		Screenshot(screenshot);
		System.out.println("Please fill the Valid Details");
	}

	@Then("the browser should close")
	public void the_browser_should_close() throws Exception {
		Thread.sleep(5000);
		d.close();
	}

}
