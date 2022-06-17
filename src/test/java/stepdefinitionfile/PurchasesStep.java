package stepdefinitionfile;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import base.baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PurchaseObjects;

public class PurchasesStep extends baseclass {
	
	@Given("the user should opens application and navigates to home page")
	public void the_user_should_opens_application_and_navigates_to_home_page() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
					d = new ChromeDriver();
					d.get("https://test-semnox.p7devs.com/");
					d.manage().window().maximize();
					Thread.sleep(3000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_P);
			robot.keyRelease(KeyEvent.VK_P);
			robot.keyPress(KeyEvent.VK_I);
			robot.keyRelease(KeyEvent.VK_I);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_N);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_N);
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_A);
			robot.keyPress(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_C);
			robot.keyPress(KeyEvent.VK_L);
			robot.keyRelease(KeyEvent.VK_L);
			robot.keyPress(KeyEvent.VK_E);
			robot.keyRelease(KeyEvent.VK_E);
			Thread.sleep(2000);
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			
			robot.keyPress(KeyEvent.VK_K);
			robot.keyRelease(KeyEvent.VK_K);
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_J);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_J);
			robot.keyPress(KeyEvent.VK_F);
			robot.keyRelease(KeyEvent.VK_F);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_N);
			robot.keyPress(KeyEvent.VK_Y);
			robot.keyRelease(KeyEvent.VK_Y);
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_L);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_L);
			robot.keyPress(KeyEvent.VK_7);
			robot.keyRelease(KeyEvent.VK_7);
			robot.keyPress(KeyEvent.VK_2);
			robot.keyRelease(KeyEvent.VK_2);
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_N);
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_2);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_2);
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_C);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_B);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_B);
			
			robot.keyPress(KeyEvent.VK_EQUALS);
			robot.keyRelease(KeyEvent.VK_EQUALS);
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_Z);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_Z);
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_T);
			//a.sendKeys("kJf-NyL72N@CsB={ZT");
			Thread.sleep(2000);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(2000);
			WebElement database = d.findElement(By.xpath("//select[@id='db']"));
			
			Select dropdown = new Select(database);
			dropdown.selectByIndex(2);
			Thread.sleep(2000);
		    d.findElement(By.xpath("//input[@id='login']")).sendKeys("admin");
		    d.findElement(By.xpath("//input[@id='password']")).sendKeys("admin@321");
		    Thread.sleep(2000);
		    d.findElement(By.xpath("//button[text()='Log in']")).click();
		    Thread.sleep(5000);
	   
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
	public void the_user_clicks_the_recieve_products_and_validate_the_invoice_it_generate_the_supplier_invoice_number() throws Exception {
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
		d.close();
	}


}
