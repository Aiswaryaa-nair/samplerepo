package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.Loginpage;
import utilities.ExcelUtility;

public class AdminUserTest extends 	Base {

	@Test
	public void isUserIsAbleToRegisterNewUser() throws IOException {
		String usernamevalue = ExcelUtility.readStringData(0,0,"loginpage");
		String passwordvalue = ExcelUtility.readStringData(0,1,"loginpage");
		
		Loginpage loginpage = new Loginpage(driver);
		loginpage.verifyValidUsernameonUsernamefield(usernamevalue);
		loginpage.verifyValidPasswordonPasswordfield(passwordvalue);
		loginpage.clickLoginButton();
		HomePage home=new HomePage(driver);
		home.clickOnMoreInfo();
		AdminUsersPage userpage=new AdminUsersPage(driver);
		String newusernamevalue = ExcelUtility.readStringData(0,0,"adminuser");
		String newpasswordvalue = ExcelUtility.readStringData(0,1,"adminuser");

		userpage.clickaddButton();
		userpage.enterUsername(newusernamevalue);
		userpage.enterPassword(newpasswordvalue);
		userpage.selectDashboard();
		userpage.clickSubmit();
		Boolean alertdisplay=userpage.isalertDisplayed();
		System.out.println(alertdisplay);
		Assert.assertTrue(alertdisplay,"user is not able to add new user");
	}
	@Test
	
	public void isUserIsAbleToSearchtheUser() throws IOException
	{
		String usernamevalue = ExcelUtility.readStringData(0,0,"loginpage");
		String passwordvalue = ExcelUtility.readStringData(0,1,"loginpage");
		
		Loginpage loginpage = new Loginpage(driver);
		loginpage.verifyValidUsernameonUsernamefield(usernamevalue);
		loginpage.verifyValidPasswordonPasswordfield(passwordvalue);
		loginpage.clickLoginButton();
		HomePage home=new HomePage(driver);
		home.clickOnMoreInfo();
		AdminUsersPage userpage=new AdminUsersPage(driver);
		String newuser = ExcelUtility.readStringData(0,0,"adminuser");
		userpage.clickOnSearchButton();
		userpage.serachcurrentuser(newuser);
		userpage.selecttype();
		userpage.clickSearch();
		
	}
	@Test
	public void userisAbleToReset() throws IOException {
		String usernamevalue = ExcelUtility.readStringData(0,0,"loginpage");
		String passwordvalue = ExcelUtility.readStringData(0,1,"loginpage");
		
		Loginpage loginpage = new Loginpage(driver);
		loginpage.verifyValidUsernameonUsernamefield(usernamevalue);
		loginpage.verifyValidPasswordonPasswordfield(passwordvalue);
		loginpage.clickLoginButton();
		HomePage home=new HomePage(driver);
		home.clickOnMoreInfo();
		AdminUsersPage userpage=new AdminUsersPage(driver);
		userpage.clickResetButton();
	}
}
