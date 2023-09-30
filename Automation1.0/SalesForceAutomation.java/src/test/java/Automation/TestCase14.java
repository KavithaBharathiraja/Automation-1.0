package Automation;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase14 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// Create account report
		

		LaunchApplication();
		Login();
		Accounts();
		Create_account_reporty();
	    
		
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
   
   
   public static void Create_account_reporty() {
		WebElement eleemntLastActivity = driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
		waitforVisibility(eleemntLastActivity,Duration.ofSeconds(30));
		eleemntLastActivity.click();
		
		
	
		
		WebElement elementDateField = driver.findElement(By.xpath("//*[@id=\"ext-gen20\"]"));
		waitforVisibility(elementDateField,Duration.ofSeconds(30));
		elementDateField.click();
		
		//elementDateField.click();
		WebElement elementFromDate = driver.findElement(By.xpath("//*[@id=\"ext-gen152\"]"));
		waitforVisibility(elementFromDate,Duration.ofSeconds(10));
		elementFromDate.click();
		
		WebElement elementToday = driver.findElement(By.xpath("//button[contains(text(),'Today')]"));
		waitforVisibility(elementToday,Duration.ofSeconds(10));
		elementToday.click();
		
		WebElement elementSave = driver.findElement(By.xpath("//*[@id=\"ext-gen49\"]"));
		waitforVisibility(elementSave,Duration.ofSeconds(10));
		elementSave.click();
		
		
		WebElement elementReportName = driver.findElement(By.xpath("//*[@id=\"saveReportDlg_reportNameField\"]"));
		waitforVisibility(elementReportName,Duration.ofSeconds(10));
		elementReportName.sendKeys("New Test Report March20");
		
		WebElement elementReportUniqueName = driver.findElement(By.xpath("//*[@id=\"saveReportDlg_DeveloperName\"]"));
		waitforVisibility(elementReportUniqueName,Duration.ofSeconds(10));
		elementReportUniqueName.click();
		
		
		WebElement elementSaveAndRun = driver.findElement(By.xpath("//*[@id=\"ext-gen297\"]"));
		waitforVisibility(elementSaveAndRun,Duration.ofSeconds(10));
		Actions actions = new Actions(driver);
		actions.moveToElement(elementSaveAndRun).click().build().perform();
		//elementSaveAndRun.click();

   }	

		/*static void CreateAccountReport() {
	    	
	    	 WebElement Accountswithlast30daysactivity = driver.findElement(By.xpath("//a[text( )='Accounts with last activity > 30 days']"));  
	    	 Accountswithlast30daysactivity.click();
	    	 
	    	 WebElement FromDay = driver.findElement(By.xpath("//img[@id='ext-gen152']"));  
	    	 FromDay.click();
	    	 
	    	 
	    	// WebElement Today = driver.findElement(By.xpath("//button[@id='ext-gen281']")); 
	    	 //Actions action = new Actions(driver);
	    	 //action.moveToElement(Today).build().perform();
	    	 
	    	 //WebElement Today = driver.findElement(By.xpath("//button[@id='ext-gen282']")); 
	    	 //Today.click();    	 
	    	 
	    	 LocalDateTime LDT = LocalDateTime.now();
	    	 DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	         String FDT = LDT. format (DTF);
	    	 WebElement fromdatetoday = driver.findElement (By.id("ext-comp-1042"));
	    	 fromdatetoday.sendKeys(FDT); 
	    	 
	    	 WebElement Save = driver.findElement(By.xpath("//button[@id='ext-gen49']"));  
	    	 Save.click();
	    	 
	    	 WebElement ReportName = driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']"));  
	    	 ReportName.sendKeys("TodaysReport");
	    	 
	    	 WebElement ReportUniqueName = driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']"));  
	    	 ReportUniqueName.sendKeys("1");
	    	 
	    	 WebElement SaveandRunREport = driver.findElement(By.xpath("//button[@id='ext-gen281']"));
	    	 Actions action = new Actions(driver);
	    	 action.moveToElement(SaveandRunREport).build().perform();
	    	 SaveandRunREport.click();
	    	 
	 }*/
   
   private static void waitforVisibility(WebElement element, Duration i) {
		WebDriverWait wait = new WebDriverWait(driver,i);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
   
   
}




		

		
		
		
		

	


