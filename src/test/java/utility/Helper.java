package utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	// Screenshot, alerts, frames, windows, Sync issue, javascript executor
	
	
	public static void captureScreenshot(WebDriver driver)
	{
		File src=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		try {
			FileHandler.copy(src, new File("./Screenshots/Login" + getCurrentDateTime() + ".png"));
			
			System.out.println("Screenshot captured successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			System.out.println("Unable to capture screenshot");
			e.printStackTrace();
		}
	}
	
	public static String getCurrentDateTime()
	{
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		
		Date currentDate= new Date();
		
		return customFormat.format(currentDate);
	}
	
	
			

}
