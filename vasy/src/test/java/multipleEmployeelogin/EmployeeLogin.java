package multipleEmployeelogin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class EmployeeLogin {
	
	@Test(invocationCount = 3)
	public void TestEmployee1login () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://azure.vasyerp.com/dashboard");
		driver.manage().window().maximize();
		WebElement userName=driver.findElement(By.xpath("//input[@name='userName']"));
		userName.sendKeys("vamshi");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("123456789");
		WebElement button=driver.findElement(By.xpath("//button[@name='signin_submit']"));
		button.click();
		
		Thread.sleep(3000);
		WebElement pos=driver.findElement(By.partialLinkText("POS"));
		pos.click();	
		Thread.sleep(3000);
		WebElement new1=driver.findElement(By.partialLinkText("New"));
		new1.click();
		Thread.sleep(5000);
		
		WebElement  customernamedrpdwn=driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']"));
		customernamedrpdwn.click();
		WebElement customername=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		customername.sendKeys("abc");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		Thread.sleep(1000);
		WebElement  product1=driver.findElement(By.xpath("//input[@id='searchBarcode']"));
		product1.sendKeys("110110");
		Thread.sleep(1000);
		Actions actionforproduct1= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		Thread.sleep(1000);
		WebElement cashbtn=driver.findElement(By.xpath("//button[@id='cashbtn']"));
		cashbtn.click();
		Thread.sleep(1000);
		WebElement paybtn=driver.findElement(By.id("SaveCashFromtendered_btn"));
		paybtn.click();
		Thread.sleep(3000);
			
	   driver.close();
	}

	@Test(invocationCount = 10)
	public void TestEmployee2login () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://azure.vasyerp.com/dashboard");
		driver.manage().window().maximize();
		WebElement userName=driver.findElement(By.xpath("//input[@name='userName']"));
		userName.sendKeys("dcahuja");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("123456789");
		WebElement button=driver.findElement(By.xpath("//button[@name='signin_submit']"));
		button.click();
		
		Thread.sleep(3000);
		WebElement pos=driver.findElement(By.partialLinkText("POS"));
		pos.click();	
		Thread.sleep(3000);
		WebElement new1=driver.findElement(By.partialLinkText("New"));
		new1.click();
		Thread.sleep(10000);
		
		WebElement  customernamedrpdwn=driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']"));
		customernamedrpdwn.click();
		WebElement customername=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		customername.sendKeys("abc");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		WebElement  product1=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product1.sendKeys("110109");
		Thread.sleep(3000);
		Actions actionforproduct1= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		Thread.sleep(3000);
		WebElement cashbtn=driver.findElement(By.id("cashbtn"));
		cashbtn.click();
		Thread.sleep(3000);
		WebElement paybtn=driver.findElement(By.id("SaveCashFromtendered_btn"));
		paybtn.click();
		Thread.sleep(5000);
	
	   driver.close();	
	}
	
	@Test(invocationCount = 10)
	public void TestEmployee3login () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://azure.vasyerp.com/dashboard");
		driver.manage().window().maximize();
		WebElement userName=driver.findElement(By.xpath("//input[@name='userName']"));
		userName.sendKeys("Ram457");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("123456789");
		WebElement button=driver.findElement(By.xpath("//button[@name='signin_submit']"));
		button.click();
		
		Thread.sleep(3000);
		WebElement pos=driver.findElement(By.partialLinkText("POS"));
		pos.click();	
		Thread.sleep(3000);
		WebElement new1=driver.findElement(By.partialLinkText("New"));
		new1.click();
		Thread.sleep(10000);
		
		WebElement  customernamedrpdwn=driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']"));
		customernamedrpdwn.click();
		WebElement customername=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		customername.sendKeys("abc");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		WebElement  product1=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product1.sendKeys("110108");
		Thread.sleep(3000);
		Actions actionforproduct1= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		Thread.sleep(3000);
		WebElement cashbtn=driver.findElement(By.id("cashbtn"));
		cashbtn.click();
		Thread.sleep(3000);
		WebElement paybtn=driver.findElement(By.id("SaveCashFromtendered_btn"));
		paybtn.click();
		Thread.sleep(5000);
		
	   driver.close();	
	}
	@Test(invocationCount = 10)
	public void TestEmployee4login () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://azure.vasyerp.com/dashboard");
		driver.manage().window().maximize();
		WebElement userName=driver.findElement(By.xpath("//input[@name='userName']"));
		userName.sendKeys("Kannn");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("123456789");
		WebElement button=driver.findElement(By.xpath("//button[@name='signin_submit']"));
		button.click();
		
		Thread.sleep(3000);
		WebElement pos=driver.findElement(By.partialLinkText("POS"));
		pos.click();	
		Thread.sleep(3000);
		WebElement new1=driver.findElement(By.partialLinkText("New"));
		new1.click();
		Thread.sleep(10000);
		
		//WebElement  customernamedrpdwn=driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']"));
		//customernamedrpdwn.click();
		WebElement customername=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		customername.sendKeys("abc");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		WebElement  product1=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product1.sendKeys("110107");
		Thread.sleep(3000);
		Actions actionforproduct1= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		Thread.sleep(3000);
		WebElement cashbtn=driver.findElement(By.id("cashbtn"));
		cashbtn.click();
		Thread.sleep(3000);
		WebElement paybtn=driver.findElement(By.id("SaveCashFromtendered_btn"));
		paybtn.click();
		Thread.sleep(5000);
		
	   driver.close();
	}
	@Test(invocationCount = 10)
	public void TestEmployee5login () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://azure.vasyerp.com/dashboard");
		driver.manage().window().maximize();
		WebElement userName=driver.findElement(By.xpath("//input[@name='userName']"));
		userName.sendKeys("DARSHAK");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("123456789");
		WebElement button=driver.findElement(By.xpath("//button[@name='signin_submit']"));
		button.click();
		
		Thread.sleep(3000);
		WebElement pos=driver.findElement(By.partialLinkText("POS"));
		pos.click();	
		Thread.sleep(3000);
		WebElement new1=driver.findElement(By.partialLinkText("New"));
		new1.click();
		Thread.sleep(10000);
		
		WebElement  customernamedrpdwn=driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']"));
		customernamedrpdwn.click();
		WebElement customername=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		customername.sendKeys("abc");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		WebElement  product1=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product1.sendKeys("110106");
		Thread.sleep(3000);
		Actions actionforproduct1= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		Thread.sleep(3000);
		WebElement cashbtn=driver.findElement(By.id("cashbtn"));
		cashbtn.click();
		Thread.sleep(3000);
		WebElement paybtn=driver.findElement(By.id("SaveCashFromtendered_btn"));
		paybtn.click();
		Thread.sleep(5000);
		
	   driver.close();	
  }
}