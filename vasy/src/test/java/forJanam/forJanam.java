package forJanam;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class forJanam {
	static WebDriver driver;
	
	@Test(priority=2)
	public void TestEmployee1login () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://croods.vasyerp.com/dashboard");
		driver.manage().window().maximize();
		WebElement userName=driver.findElement(By.xpath("//input[@name='userName']"));
		userName.sendKeys("vyaparerp");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("123456789");
		WebElement button=driver.findElement(By.xpath("//button[@name='signin_submit']"));
		button.click();
		Thread.sleep(3000);}
	
	@Test(priority=1,dependsOnMethods = { "TestEmployee1login" })
		public void NAvigatetoPOS () throws InterruptedException {
		WebElement pos=driver.findElement(By.partialLinkText("POS"));
		pos.click();	
		Thread.sleep(2000);
		WebElement new1=driver.findElement(By.partialLinkText("New"));
		new1.click();
		Thread.sleep(5000);
		
		}
	
	@Test(priority=3,dependsOnMethods = { "NAvigatetoPOS" },invocationCount = 3)
	public void AddProducts () throws InterruptedException {
		WebElement  customername=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		customername.sendKeys("abc");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		Thread.sleep(2000);
		WebElement  product1=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product1.sendKeys("Productcode102");
		Thread.sleep(1000);
		Actions actionforproduct1= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		
		WebElement  product2=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product2.sendKeys("Productcode101");
		Thread.sleep(1000);
		Actions actionforproduct2= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		Thread.sleep(1000);
		
		
		WebElement  product3=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product3.sendKeys("Productcode100");
		Thread.sleep(1000);
		Actions actionforproduct3= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		Thread.sleep(1000);
		
		/*
		WebElement  product4=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product4.sendKeys("Productcode099");
		Thread.sleep(3000);
		Actions actionforproduct4= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		Thread.sleep(2000);
		
		
		WebElement  product5=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product5.sendKeys("Productcode098");
		Thread.sleep(3000);
		Actions actionforproduct5= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		Thread.sleep(2000);;
		
		WebElement  product6=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product6.sendKeys("Productcode097");
		Thread.sleep(3000);
		Actions actionforproduct6= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		Thread.sleep(2000);
		
		
		WebElement  product7=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product7.sendKeys("Productcode096");
		Thread.sleep(3000);
		Actions actionforproduct7= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		Thread.sleep(2000);
	
		WebElement  product8=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product8.sendKeys("Productcode095");
		Thread.sleep(3000);
		Actions actionforproduct8= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		Thread.sleep(2000);
		
		
		WebElement  product9=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product9.sendKeys("Productcode094");
		Thread.sleep(3000);
		Actions actionforproduct9= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		Thread.sleep(2000);
		
		
		WebElement  product10=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product10.sendKeys("Productcode093");
		Thread.sleep(3000);
		Actions actionforproduct10= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		Thread.sleep(2000);
		*/
		WebElement cashbtn=driver.findElement(By.id("cashbtn"));
		cashbtn.click();
		Thread.sleep(3000);
		WebElement paybtn=driver.findElement(By.id("SaveCashFromtendered_btn"));
		paybtn.click();
		Thread.sleep(3000);
		
	}
}
