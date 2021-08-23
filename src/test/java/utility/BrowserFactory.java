package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	WebDriver driver;
	
	
	
	public static WebDriver startApplication(WebDriver driver ,String browserName, String appURL)
	{
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("Firefox"))
		{
			// Start a Firefox driver
			System.setProperty("webdriver.chrome.driver", "./Drivers/geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else
		{
			System.out.println("Browser not supported");
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(appURL);
		
		return driver;
		
	}
	
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}

}
