package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.HomePage;
import pages.Loginpage;
import utilities.ExcelUtility;

public class HomeTest extends Base{
@Test
public void verifyUserisabletoSuccessfullyLoggedoutCredentials() throws IOException {
	String userNameValue=ExcelUtility.readStringData(0, 0, "LoginPage");
	String passwordValue=ExcelUtility.readStringData(0, 1, "LoginPage");
	Loginpage loginpage=new Loginpage(driver);
	loginpage.verifyValidUsernameonUsernamefield(userNameValue);
	loginpage.verifyValidPasswordonPasswordfield(passwordValue);
	loginpage.clickLoginButton();
	HomePage home=new HomePage(driver);
	home.clickOnadminButton();
	home.clickOnLoginoutButton();
	home.clickOnMoreInfo();
	
}
@Test
public void verifyisGetInfoisClicked() throws IOException {
	String userNameValue=ExcelUtility.readStringData(0, 0, "LoginPage");
	String passwordValue=ExcelUtility.readStringData(0, 1, "LoginPage");
	Loginpage loginpage=new Loginpage(driver);
	loginpage.verifyValidUsernameonUsernamefield(userNameValue);
	loginpage.verifyValidPasswordonPasswordfield(passwordValue);
	loginpage.clickLoginButton();
	HomePage home=new HomePage(driver);
	home.clickOnMoreInfo();
}
}
