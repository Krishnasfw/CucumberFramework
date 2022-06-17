package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseObjects {
	
	public WebDriver d ;
	public PurchaseObjects(WebDriver d) {
		this.d = d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath = "/html/body/nav/div[2]/ul[1]/li[4]/a/span")
	WebElement PurchasesButton;
	
	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[1]/div/div[1]/div/div/div[4]/ul[1]/li[2]/a/span")
	WebElement PurchaseOrderButton;
		
	public void purchasepage() throws Exception {
		Thread.sleep(3000);
		PurchasesButton.click();
		Thread.sleep(3000);
		PurchaseOrderButton.click();
		Thread.sleep(5000);

		}
	
	@FindBy(xpath = "//button[@class='oe_button oe_list_add oe_highlight']")
	WebElement CreatePurchase;
	
	public void CreatePurchaseDetails() throws Exception {
		Thread.sleep(5000);
		CreatePurchase.click();
		Thread.sleep(5000);
		}
	
	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/div/div/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/span/div/input")
	WebElement SupplierSelection;
	
	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/div/div/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[5]/td[2]/span/div/input")
	WebElement Pricelist;
	
	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/div/div/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/div[3]/div[1]/div[1]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td/a")
	WebElement AddItemButton;
	
	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/div/div/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/div[3]/div[1]/div[1]/div/div/div/div/div[2]/div/div/div/div[4]/div/div/span[1]/div/input")
	WebElement Productfield;
	
	@FindBy(xpath = "//button[@accesskey='S']")
	WebElement SaveButton;
	
	@FindBy(xpath = "//span[text()='Send for Approval']")
	WebElement SendforApprovalButton;
	
	public void PurchaseQuotationNumber() throws Exception {
		Thread.sleep(2000);
		SupplierSelection.click();
		Thread.sleep(2000);
		SupplierSelection.sendKeys("Cloudtail India Private Limited-Tamil Nadu"); 
		Robot robot = new Robot();
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		
		Pricelist.click();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("scrollBy(0,5000)");
		Thread.sleep(5000);
		AddItemButton.click();
		Thread.sleep(2000);
		Productfield.click();
		Thread.sleep(2000);
		Productfield.sendKeys("[CONMRMC5PINSHRDBTM] Connector - 5 pin RMC-SHROUDED White - Female with Wire");
		Thread.sleep(2000);
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		SaveButton.click();
		Thread.sleep(5000);
	}
		public void PurchaseQuotationnumberGenerate() throws Exception {
			Thread.sleep(5000);
			SendforApprovalButton.click();
			Thread.sleep(8000);
		}
		
		@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/div/div/div/div/div/div[3]/div/div[4]/div/div/header/button[19]/span") 
		WebElement ApproveButton;
		
		public void PurchaseOrderNumberGenerate() throws Exception {
			Thread.sleep(3000);
			ApproveButton.click();
			Thread.sleep(8000);
		}
		
		@FindBy(xpath = "//span[text()='Receive Products']")
		WebElement RecieveProductsButton;
		
		@FindBy(xpath = "//span[text()='Receive']")
		WebElement RecieveButton;
		
		@FindBy(xpath = "//span[text()='Apply']")
		WebElement ApplyButton;
		
		@FindBy(xpath = "//span[text()='Create Invoice']")
		WebElement CreateInvoiceButton;
		
		@FindBy(xpath = "//span[text()='Create']")
		WebElement CreateButtonforSupplierInvoice;
		
		@FindBy(xpath = "//td[@title='Keep empty to use the current date']")
		WebElement DateClickbutton;
		
		@FindBy(xpath = "//span[text()='Validate']")
		WebElement ValidateButton;
		
		
		public void SupplierInvoiceNumberGenerate() throws Exception {
			Thread.sleep(5000);
			RecieveProductsButton.click();
			Thread.sleep(5000);
			RecieveButton.click();
			Thread.sleep(8000);
			ApplyButton.click();
			Thread.sleep(8000);
			CreateInvoiceButton.click();
			Thread.sleep(5000);
			CreateButtonforSupplierInvoice.click();
			Thread.sleep(10000);
			DateClickbutton.click();
			Thread.sleep(8000);
			ValidateButton.click();
			Thread.sleep(8000);
			
		}
		
		public void PurchaseNegativeCase() throws Exception {
			Thread.sleep(6000);
			SaveButton.click();
			Thread.sleep(2000);
		}
		
	}
	
	
	

