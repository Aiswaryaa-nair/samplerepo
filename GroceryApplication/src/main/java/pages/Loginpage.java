package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	
		public WebDriver driver;
	public	Loginpage(WebDriver driver) {
		
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(name="username") WebElement username;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath = "//button[text()='Sign In']") WebElement login;
	@FindBy(xpath="//p[text()='Dashboard']") WebElement dashboard;
	@FindBy(xpath="//b[text()='7rmart supermarket']") WebElement text;
	public void verifyValidUsernameonUsernamefield(String usernamevalue)
	{
		username.sendKeys(usernamevalue);
	}
	public void verifyValidPasswordonPasswordfield(String passwordvalue)
	{
		password.sendKeys(passwordvalue);
	}
	public void clickLoginButton()
	{
		login.click();
	}
	public boolean isDashboardDisplayed() {
		return dashboard.isDisplayed();
	}
	public String isTitleDisplayed() {
		return text.getText();
	}
	}