package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import global.configuration;

public class LoginPage extends configuration  {
	
	//webelement in login page
	
	
	@FindBy(id="txtUsername")
	WebElement userNameFiled;
	
	@FindBy(id="txtPassword")
	WebElement passwordField;
	
	@FindBy(id="btnLogin")
	WebElement loginBtn;
	
	
	public HomePage login (String sUsername,String sPassword)
	{
		userNameFiled.sendKeys(sUsername);
		passwordField.sendKeys(sPassword);
		loginBtn.click();
		return new HomePage();
		
	}
	
	public LoginPage (WebDriver driver )
	{
		PageFactory.initElements(driver, this); //////this is nothing but Loginpage 
	}
	
	
}
