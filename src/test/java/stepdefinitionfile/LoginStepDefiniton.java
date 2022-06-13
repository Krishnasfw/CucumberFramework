package stepdefinitionfile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefiniton  {
	WebDriver d ;
	@Given("user is on login page")
	public void user_is_on_login_page() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
				d = new ChromeDriver();
				d.get("https://test-semnox.p7devs.com/");
				d.manage().window().maximize();
				Thread.sleep(3000);
				
	}
	
	@When("user enter the vaild username and password")
	public void user_enter_the_vaild_username_and_password() throws AWTException, Exception {
		
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
	}

	@When("clicks the login button")
	public void clicks_the_login_button() throws Exception {
		Thread.sleep(2000);
	    d.findElement(By.xpath("//button[text()='Log in']")).click();
	    
	}

	@Then("user should be navigated to the home page")
	public void user_should_be_navigated_to_the_home_page() throws Exception {
		Thread.sleep(4000);
	    String text = d.getTitle();
	    System.out.println("The Page Title is : "+ text);
	    
	}
	@Then ("close the browser")
	public void close_the_browser() throws Exception {
		Thread.sleep(2000);
		d.close();
	}


	
}
