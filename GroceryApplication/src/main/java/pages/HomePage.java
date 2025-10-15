package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	//create constructor
	
	 public HomePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	 
	
	 @FindBy(xpath="//img[contains(@src,'com/public/assets/admin/dist/img/avatar5.png')]") private WebElement adminbtn;
	 @FindBy(xpath="//a[contains(@href,'com/admin/logout')and @class='dropdown-item']") private  WebElement logoutbtn;
	 @FindBy(xpath="//a[contains(@href,'com/admin/list-admin')and @class='small-box-footer']") private WebElement moreinfoobutton;
	 public void clickOnadminButton() {
		 adminbtn.click();
	 }
	 public void clickOnLoginoutButton() {
		 logoutbtn.click();
	 }
	 public void clickOnMoreInfo() {
		 moreinfoobutton.click();
	 }
}
