package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/Selenium Driver/sample.html");
		driver.findElement(By.id("button1")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("username")).sendKeys("test");
		//driver.switchTo().alert().accept();	
		
	}
	

}
