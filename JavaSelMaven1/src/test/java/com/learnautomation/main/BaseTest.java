package com.learnautomation.main;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ConfigDataProvider;
import com.learnautomation.utility.Helper;

public class BaseTest {
	
	public WebDriver driver;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;
	
	
	@BeforeSuite
	public void dataFilesetUp()
	{
		config = new ConfigDataProvider();
		report = new ExtentReports();
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/report1"+ Helper.getCurrentDateTime()+".html");
		report.attachReporter(sparkReporter);
	
	}
	
	@BeforeClass
	public void setUp() throws InterruptedException
	{
		driver = BrowserFactory.invokeapp(driver, config.getBrowser(), config.getURL());
		Thread.sleep(2000);
	}
	@AfterClass
	public void teardown()
	{
		BrowserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		if(result.getStatus()== ITestResult.FAILURE) {
			Helper.captureScreenshot(driver);
		}	
		report.flush();
	
	}
	
}
