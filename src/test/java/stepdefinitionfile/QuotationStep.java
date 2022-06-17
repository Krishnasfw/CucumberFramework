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
import pages.QuotationObjects;

public class QuotationStep extends baseclass {
	
	@Given("the user opens application and navigates to home page")
	public void the_user_opens_application_and_navigates_to_home_page() throws Exception {
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
		d.close();
	}

}
