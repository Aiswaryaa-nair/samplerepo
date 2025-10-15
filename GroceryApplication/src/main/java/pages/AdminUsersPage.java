package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUsersPage {
	public WebDriver driver;
	
	
	 public AdminUsersPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	 @FindBy(xpath="//a[contains(@href,'javascript:void(0)')and contains(@class,'btn-danger')]")  WebElement addbtn;
	 @FindBy(id="username")  WebElement usernameTextField;
	 @FindBy(id="password") WebElement passwordField;
	 @FindBy(id="user_type") WebElement dropdown;
	 @FindBy(name="Create") WebElement submitbtn;
	 @FindBy(className="close")	WebElement alert; 
	 
	 
	 public void clickaddButton() {
		 addbtn.click();
	 }
	 
	 public void enterUsername(String newusernamevalue)
		{
		 usernameTextField.sendKeys(newusernamevalue);
		}
	 
	 public void enterPassword(String newpasswordvalue) {
		 passwordField.sendKeys(newpasswordvalue);
	 }
	 
	 public void selectDashboard() {
		 Select select = new Select(dropdown);
		 select.selectByVisibleText("Admin");
	 }
	 public void clickSubmit() {
		submitbtn.click(); 
	 }
	 public boolean isalertDisplayed() {
		 return alert.isDisplayed();
	 }
	 @FindBy(xpath="//a[contains(@href,'javascript:void(0)')and contains(@class,'btn-primary')]") WebElement serachbtn;
	 @FindBy(id="un") WebElement searchuser;
	 @FindBy(id="ut") WebElement type;
	 @FindBy(name="Search") WebElement btnSerach;
	 
	 public void clickOnSearchButton() {
		 serachbtn.click();
	 }
	 public void serachcurrentuser(String newuser) {
		 searchuser.sendKeys(newuser);
	 }
	 public void selecttype() {
		 Select select = new Select(type);
		 select.selectByVisibleText("Admin"); 
	 }
	 public void clickSearch() {
		 btnSerach.click();
	 }
	 
	 @FindBy(xpath="//a[contains(@href,'com/admin/list-admin')and contains(@class,'btn-warning')]") WebElement resetBtn;
	 
	 public void clickResetButton() {
		 resetBtn.click();
	 }
}
