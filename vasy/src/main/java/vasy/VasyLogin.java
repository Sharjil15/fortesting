package vasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.*;
public class VasyLogin {
	@Test
	public void TestLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\geckodriver-v0.22.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		
		driver.get("https://aws.vasyerp.com/dashboard");
		driver.manage().window().maximize();
		WebElement userName=driver.findElement(By.xpath("//input[@name='userName']"));
		userName.sendKeys("croods");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("asdf1234");
		
	//	Actions actions=new Actions(driver);
		
		WebElement button=driver.findElement(By.xpath("//button[@name='signin_submit']"));
		button.click();
		
		String actualUrl="https://croodstest.vasyerp.com/dashboard";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		Thread.sleep(5000);
		WebElement Logoutbutton=driver.findElement(By.xpath("//span[@class='m-topbar__userpic']"));
		Logoutbutton.click();
		WebElement Logoutbuttonclick=driver.findElement(By.xpath("//i[@class='fa fa-sign-out']"));
		Logoutbuttonclick.click();
		
	
		
		
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
