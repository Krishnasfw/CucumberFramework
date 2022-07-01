package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CustomerObjects {
	
	public WebDriver d;
	public CustomerObjects(WebDriver d1) {
		this.d = d1;
		PageFactory.initElements(d1, this);	
	}
	
	@FindBy(xpath ="//*[@id=\"oe_main_menu_placeholder\"]/ul[1]/li[2]/a")
	WebElement Sales;
	
	@FindBy(xpath =	"/html/body/div[2]/table/tbody/tr/td[1]/div/div[1]/div/div/div[2]/ul[1]/li[2]/a")
	WebElement Customers;
	
	public void Create() throws Exception {
		Thread.sleep(3000);
		Sales.click();
		Thread.sleep(3000);
		Customers.click();
	}
	
	@FindBy(xpath = "//button[@class='oe_kanban_button_new oe_highlight']")
	WebElement CreateCustomer;
	
	public void CustomerCreates() throws Exception {
		Thread.sleep(2000);
		CreateCustomer.click();
	}
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement Name; 
	
	@FindBy(xpath = "//input[@placeholder='Street...']")
	WebElement Street;
		
	@FindBy(xpath = "//input[@placeholder='City']")
	WebElement City;
	
	@FindBy(xpath = "//input[@placeholder='ZIP']")
	WebElement Zip;
	
	@FindBy(xpath = "//input[@placeholder='State']")
	WebElement State;
	 
	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/div/div/div/div/div/div[4]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[9]/td[2]/span/div/input")
	WebElement PartnerLed;
	
	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/div/div/div/div/div/div[4]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[2]/table/tbody/tr[9]/td[2]/span/div/input")
	WebElement Vertical;
	
	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/div/div/table/tbody/tr[2]/td[1]/div/div[2]/span[2]/button")
	WebElement SaveButton;
	
	public void Enter() throws AWTException, Exception {
		Name.sendKeys("Video Game Kadai");
		Street.sendKeys("Computer Thidal");
		City.sendKeys("Vilaiyatu Maidhanam");
		Zip.sendKeys("600028");
		State.click();
		State.sendKeys("Tamil Nadu");
		
		
		Thread.sleep(2000);
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		
		Vertical.click();
		Vertical.sendKeys("Outdoor Parks");
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		SaveButton.click();
		Thread.sleep(5000);
	}
	
	public void NegativeScenario() throws Exception {
		Thread.sleep(3000);
		SaveButton.click();
	}
	

}
