package com.learnautomation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.learnautomation.main.MainTest;

public class BrowserFactory extends MainTest {
	
	@SuppressWarnings("deprecation")
	public static WebDriver invokeapp(WebDriver driver, String browserName, String appURL)
	{
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.firefox.marionette", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		return driver;
		}
	
	public static void quitBrowser(WebDriver driver) {
		driver.close();
	}
	
}
