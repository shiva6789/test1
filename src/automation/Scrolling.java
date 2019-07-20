package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Scrolling {

	static WebDriver driver;

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//top to botton scrolling 
		js.executeScript("window.scrollBy(0,1000)","");
		
		
	}

}
