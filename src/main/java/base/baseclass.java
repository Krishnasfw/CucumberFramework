package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import pages.CustomerObjects;
import pages.DatabaseSelectionObjects;
import pages.LoginObjects;
import pages.Loginclick;
import pages.PurchaseObjects;
import pages.QuotationObjects;


public class baseclass {
	
	public WebDriver d ;
	public LoginObjects login;
	public DatabaseSelectionObjects data;
	public Loginclick loginclick;
	public CustomerObjects pageclass ;
	public QuotationObjects quotation ;
	public PurchaseObjects purchase ;
	
	public Properties Configproperties() throws IOException {
		Properties properties = new Properties();
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");
		properties.load(file);
		return properties;
	}

	public void Screenshot(String Screenshot) throws Exception {
		File file = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		File path = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\Semnox\\Screenshot\\" + Screenshot + "_" + timestamp + ".png");
		FileUtils.copyFile(file, path);
	}
	
	

}
