package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DatabaseSelectionObjects {
	WebDriver d;
	public DatabaseSelectionObjects(WebDriver d) {
		this.d =d ;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath = "//select[@id='db']")
	WebElement Databaseselection;
	
	public void Database() throws Exception {
		Thread.sleep(5000);
		Select dropdown = new Select(Databaseselection);
		dropdown.selectByIndex(3);
		Thread.sleep(2000);
	}

}
