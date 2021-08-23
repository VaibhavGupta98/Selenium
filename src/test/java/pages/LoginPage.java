package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	
	@FindBy(xpath="/html/body/div[1]/header/div/nav/div/div/a") WebElement loginButton;
	
	@FindBy(name="email1") WebElement user;
	
	@FindBy(name="password") WebElement pass;
	
	@FindBy(xpath= "//*[@id='ui']/div/div/form/div/div[3]") WebElement login;
	
	
	public void login(String username, String password) throws InterruptedException
	{
		loginButton.click();
		Thread.sleep(4000);
		
		user.sendKeys(username);
		pass.sendKeys(password);
		
		login.click();
	}

}
