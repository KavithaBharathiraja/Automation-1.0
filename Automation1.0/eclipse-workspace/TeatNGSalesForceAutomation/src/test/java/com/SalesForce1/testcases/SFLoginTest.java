package com.SalesForce1.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.SalesForce.Base.BaseTest;
import com.SalesForce.Pages.SFLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SFLoginTest extends BaseTest {
	
	 WebDriver driver;
	 SFLoginPage SFLogin;
	

	@BeforeMethod	
	public void LaunchApplication() {
		
	
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
				
		driver.get("https://login.salesforce.com");
		
		SFLogin= new SFLoginPage(driver);
	}
	@Test

	public void ClearPasswordLogin() {
		
		SFLogin.EnterValidUserEmail();
		SFLogin.ClearpasswordFiled();
		SFLogin.ClickLoginButton();
	}
	@Test
	public void LoginToSalesForce(){
		
		SFLogin.EnterValidUserEmail();
		SFLogin.EnterPassword();
		SFLogin.ClickLoginButton();
	}
	
	@Test
	public void CheckRemeberMe() {
		SFLogin.EnterValidUserEmail();
		SFLogin.EnterPassword();
		SFLogin.ClickRememberme();;
		SFLogin.ClickLoginButton();
		SFLogin.UserMenu();
		SFLogin.Logout();
	}
	
	@Test
	public void Forgotpassword() {
		SFLogin.EnterValidUserEmail();
		SFLogin.Forgotpassword();
		SFLogin.ClickConitinueButton();
	}
	
	@Test
	public void InvalidUsernameAndPassword() {
		SFLogin.EnterInvalidUserEmail();
		SFLogin.EnterInvalidPassword();
		SFLogin.ClickLoginButton();	
	}

	@AfterSuite	
	public void teardown()
	{
	    driver.close();
		driver = null;	
	}
		
}
