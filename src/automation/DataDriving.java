package automation;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriving {

static WebDriver driver;
       
       public static void main(String[] args) throws InterruptedException {
              // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
           driver=new ChromeDriver();
          //System.setProperty("webdriver.gecko.driver", "E:\\Java\\geckodriver.exe");
          //driver=new FirefoxDriver();
          driver.get("https://demo.opencart.com/");
          ArrayList<String> a1=ExcelInteraction.readFromExcel("D:\\Selenium Driver\\TestData.xls","Sheet1");
          
          for(int i=0;i<a1.size();i++)
                 
          {
                 WebElement search=driver.findElement(By.name("search"));
                 WebElement button=driver.findElement(By.xpath("//div[@id='search']//button"));
                 search.clear();
                 search.sendKeys(a1.get(i));
                 button.click();
                 
       }
       
}
       
}


