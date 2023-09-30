package com.training.base;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetElementDisplayed;
import org.openqa.selenium.remote.server.handler.GetElementText;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
	 WebDriver driver;
	
	public HashMap<String,By> ObjectRepo = new HashMap<String,By>();
	
	public BasePage(WebDriver driver) {
		this.driver =driver;
	}

	public void addObject(String logicalName, By by) {
		
		
		ObjectRepo.put(logicalName, by);		
		
	}
	
	private WebElement getElement(String logicalName) {
		
		By by = ObjectRepo.get(logicalName);
		WebElement element = driver.findElement(by);
		return element;
		
	}
	
	public void enterintoTextbox(String LogicalName, String Value) {
		
		WebElement element = getElement(LogicalName);
		waitForElement(element);
		element.sendKeys(Value);
	}
	
	public void CleartheTextbox(String LogicalName) {
		WebElement element = getElement(LogicalName);
		waitForElement(element);
		element.clear();
	}
	
	public void ClickonButton(String LogicalName) {
		WebElement element = getElement(LogicalName);
		waitForElement(element);
		element.click();	
	}
	
  private void waitForElement(WebElement element) {
	  
	  WebDriverWait wait = new WebDriverWait(driver, 90);
	  wait.until(ExpectedConditions.visibilityOf(element));
  }
    
      /*public void the_following_options_should_be_displayed(io.cucumber.datatable.DataTable dataTable) {
	   // Iterate over the DataTable and verify that each option is displayed in the drop down menu
	    for (String option : dataTable.rows[]) {
	        WebElement element = driver.findElement(By.cssSelector(".slds-dropdown__item-text"));
	        Assert.assertEquals(option, element.getText());
	    }*/
	    
	   
  public String checkerrormessage (String LogicalName) {
		  WebElement element=getElement (LogicalName);
		  String actualerrormessage=element.getText () ;
		  return actualerrormessage;
		  
}  
		  public void movetoelement (String LogicalName) {
		  WebElement element=getElement (LogicalName);
		  Actions action=new Actions (driver);
		  action.moveToElement (element).build () .perform () ;
		  waitForElement (element);
		  element.click () ;
		  
		  } 
		  
		  public void closethechildwindow (String LogicalName) {
		  Set<String> allwindowhandles=driver.getWindowHandles ();;
		  Iterator<String> it=allwindowhandles.iterator ();
		  String Parentwindow=it.next ();
		  String childwindow=it.next ();
		  driver.switchTo () .window (childwindow);
 	    
	}

  
  
}
  
  
  
  
  
  
  
	
    
    

