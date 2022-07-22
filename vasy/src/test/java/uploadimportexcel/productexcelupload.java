package uploadimportexcel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class productexcelupload {
	@Test
	public void TestLogin() throws InterruptedException, IOException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\geckodriver-v0.22.0-win64\\geckodriver.exe");
	//WebDriver driver=new FirefoxDriver();
	
	
	driver.get("http://loadtest.vasyerp.com/login");
	driver.manage().window().maximize();
	WebElement userName=driver.findElement(By.xpath("//input[@name='userName']"));
	userName.sendKeys("smeetgajjar19@gmail.com");
	WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("123456789");
	
//	Actions actions=new Actions(driver);
	
	WebElement button=driver.findElement(By.xpath("//button[@name='signin_submit']"));
	button.click();
	
	WebElement inventory=driver.findElement(By.partialLinkText("Inventory"));
	inventory.click();
	Thread.sleep(3000);
	WebElement product=driver.findElement(By.partialLinkText("Product"));
	product.click();
	Thread.sleep(3000);
	WebElement uploadsheet=driver.findElement(By.xpath("//i[@class='fas fa-file-import']"));
	uploadsheet.click();
	
	
	Thread.sleep(3000);

	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement clickonselectsheet = driver.findElement(By.xpath("//span[@class='input-group-text']"));
	js.executeScript("arguments[0].scrollIntoView();", clickonselectsheet);
	clickonselectsheet.click();
	Thread.sleep(3000);
	
	//calling autoit script
	Runtime.getRuntime().exec("C:\\Users\\Sharjil\\autoitscripts\\forproductsheetupload.exe");
	Thread.sleep(3000);
	/*
	JavascriptExecutor jss = (JavascriptExecutor) driver;
	WebElement verifysheet = driver.findElement(By.xpath("//button[@id='testfile']"));
	jss.executeScript("arguments[0].scrollIntoView();", verifysheet);
	verifysheet.click();
	*/
}
	}
