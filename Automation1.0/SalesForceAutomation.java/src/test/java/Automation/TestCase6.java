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

public class TestCase6 {
	static WebDriver driver;
	// Select "My Profile" option from user menu
	// for <user name> drop down

	public static void main(String[] args) {

		LaunchApplication1();
		Login();

	}

	static void LaunchApplication1() {

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
	static void myprofile() {

	WebElement profile = driver.findElement(By.xpath(" //a[contains (text (), 'My Profile')]"));
	profile.click();
	
	}
	static void editprofile() throws InterruptedException {
    Thread.sleep(3000);
    WebElement editProfile = driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']"));
	waitforVisibility(editProfile,Duration.ofSeconds(10));
	editProfile.click();
	
	Thread.sleep(5000);
	
	 WebElement about = driver.findElement(By.id("contactInfoContentId"));
	 driver.switchTo().frame(about);
	 
	 WebElement aboutTab = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
	 aboutTab.click();
	 WebElement lastName = driver.findElement(By.id("lastName"));
	 lastName.clear();
	 lastName.sendKeys("Ram");
	 WebElement saveAll = driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']"));
	 saveAll.click();

	 Thread.sleep(5000);
		
		WebElement post = driver.findElement(By.xpath("//a[@title='Post']"));
		waitforVisibility(post,Duration.ofSeconds(10));
		post.click();
		
		
Thread.sleep(5000);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@allowtransparency='true']"));
		driver.switchTo().frame(iframe);
		
		
		
		WebElement postMsg = driver.findElement(By.xpath("//body[contains(text(),'Share')]"));
		waitforVisibility(postMsg,Duration.ofSeconds(10));
		postMsg.sendKeys("Good Morning");
	//	postMsg.click();
		
		driver.switchTo().defaultContent();
		
		
		WebElement share = driver.findElement(By.id("publishersharebutton"));
		share.click();
		
		
      Thread.sleep(5000);
		
		WebElement file = driver.findElement(By.xpath("//span[text()='File']"));
		waitforVisibility(file,Duration.ofSeconds(10));
		file.click();
		
		WebElement upload = driver.findElement(By.xpath("//a[contains(text(),'Upload')]"));
		upload.click();
		
		
		WebElement chooseFile = driver.findElement(By.id("chatterFile"));
		waitforVisibility(chooseFile,Duration.ofSeconds(10));
		chooseFile.sendKeys("/Users/rahade/Documents/Personal/Tekarch/PointsToRemember/NotesToRem.rtf");
		driver.findElement(By.id("publishersharebutton")).click();
		// add photo
		WebElement elementPhoto = driver.findElement(By.id("uploadLink"));
		waitforVisibility(elementPhoto,Duration.ofSeconds(10));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(elementPhoto).build().perform();
		
		waitforVisibility(elementPhoto,Duration.ofSeconds(10));
		elementPhoto.click();

		WebElement frame = driver.findElement(By.id("uploadPhotoContentId"));
		driver.switchTo().frame(frame);
	
		WebElement choosePhoto = driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile"));
		choosePhoto.sendKeys("/Users/kavithabharathiraja/Documents/Tester_Picture");
		
		WebElement uploadBtn = driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn"));
		uploadBtn.click();
		Thread.sleep(10000);
		
		WebElement cropper1 = driver.findElement(By.xpath("//div[@class='imgCrop_handle imgCrop_handleSE']"));
		waitforVisibility(cropper1,Duration.ofSeconds(10));
		Actions action = new Actions(driver);
		action.clickAndHold(cropper1).moveByOffset(30, 50).build().perform();
		
		WebElement cropper2 = driver.findElement(By.xpath("//div[@class='imgCrop_handle imgCrop_handleNE']"));
		waitforVisibility(cropper2,Duration.ofSeconds(10));
		Actions action2 = new Actions(driver);
		action2.clickAndHold(cropper2).moveByOffset(30, 50).build().perform();
		
		WebElement saveCroppedImg = driver.findElement(By.id("j_id0:j_id7:save"));
		waitforVisibility(saveCroppedImg,Duration.ofSeconds(10));
		saveCroppedImg.click();
		
    
	}

	 private static void waitforVisibility(WebElement element, Duration i) {
			WebDriverWait wait = new WebDriverWait(driver,i);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
	
	
	
}
