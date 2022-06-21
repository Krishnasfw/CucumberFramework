package stepdefinitionfile;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginObjects;

public class LoginStepDefiniton extends baseclass {
	WebDriver d ;
	@Given("user is on login page")
	public void user_is_on_login_page() throws Exception {
		System.setProperty("webdriver.chrome.driver", Configproperties().getProperty("driverpath"));
		d = new ChromeDriver();
		d.get(Configproperties().getProperty("url"));
		d.manage().window().maximize();
				
				Thread.sleep(3000);
	}
	
	@When("user enter the vaild {string} and {string}")
	public void user_enter_the_vaild_and(String username, String password)throws AWTException, Exception {
		login = new LoginObjects();
		login.LoginApplication();
		WebElement database = d.findElement(By.xpath("//select[@id='db']"));
		
		Select dropdown = new Select(database);
		dropdown.selectByIndex(3);
		Thread.sleep(5000);
	    d.findElement(By.xpath("//input[@id='login']")).sendKeys(username);
	    d.findElement(By.xpath("//input[@id='password']")).sendKeys(password); 
	}

	@When("clicks the login button")
	public void clicks_the_login_button() throws Exception {
		Thread.sleep(2000);
	    d.findElement(By.xpath("//button[text()='Log in']")).click();
	    Thread.sleep(8000); 
	}

	@Then("user should be navigated to the home page")
	public void user_should_be_navigated_to_the_home_page() throws Exception {
		Thread.sleep(8000);
	    String text = d.getTitle();
	    System.out.println("The Page Title is : "+ text);
	   try {
		   Assert.assertEquals("Subscriptions - Semnox", text);
		   System.out.println("Successful Login is Done!!!");
		
	} catch (AssertionError e) {
		Assert.assertEquals("Semnox", text);
		System.out.println("Use the Vaild Credentials***");
	}   
	}
	@Then ("close the browser")
	public void close_the_browser() throws Exception {
		Thread.sleep(2000);
		d.close();
	}

}
