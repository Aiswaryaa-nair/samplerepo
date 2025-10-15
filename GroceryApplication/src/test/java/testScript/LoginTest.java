package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;

import pages.Loginpage;

import utilities.ExcelUtility;


	

	public class LoginTest extends 	Base 
	{
		@Test
		public void verifyUserwithValidCredentials() throws IOException
		{
			String usernamevalue = ExcelUtility.readStringData(0,0,"loginpage");
			String passwordvalue = ExcelUtility.readStringData(0,1,"loginpage");
			
			Loginpage loginpage = new Loginpage(driver);
			loginpage.verifyValidUsernameonUsernamefield(usernamevalue);
			loginpage.verifyValidPasswordonPasswordfield(passwordvalue);
			loginpage.clickLoginButton();
			Boolean dashboardDisplyed=loginpage.isDashboardDisplayed();
			Assert.assertTrue(dashboardDisplyed,"User was unable to login with valid credentials");
		}
		@Test
		public void verifyInvalidusernameandValidPassword() throws IOException {
			String usernamevalue = ExcelUtility.readStringData(1, 0, "loginpages");
			String passwordvalue = ExcelUtility.readStringData(1, 1, "loginpages");
			
			Loginpage loginpage = new Loginpage(driver);
			loginpage.verifyValidUsernameonUsernamefield(usernamevalue);
			loginpage.verifyValidPasswordonPasswordfield(passwordvalue);
			loginpage.clickLoginButton();
			String expected="7rmart supermarket";
			String actual=loginpage.isTitleDisplayed();
			Assert.assertEquals(actual,expected ,"user is able to login");
		}
		@Test
		public void verifyValidusernameandInvalidPassword() throws IOException {
			String usernamevalue = ExcelUtility.readStringData(2, 0, "loginpages");
			String passwordvalue = ExcelUtility.readStringData(2, 1, "loginpages");
			
			Loginpage loginpage = new Loginpage(driver);
			loginpage.verifyValidUsernameonUsernamefield(usernamevalue);
			loginpage.verifyValidPasswordonPasswordfield(passwordvalue);
			loginpage.clickLoginButton();
		}
		@Test
		public void verifyINalidusernameandInvalidPassword() throws IOException {
			String usernamevalue = ExcelUtility.readStringData(3, 0, "loginpages");
			String passwordvalue = ExcelUtility.readStringData(3, 1, "loginpages");
			
			Loginpage loginpage = new Loginpage(driver);
			loginpage.verifyValidUsernameonUsernamefield(usernamevalue);
			loginpage.verifyValidPasswordonPasswordfield(passwordvalue);
			loginpage.clickLoginButton();
		}	
		
	}