package uploadimportexcel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class salesinvoiceupdatesheet {
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
		
//		Actions actions=new Actions(driver);
		
		WebElement button=driver.findElement(By.xpath("//button[@name='signin_submit']"));
		button.click();
		Thread.sleep(3000);
		WebElement Sales=driver.findElement(By.partialLinkText("Sales"));
		Sales.click();
		Thread.sleep(3000);
		WebElement Invoice=driver.findElement(By.partialLinkText("Invoice"));
		Invoice.click();
		Thread.sleep(3000);
		WebElement CreateNew=driver.findElement(By.partialLinkText("Create New"));
		CreateNew.click();
		
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor jsq = (JavascriptExecutor) driver;
		WebElement entercustomername = driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input"));
		jsq.executeScript("arguments[0].scrollIntoView();", entercustomername);
		entercustomername.sendKeys("MANISHABEN MUMBAI");
		entercustomername.sendKeys(Keys.RETURN);

		Thread.sleep(5000);
	
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement uploadproduct = driver.findElement(By.xpath("//a[@class='btn btn-sm btn-info']"));
		js.executeScript("arguments[0].scrollIntoView();", uploadproduct);
		uploadproduct.click();
	
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		WebElement uploadopt = driver.findElement(By.xpath("//span[@class='input-group-text']"));
		jss.executeScript("arguments[0].scrollIntoView();", uploadopt);
		uploadopt.click();
		Thread.sleep(3000);
		
		
		
		
		Runtime.getRuntime().exec("C:\\Users\\Sharjil\\autoitscripts\\forsalesinvoiceupload.exe");
		Thread.sleep(3000);
		
	    JavascriptExecutor jsv = (JavascriptExecutor) driver;
		WebElement verifysheet = driver.findElement(By.xpath("//button[@id='testfile']"));
		jsv.executeScript("arguments[0].scrollIntoView();", verifysheet);
		verifysheet.click();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor jsm = (JavascriptExecutor) driver;
		WebElement upsheet = driver.findElement(By.xpath("//button[@id='importExcel']"));
		jsm.executeScript("arguments[0].scrollIntoView();", upsheet);
		upsheet.click();
		
		Thread.sleep(120000);
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		JavascriptExecutor jsd = (JavascriptExecutor) driver;
		WebElement upsheetagain = driver.findElement(By.xpath("//button[@id='importExcel']"));
		jsd.executeScript("arguments[0].scrollIntoView();", upsheetagain);
		upsheetagain.click();
		
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor jsdd = (JavascriptExecutor) driver;
		WebElement upsheetconfirm = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		jsdd.executeScript("arguments[0].scrollIntoView();", upsheetconfirm);
		upsheetconfirm.click();
		
		Thread.sleep(120000);
		
		
		
		

}
	}
