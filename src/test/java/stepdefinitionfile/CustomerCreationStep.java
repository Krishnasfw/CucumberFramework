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
import pages.CustomerObjects;


public class CustomerCreationStep extends baseclass{
	
	@Given("user open the application and navigates to home page")
	public void user_open_the_application_and_navigates_to_home_page() throws Exception {
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
	public void the_user_is_successfully_created_the_customer_information_and_take_picture(String screenshot) throws Exception {
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


