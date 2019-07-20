package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/Selenium Driver/sample.html");
		String CurrentBrowser =driver.getWindowHandle();
		String newBrowser="";
		driver.findElement(By.linkText("Yahoo")).click();
		Set <String> allBrowser =driver.getWindowHandles();
		System.out.println("current title"+driver.getTitle());
		
		for (String s: allBrowser)
		{
			
			if (!s.equals(CurrentBrowser))
					{
				newBrowser =s;
				break;
					}
			
					}
driver.switchTo().window(newBrowser);
System.out.println("new title"+driver.getTitle());
		
	}
}