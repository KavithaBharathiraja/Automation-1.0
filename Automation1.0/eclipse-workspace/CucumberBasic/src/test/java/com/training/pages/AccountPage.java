package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class AccountPage extends BasePage {
	
	static WebDriver driver;
	
	public AccountPage() {
		
		super(driver= BaseTest.getDriver());
		
		
		addObject("Username", By.id("username"));
		addObject("Password",By.id("password"));
		addObject("Login", By.id("Login"));
		addObject("Accounts", By.id("//a[@title='Accounts Tab']"));
		addObject("XAlert", By.id("tryLexDialogX"));
		addObject("New", By.id("new"));
		addObject("AccountName", By.id("acc2"));
		addObject("AccountType", By.id("acc6"));
		addObject("CustomerPriority", By.id("00NHu00000NHh2Z"));
		//addObject("Save", By.id("save"));
		addObject("cancel", By.id("cancel"));
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
