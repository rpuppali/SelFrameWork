package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.learnautomation.utility.BrowserFactory;

public class LoginPage {
     WebDriver driver;
	 
	 public LoginPage(WebDriver ldriver)
	 {
		 this.driver = ldriver;
	 }
	 
	 @FindBy(name ="username") WebElement uname;
	 
	 @FindBy(name ="password") WebElement pass;
	 
	 @FindBy(xpath ="//button[@type='submit']") WebElement loginButton;
	 
	 public void loginToCRM(String unameapp, String passapp)
	 {
		 uname.sendKeys(unameapp);
		 uname.sendKeys(passapp);
		 loginButton.click();

	 }
	 
}
