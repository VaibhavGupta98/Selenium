package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import BaseClass.BaseClass;
import pages.LoginPage;
import utility.BrowserFactory;
import utility.ExcelDataProvider;
import utility.Helper;

public class LoginTest extends BaseClass {
	 
	@Test
	public void loginApp() throws InterruptedException
	{
		
		LoginPage loginPage =PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.login(excel.getStringData("Sheet1", 0, 0), excel.getStringData("Sheet1", 0, 1));	
		
		Helper.captureScreenshot(driver);
		
	}
	
}
