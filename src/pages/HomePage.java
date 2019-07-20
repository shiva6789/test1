package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import global.configuration;

public class HomePage extends configuration {
	
	@FindBy(id="welcome")
	WebElement welcomeTxt;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement adminLink;
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement pimlink;
	
	public void verifyHomePage()
	{
		String sText= welcomeTxt.getText();
				Assert.assertEquals(sText, "Welcome Admin");
	}
	
	public AdminPage navigateToAdminPage()
	{
		adminLink .click();
		return new AdminPage();
	}
	
	
		public void navigateToPIMPage()
		{
			pimlink.click();
	}
	public HomePage ( )
	{
		PageFactory.initElements(driver, this); 
	}
}



