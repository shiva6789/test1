package automation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotCapturing {
	static WebDriver driver;

	public static void main(String[] args) throws IOException 
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File ("D:\\Selenium Driver\\kony.png"));
		
				
		
	}

}
