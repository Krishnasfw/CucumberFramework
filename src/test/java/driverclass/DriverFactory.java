package driverclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver d ;
	public static ThreadLocal<WebDriver> threadlocalDriver = new ThreadLocal<WebDriver>();
	
	public WebDriver initdriver(String browser) {
		System.out.println("browser value is :" + browser);
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			threadlocalDriver.set(new ChromeDriver());
		}

		else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			threadlocalDriver.set(new FirefoxDriver());
		}
		else if (browser.equals("safari")) {
			threadlocalDriver.set(new SafariDriver());
		}
		
		else {
			System.out.println("Please the Browser that you passed : "+ browser );
		}
		return d;
	
	
	
	}

	public WebDriver getD() {
		return threadlocalDriver.get();
	}

	
	}

