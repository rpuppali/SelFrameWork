package com.learnautomation.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;

public class MainTest extends BaseTest {
	
	@Test
	public void loginApp() {
		
	
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.loginToCRM("admin", "admin12");		
		
		ExtentTest test1 = report.createTest("Logging to CRM)");
		test1.log(Status.PASS, "test case is passed");
		
		ExtentTest test2 = report.createTest("Logging to CRM)");
		test2.log(Status.FAIL, "test case is failed");
		
		ExtentTest test3 = report.createTest("Logging to CRM)");
		test3.log(Status.PASS, "test case is passed");
		
	
		//logger.

	}
}
