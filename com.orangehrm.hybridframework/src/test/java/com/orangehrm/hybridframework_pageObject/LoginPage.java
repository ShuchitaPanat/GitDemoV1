package com.orangehrm.hybridframework_pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	// Object Repository
	
	@FindBy(name = "txtUsername") 
	@CacheLookup
	WebElement username;

	@FindBy(name = "txtPassword")
	@CacheLookup
	WebElement password;

	@FindBy(id = "btnLogin")
	@CacheLookup
	WebElement loginBtn;
	
	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String uname) {
		try {
			username.sendKeys(uname);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public void setPassword(String pwd) {
		try {
			password.sendKeys(pwd);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public DashboardPage clickOnLoginBtn() {
		try {
			loginBtn.click();
			return new DashboardPage(driver);
		} 
		catch (Exception e) {
			return null;
		}
	}
}
