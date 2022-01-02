package com.orangehrm.hybridframework_testCases;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.orangehrm.hybridframework_pageObject.DashboardPage;
import com.orangehrm.hybridframework_pageObject.LoginPage;
import com.orangehrm.hybridframework_testBase.TestBase;

public class LoginTC02 extends TestBase {

	@Test 
	
	public void loginToOrangeHrmTC02() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		
		String uname = excelDataProvider.getStringCellData(0, 1, 0);
		String pwd = excelDataProvider.getStringCellData(0, 1, 1);
		System.out.println(uname+"   "+pwd);
		
	     lp.setUserName(uname);
	     lp.setPassword(pwd);
	     
	     DashboardPage dp = lp.clickOnLoginBtn();

			
		if(driver.findElement(By.xpath("//a[@id='menu_dashboard_index']")).isDisplayed()) {
			Assert.assertTrue(true);
			Thread.sleep(3000);
			dp.logoutOrangeHRM();
			
		
	} else {
			Assert.assertTrue(false, "Dashboard page title not contains Orange text");
		}
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		