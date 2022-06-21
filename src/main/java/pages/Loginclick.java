package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginclick {
	WebDriver d ;
	public Loginclick(WebDriver d) {
		this.d = d;
		PageFactory.initElements(d, this);
		
	}
	
	@FindBy(xpath = "//input[@id='login']")
	WebElement Username;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement Password;
	
	@FindBy(xpath = "//button[text()='Log in']")
	WebElement LoginButton;
	
	public void EnterApplication() throws Exception {
		
		Username.sendKeys("admin");
		Password.sendKeys("admin@321");
		Thread.sleep(3000);
		LoginButton.click();
		Thread.sleep(5000);
	}
}
