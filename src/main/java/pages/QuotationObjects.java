package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class QuotationObjects{
	
	public WebDriver d ;
	public QuotationObjects(WebDriver d) {
		this.d = d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath ="//*[@id=\"oe_main_menu_placeholder\"]/ul[1]/li[2]/a")
	WebElement Sales;
		
	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[1]/div/div[1]/div/div/div[2]/ul[1]/li[5]/a")
	WebElement Quotation;
		
	public void Quotationpage() throws Exception {
		Thread.sleep(3000);
		Sales.click();
		Thread.sleep(3000);
		Quotation.click();
		Thread.sleep(5000);
	}
	
	@FindBy(xpath = "//button[@class='oe_button oe_list_add oe_highlight']")
	WebElement CreateQuotation ;
		
		public void CreateQuotationDetails() throws Exception {
		Thread.sleep(5000);
		CreateQuotation.click();
		Thread.sleep(5000);
		}
		
		@FindBy(xpath ="/html/body/div[2]/table/tbody/tr/td[2]/div/div/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/span/div/span[2]/img" )
		WebElement CustomerSelection;
		
		@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/div/div/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[9]/td[2]/span/div/span[2]")
		WebElement DealType;
		
		@FindBy(xpath = "//select[@name='installation_required']")
		WebElement Dropdown;
		
		@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/div/div/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[2]/table/tbody/tr[7]/td[2]/span/div/span[2]/img")
		WebElement PriceList;
		
		@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/div/div/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[2]/table/tbody/tr[13]/td[2]/span/div/input")
		WebElement SalesTeam;
		
		@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/div/div/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/div[2]/div[1]/div[1]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td/a")
		WebElement AddItemButton;
		
		@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/div/div/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/div[2]/div[1]/div[1]/div/div/div/div/div[2]/div/div/div/div[4]/div/div/span[6]/div/input")
		WebElement Productfield;
		
		@FindBy(xpath = "//span[text()='Ok']")
		WebElement AlertAccept;
		
		@FindBy(xpath = "//td[text()='0.00000']")
		WebElement UnitPrice;
		
		@FindBy(xpath = "//td[@data-field='tax_id']")
		WebElement Taxes;
		
		@FindBy(xpath = "//select[@name='line_discount_type']")
		WebElement DiscountDropDown;
		
		@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/div/div/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/div[2]/ul/li[2]/a")
		//               /html/body/div[2]/table/tbody/tr/td[2]/div/div/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/div[2]/ul/li[2]/a
		WebElement OtherInfobutton;
		
		@FindBy(xpath = "//textarea[@name='description_content']")
		WebElement Description;
		
		@FindBy(xpath = "//button[@accesskey='S']")
		WebElement SaveButton;
		
		@FindBy(xpath = "//span[text()='(update)']")
		WebElement UpdateButton;
		
		@FindBy(xpath = "//span[text()='Send for Approval']")
		WebElement SendforApprovalButton;
		public void QuotationNumber() throws Exception {
			Thread.sleep(5000);
		CustomerSelection.click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		
		DealType.click();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		Select element = new Select(Dropdown);
		element.selectByIndex(1);
		Thread.sleep(2000);
		
		PriceList.click();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		SalesTeam.sendKeys("Purchase and Delivery");
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("scrollBy(0,5000)");
		Thread.sleep(5000);
		AddItemButton.click();
		Thread.sleep(2000);
		Productfield.click();
		Thread.sleep(2000);
		Productfield.sendKeys("[CONMRMC5PINSHRDBTM] Connector - 5 pin RMC-SHROUDED White - Female with Wire");
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		AlertAccept.click();
		
		Thread.sleep(3000);
		UnitPrice.click();
		Thread.sleep(5000);
		
		robot.keyPress(KeyEvent.VK_1);
		robot.keyRelease(KeyEvent.VK_1);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_2);
		robot.keyPress(KeyEvent.VK_5);
		robot.keyRelease(KeyEvent.VK_5);
		robot.keyPress(KeyEvent.VK_0);
		robot.keyRelease(KeyEvent.VK_0);
		Thread.sleep(1000);		
		Thread.sleep(15000);
		OtherInfobutton.click();
		Thread.sleep(5000);
		Description.sendKeys("Sample Product");
		Thread.sleep(10000);
		SaveButton.click();
		
		}
		
		public void QuotationnumberGenerate() throws Exception {
		Thread.sleep(5000);
		SendforApprovalButton.click();
		Thread.sleep(8000);
	}
		
		@FindBy(xpath = "//span[text()='Approve']")
		WebElement ApproveButton;
		
		@FindBy(xpath = "//span[text()='Confirm Sale']")
		WebElement ConfirmSaleButton;
		
		
		public void SaleOrderNumber() throws Exception {
			Thread.sleep(3000);
			ApproveButton.click();
			Thread.sleep(5000);
			ConfirmSaleButton.click();
			Thread.sleep(12000);
		}
		
		@FindBy(xpath = "//span[text()='Create Invoice']")
		WebElement CreateInvoiceButton;
		
		@FindBy(xpath = "//span[text()='Create and View Invoice']")
		WebElement CreateandViewInvoiceButton;
		
		@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr[2]/td[1]/div/div/span[1]/div/button")
		//				 
		WebElement Editbutton;
		
		@FindBy(xpath = "//select[@name='document_typ']")
		WebElement Documenttype;
		
		@FindBy(xpath = "//select[@name='supply_type_code']")
		WebElement SupplyType;
		
		@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/div/div[2]/div/div/div/div[2]/div/div[4]/div/div/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[2]")
		WebElement IsServiceClick;
		
		@FindBy(xpath = "//select[@name='is_service']")
		WebElement ISservice;
				
		@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr[2]/td[1]/div/div/span[2]/button")
		WebElement InvoiceSaveButton;
		
		@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/div/div[2]/div/div/div/div[2]/div/div[4]/div/div/header/button[5]")
		WebElement ValidateButton;
		public void InvoiceNumberDetails() throws Exception {
			Thread.sleep(2000);
			CreateInvoiceButton.click();
			Thread.sleep(15000);
			CreateandViewInvoiceButton.click();
			Thread.sleep(15000);
			
			Editbutton.click();
			Thread.sleep(5000);
			Select doctype = new Select(Documenttype);
			doctype.selectByIndex(3);
			Thread.sleep(5000);
			Select supplytype = new Select(SupplyType);
			supplytype.selectByIndex(1);
			Thread.sleep(10000);
			JavascriptExecutor js = (JavascriptExecutor)d;
			js.executeScript("scrollBy(0,5000)");
			Thread.sleep(10000);
			IsServiceClick.click();
			Thread.sleep(5000);
			Select service = new Select(ISservice);
			service.selectByIndex(1);
			Thread.sleep(5000); 
		}
			public void Invoicenumber() throws Exception {
			Thread.sleep(5000);
			InvoiceSaveButton.click();
			Thread.sleep(5000);
			ValidateButton.click();
			Thread.sleep(4000);
}
			public void QuotationNegativeScenario() throws Exception {
				Thread.sleep(6000);
				SaveButton.click();
				Thread.sleep(2000);
				
				
			}

		
}