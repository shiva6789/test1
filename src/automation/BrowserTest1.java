package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserTest1 {

                static WebDriver driver;
                
                public static void main(String[] args) throws InterruptedException {
                                // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
                    driver=new ChromeDriver();
                   //System.setProperty("webdriver.gecko.driver", "E:\\Java\\geckodriver.exe");
                   //driver=new FirefoxDriver();
                   driver.get("https://demo.opencart.com/");
                   String PageTitle=driver.getTitle();
                   System.out.println("Title is: " +PageTitle);
                   if(PageTitle.equalsIgnoreCase("Your Store"))
                   {
                                   System.out.println("Page load verification passed");
                                   
                   }
                                   
                   else
                                   
                   {
                   System.out.println("Page load verification failed");
                   
                   }
                   String sProductEntered="iPhone";
                   String sQty="3";
                   driver.findElement(By.name("search")).sendKeys("phone");
                   driver.findElement(By.xpath("//div[@id='search']//button")).click();
                   driver.findElement(By.xpath("//select[@name='category_id']")).click();
                   new Select(driver.findElement(By.xpath("//select[@name='category_id']"))).selectByIndex(3);
                   driver.findElement(By.name("sub_category")).click();
                   driver.findElement(By.xpath("//img[@title='iPhone']")).click();
                   driver.findElement(By.name("quantity")).clear();
                   driver.findElement(By.name("quantity")).sendKeys(sQty);
                   driver.findElement(By.xpath("//button[@id='button-cart']")).click();
                   //Thread.sleep(5000);
                   driver.findElement(By.id("cart")).click();
                   //Explicit Wait
                   WebDriverWait wait=new WebDriverWait(driver, 30);
                   wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='cart']/ul/li/table//tr/td[2]/a"),"iPhone"));
                   String sProductActual=driver.findElement(By.xpath("//div[@id='cart']/ul/li/table//tr/td[2]/a")).getText();
                   String sQtyActual=driver.findElement(By.xpath("//div[@id='cart']/ul/li[1]//tbody/tr/td[3]")).getText();
                   //System.out.println(sProductActual);
                   if(sProductEntered.equalsIgnoreCase(sProductActual))
                   {
                   System.out.println("Product Matches");   
                                 
                   }
                                   
                   else
                   {
                                                   System.out.println("Product not matched expected :" +sProductEntered +" Actual :"+sProductActual);
                                   }
                   
                   if(sQtyActual.contains((sQty)))
                   {
                                System.out.println("Quantity Matches");
                                
                   }
                   else
                   {
                                   System.out.println("Quantity Not Matches");  
                   }
                   
                  // driver.findElement(By.xpath("//*[@id='cart']/ul/li[2]/div/p/a[2]")).click(); 
                  // Thread.sleep(5000);
                   //driver.findElement(By.xpath("//*[@id='accordion']/div[1]/div[1]/h4/a")).click(); 
                   driver.findElement(By.linkText("Checkout")).click();
                   Thread.sleep(3000);
                   driver.findElement(By.linkText("Use Coupon Code")).click();
                   Thread.sleep(3000);
                   driver.findElement(By.id("input-coupon")).sendKeys("1234");
                   driver.findElement(By.id("button-coupon")).click();
                  
                      
                   
                   
                   
                   
                   
                }
}

