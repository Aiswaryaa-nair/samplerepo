package automationcore;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import utilities.ScreenshotUtility;

public class Base {
	
		public WebDriver driver;
		@BeforeMethod
		public void initializeBrowser() {
			driver = new ChromeDriver(); // initialize web driver (CHROME HERE)
		//	driver=new FirefoxDriver(); call browser Fire fox
		  //  driver=new EdgeDriver();
		/*	WebDriverManager.edgedriver() .clearResolutionCache()
			 .forceDownload().setup();
			driver= new EdgeDriver();*/
			driver.get("https://groceryapp.uniqassosiates.com/admin/login/");//get the page in minimized form
			driver.manage().window().maximize();//to maximize the window
			}
		@AfterMethod
		public void closeBrowser(ITestResult itestresult) throws IOException{
			if(itestresult.getStatus()==ITestResult.FAILURE) {
				ScreenshotUtility screenshotutility=new ScreenshotUtility();
				screenshotutility.getScreenshot(driver, itestresult.getName());
			}
			 // driver.close();
			//driver.quit();
		}
		}