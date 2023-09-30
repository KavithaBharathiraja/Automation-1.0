package Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase13 {
  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// Merge accounts
		
		LaunchApplication();
		Login();
		Accounts();	
		MergeAccounts();
	}	
		
	static void LaunchApplication() {
		
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
				
		driver.get("https://login.salesforce.com");		
}
   static void Login() {
  	 
	    WebElement username = driver.findElement(By.id("username"));
	    username.sendKeys("kavi@bharathiraja.com");
			
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Password123");
		
		WebElement Login = driver.findElement(By.id("Login"));
		Login.click();
}	
   public static void Accounts() throws InterruptedException {
	   
		Thread.sleep(5000);
		//WebElement elemnet = driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']"));
		
		WebElement element = driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
		
		waitforVisibility(element,Duration.ofSeconds(30));
		element.click();
		
		Thread.sleep(5000);
		WebElement close = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		//waitforVisibility(close,15);
		
		close.click();
	
	}
   
   public static void MergeAccounts() {
		
		WebElement mergeAccount = driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
		waitforVisibility(mergeAccount,Duration.ofSeconds(30));
		mergeAccount.click();
		
		WebElement enterTextInMergeField = driver.findElement(By.id("srch"));
		waitforVisibility(enterTextInMergeField,Duration.ofSeconds(30));
		enterTextInMergeField.sendKeys("Automation");
		
		WebElement findAccountsBtn = driver.findElement(By.name("srchbutton"));
		findAccountsBtn.click();
		
		List<WebElement>  list = driver.findElements(By.xpath("//table[@class='list']/tbody/tr"));
		
		for(WebElement element:list) {
			
			
				String strList = element.getText();
				System.out.println(strList);
				
		}	
		
		driver.findElement(By.xpath("//*[@id=\"cid0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"cid1\"]")).click();
		
		WebElement elementNext = driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[1]"));
		elementNext.click();
		
		WebElement elementMerge = driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[1]/div/input[2]"));
		waitforVisibility(elementMerge,Duration.ofSeconds(30));
		elementMerge.click();
		
		driver.switchTo().alert().accept();
   }

private static void waitforVisibility(WebElement element, Duration i) {
	WebDriverWait wait = new WebDriverWait(driver,i);
	wait.until(ExpectedConditions.visibilityOf(element));
}
	
}


   /*static void MergeAccounts() {
	   
		    
	    WebElement XAlert = driver.findElement(By.id("tryLexDialogX"));  
	    WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOf(XAlert));
	    wait.until(ExpectedConditions.elementToBeClickable(XAlert));
	    XAlert.click();
	    
	    WebElement MergeAccounts = driver.findElement(By.xpath("//a[text()='Merge Accounts']"));  
	    MergeAccounts.click();
	    
	    WebElement FindAccount = driver.findElement(By.xpath("//input[@id='srch']"));  
	    FindAccount.sendKeys("kavitha");
	    
	    
	    WebElement FindAccounts = driver.findElement(By.xpath("//input[@value='Find Accounts']"));  
	    FindAccounts.click();
	    
	    WebElement Account1 = driver.findElement(By.xpath("//input[@id='cid1']"));  
	    Account1.click();
	    
	    WebElement Account2 = driver.findElement(By.xpath(" //input[@id='cid2']"));  
	    Account2.click();
	    
	    WebElement Next = driver.findElement(By.xpath("//input[@name='goNext']"));  
	    Next.click();
	    
	    WebElement Merge = driver.findElement(By.xpath("//input[@value=' Merge ']"));  
	    Merge.click();
	    
	    driver.switchTo().alert().dismiss();
	  
	    System.out.println(" New pop up for account merge confirmation displayed.TestCase13-Pass.");
}
		
	}*/


