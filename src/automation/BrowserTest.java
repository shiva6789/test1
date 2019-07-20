package automation;

import org.openqa.grid.web.servlet.handler.WebDriverRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserTest {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		
		driver =new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","D:\\Selenium Driver\\geckodriver-v0.24.0-win64\\geckodriver.exe");	
		//driver =new FirefoxDriver();
		driver .get("https://demo.opencart.com/");
		String sTitle =driver.getTitle();
		System.out.println("Title is "+sTitle);
		if(sTitle.equalsIgnoreCase("Your Store"))
		{
			System.out.println("Page load verification passed");
		}
		
		else
		
		{
			System.out.println("Page load verification Failed");
		}	
		
		String sProductEntered ="Phone";
		String sQty ="3";
		driver.findElement(By.name("search")).sendKeys(sProductEntered);		
		driver.findElement(By.xpath("//div[@id='search']//button")).click();
		new Select (driver.findElement(By.name("category_id"))).selectByIndex(3);
		driver.findElement(By.name("sub_category")).click();
		driver.findElement(By.xpath("//img[@title='iPhone']")).click();
		driver.findElement(By.name("quantity")).clear();
		driver.findElement(By.name("quantity")).sendKeys(sQty);
		driver.findElement(By.id("button-cart")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("cart")).click();
		String sProductActual=driver.findElement(By.xpath("//div[@id='cart]/ui/li[1]/table//td[2]")).getText(); 
		String sQtyActual=driver.findElement(By.xpath("//div[@id='cart]/ui/li[1]/table//td[3]")).getText(); 
		//System.out.println(sProductActual);
		if(sProductEntered.equalsIgnoreCase(sProductActual))
		{
			System.out.println("Product maches");
		}
		else
		{
			System.out.println("product is not matched :"sProductEntered :+);
		}
			
		
		
		
		
		
	}

}
