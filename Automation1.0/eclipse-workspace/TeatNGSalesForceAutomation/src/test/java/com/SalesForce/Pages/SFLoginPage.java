package com.SalesForce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.SalesForce.Base.BasePage;
public class SFLoginPage extends BasePage{
	
	
	public SFLoginPage(WebDriver driver) {
		
		super(driver);
		
	}
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
		
	@FindBy(id = "Login")
	WebElement Login;
	
	@FindBy(id= "rememberUn")
	WebElement rememberme;
	
	@FindBy(id= "forgot_password_link")
	WebElement Forgotpassword;
	
	@FindBy(id= "un")
	WebElement FPusername;
	
	@FindBy(id= "userNav-arrow")
	WebElement usermenu;
	
	@FindBy(id="error")
	WebElement textbox;
	
	
	@FindBy(xpath= "//span[@id=\"idcard-identity\"]")
	WebElement textbox1;
	
	@FindBy(xpath= "//a[text()='Logout']")
	 WebElement logoutoption;
	
	@FindBy(id="continue")
	WebElement continuelogin;
	
	WebDriver driver;

	public void EnterValidUserEmail() {
	
		username.sendKeys("kavi@bharathiraja.com");		
	}	
	
	public void EnterInvalidUserEmail() {
		
		username.sendKeys("123123");		
	}
		
	public void ClearpasswordFiled() {
		
		password.clear();
	}	
	public void EnterPassword() {
		
		password.sendKeys("Password123");		
	}
    public void EnterInvalidPassword() {
		
		password.sendKeys("123");		
	}
	  
	 public void ClickRememberme()  {
		   
	     rememberme.click();	
    }	
	
	 public void Forgotpassword() {
		 
		 Forgotpassword.click();
		 FPusername.sendKeys("kavi@bharathiraja.com");
		 
	 }
	 
	public void ClickConitinueButton() {
		
		continuelogin.click();
	}
		
	public void  ClickLoginButton() {
		
		Login.click();	
		
	}	
	public void UserMenu() {
		
		usermenu.click();	
	}
  
	public void Logout() {
		
		logoutoption.click();
			
	}
	
	public void ValidationErrorMessage() {
		 String ActualText = textbox.getText();
		 String ExpectedText = "Please enter your password";
		 Assert.assertEquals(ActualText, ExpectedText);  
	}
   public void  ValidationRembermeUsername() { 
	   String ActualText = textbox1.getText();
	   String ExpectedText = "kavi@bharathiraja.com";
	   Assert.assertEquals(ActualText, ExpectedText);  	   
   }
   
   
 
	
}
