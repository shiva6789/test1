package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_top']")));
		 driver.switchTo().frame("frame-middle");
		 String sData =driver.findElement(By.id("content")).getText();
		 System.out.println(sData);

	}

}
