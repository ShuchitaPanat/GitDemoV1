package com.orangehrm.hybridframework_testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.hybridframework_pageObject.DashboardPage;
import com.orangehrm.hybridframework_pageObject.LoginPage;
import com.orangehrm.hybridframework_testBase.TestBase;

public class DashboardTC extends TestBase {
	
	
	@Test
	
	public void logoutOrangeHRM(){
		
		LoginPage lp =	new LoginPage(driver);
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		DashboardPage hp = lp.clickOnLoginBtn();
		
		if(driver.findElement(By.xpath("//a[@id='menu_dashboard_index']")).isDisplayed()) {
			Assert.assertTrue(true);
			hp.logoutOrangeHRM();
		
	} else {
			Assert.assertTrue(false, "Dashboard page title not contains Orange text");
		}
		
	}
	
	
	

}
