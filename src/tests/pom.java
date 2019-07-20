package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import global.configuration;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;

public class pom extends configuration  {
	
	LoginPage objLogin;
	HomePage objHome;
	AdminPage objAdmin;
	
	
	@BeforeTest
	public void login() 
	{
		  objLogin =new LoginPage (driver);
		  objHome=objLogin.login ("Admin", "admin123");
		
	}
	
  @Test
  public void verifyAdminFunctionality() {
	  
	 // objLogin =new LoginPage (driver);
	  //objHome=objLogin.login ("Admin", "admin123");
	  //objHome =new HomePage (driver);
	  objHome.verifyHomePage();
	  objAdmin=objHome.navigateToAdminPage();
	  objHome=objAdmin.navigateBack();
	  
		    
  }
  @Test
  public void verifyPimFunctionality () {
	  objHome.navigateToPIMPage();
	  
	  
  
}
}

