package multipleEmployeelogin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class employeepunchingMultiplebillsWith100prod {
	
	@Test(invocationCount = 5)
	public void TestEmployee1login () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.175.145:8080/dashboard");
		driver.manage().window().maximize();
		WebElement userName=driver.findElement(By.xpath("//input[@name='userName']"));
		userName.sendKeys("vyaparerp");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("123456789");
		WebElement button=driver.findElement(By.xpath("//button[@name='signin_submit']"));
		button.click();
		Thread.sleep(2000);
		
		WebElement pos=driver.findElement(By.partialLinkText("POS"));
		pos.click();	
		Thread.sleep(1000);
		WebElement new1=driver.findElement(By.partialLinkText("New"));
		new1.click();
		Thread.sleep(5000);
	
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
		
		
		WebElement  product3=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product3.sendKeys("Productcode100");
		Thread.sleep(1000);
		Actions actionforproduct3= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		
		WebElement  product4=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product4.sendKeys("Productcode099");
		Thread.sleep(1000);
		Actions actionforproduct4= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		
		WebElement  product5=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product5.sendKeys("Productcode098");
		Thread.sleep(1000);
		Actions actionforproduct5= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product6=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product6.sendKeys("Productcode097");
		Thread.sleep(1000);
		Actions actionforproduct6= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product7=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product7.sendKeys("Productcode096");
		Thread.sleep(1000);
		Actions actionforproduct7= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
	
		WebElement  product8=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product8.sendKeys("Productcode095");
		Thread.sleep(1000);
		Actions actionforproduct8= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product9=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product9.sendKeys("Productcode094");
		Thread.sleep(1000);
		Actions actionforproduct9= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product10=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product10.sendKeys("Productcode093");
		Thread.sleep(1000);
		Actions actionforproduct10= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();

		WebElement  product11=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product11.sendKeys("Productcode092");
		Thread.sleep(1000);
		Actions actionforproduct11= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product12=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product12.sendKeys("Productcode091");
		Thread.sleep(1000);
		Actions actionforproduct12= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		
		WebElement  product13=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product13.sendKeys("Productcode090");
		Thread.sleep(1000);
		Actions actionforproduct13= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		
		WebElement  product14=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product14.sendKeys("Productcode089");
		Thread.sleep(1000);
		Actions actionforproduct14= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		
		WebElement  product15=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product15.sendKeys("Productcode088");
		Thread.sleep(1000);
		Actions actionforproduct15= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product16=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product16.sendKeys("Productcode087");
		Thread.sleep(1000);
		Actions actionforproduct16= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		
		WebElement  product17=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product17.sendKeys("Productcode086");
		Thread.sleep(1000);
		Actions actionforproduct17= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product18=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product18.sendKeys("Productcode085");
		Thread.sleep(1000);
		Actions actionforproduct18= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product19=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product19.sendKeys("Productcode084");
		Thread.sleep(1000);
		Actions actionforproduct19= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();	
		
		WebElement  product20=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product20.sendKeys("Productcode083");
		Thread.sleep(1000);
		Actions actionforproduct20= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		
		WebElement cashbtn=driver.findElement(By.id("cashbtn"));
		cashbtn.click();
		Thread.sleep(2000);
		WebElement paybtn=driver.findElement(By.id("SaveCashFromtendered_btn"));
		paybtn.click();
		Thread.sleep(5000);
	}
	
	     @Test(invocationCount = 5)
		 public void TestEmployee2login () throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://192.168.175.145:8080/dashboard");
			driver.manage().window().maximize();
			WebElement userName=driver.findElement(By.xpath("//input[@name='userName']"));
			userName.sendKeys("vahid.test");
			WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys("vahid.test");
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
			
			
			WebElement  product3=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product3.sendKeys("Productcode100");
			Thread.sleep(1000);
			Actions actionforproduct3= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product4=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product4.sendKeys("Productcode099");
			Thread.sleep(1000);
			Actions actionforproduct4= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product5=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product5.sendKeys("Productcode098");
			Thread.sleep(1000);
			Actions actionforproduct5= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product6=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product6.sendKeys("Productcode097");
			Thread.sleep(1000);
			Actions actionforproduct6= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product7=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product7.sendKeys("Productcode096");
			Thread.sleep(1000);
			Actions actionforproduct7= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product8=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product8.sendKeys("Productcode095");
			Thread.sleep(1000);
			Actions actionforproduct8= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product9=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product9.sendKeys("Productcode094");
			Thread.sleep(1000);
			Actions actionforproduct9= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product10=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product10.sendKeys("Productcode093");
			Thread.sleep(1000);
			Actions actionforproduct10= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();

			WebElement  product11=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product11.sendKeys("Productcode092");
			Thread.sleep(1000);
			Actions actionforproduct11= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product12=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product12.sendKeys("Productcode091");
			Thread.sleep(1000);
			Actions actionforproduct12= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product13=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product13.sendKeys("Productcode090");
			Thread.sleep(1000);
			Actions actionforproduct13= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product14=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product14.sendKeys("Productcode089");
			Thread.sleep(1000);
			Actions actionforproduct14= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product15=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product15.sendKeys("Productcode088");
			Thread.sleep(1000);
			Actions actionforproduct15= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product16=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product16.sendKeys("Productcode087");
			Thread.sleep(1000);
			Actions actionforproduct16= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product17=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product17.sendKeys("Productcode086");
			Thread.sleep(1000);
			Actions actionforproduct17= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product18=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product18.sendKeys("Productcode085");
			Thread.sleep(1000);
			Actions actionforproduct18= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product19=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product19.sendKeys("Productcode084");
			Thread.sleep(1000);
			Actions actionforproduct19= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();	
			
			WebElement  product20=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product20.sendKeys("Productcode083");
			Thread.sleep(1000);
			Actions actionforproduct20= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			
			WebElement cashbtn=driver.findElement(By.id("cashbtn"));
			cashbtn.click();
			Thread.sleep(2000);
			WebElement paybtn=driver.findElement(By.id("SaveCashFromtendered_btn"));
			paybtn.click();
			Thread.sleep(5000);
		}
			
	  @Test(invocationCount = 5)
		public void TestEmployee3login () throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://192.168.175.145:8080/dashboard");
			driver.manage().window().maximize();
			WebElement userName=driver.findElement(By.xpath("//input[@name='userName']"));
			userName.sendKeys("iucregtest22");
			WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys("123456789");
			WebElement button=driver.findElement(By.xpath("//button[@name='signin_submit']"));
			button.click();
			/*
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
			Thread.sleep(2000);*/
			Actions action = new Actions(driver);
			
			
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
			
			
			WebElement  product3=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product3.sendKeys("Productcode100");
			Thread.sleep(1000);
			Actions actionforproduct3= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product4=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product4.sendKeys("Productcode099");
			Thread.sleep(1000);
			Actions actionforproduct4= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product5=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product5.sendKeys("Productcode098");
			Thread.sleep(1000);
			Actions actionforproduct5= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product6=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product6.sendKeys("Productcode097");
			Thread.sleep(1000);
			Actions actionforproduct6= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product7=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product7.sendKeys("Productcode096");
			Thread.sleep(1000);
			Actions actionforproduct7= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product8=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product8.sendKeys("Productcode095");
			Thread.sleep(1000);
			Actions actionforproduct8= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product9=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product9.sendKeys("Productcode094");
			Thread.sleep(1000);
			Actions actionforproduct9= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product10=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product10.sendKeys("Productcode093");
			Thread.sleep(1000);
			Actions actionforproduct10= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();

			WebElement  product11=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode092");
			Thread.sleep(1000);
			Actions actionforproduct11= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product12=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode091");
			Thread.sleep(1000);
			Actions actionforproduct12= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product13=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode090");
			Thread.sleep(1000);
			Actions actionforproduct13= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product14=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode089");
			Thread.sleep(1000);
			Actions actionforproduct14= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product15=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode088");
			Thread.sleep(1000);
			Actions actionforproduct15= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product16=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode087");
			Thread.sleep(1000);
			Actions actionforproduct16= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product17=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode086");
			Thread.sleep(1000);
			Actions actionforproduct17= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product18=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode085");
			Thread.sleep(1000);
			Actions actionforproduct18= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product19=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode084");
			Thread.sleep(1000);
			Actions actionforproduct19= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();	
			
			WebElement  product20=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode083");
			Thread.sleep(1000);
			Actions actionforproduct20= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement cashbtn=driver.findElement(By.id("cashbtn"));
			cashbtn.click();
			Thread.sleep(2000);
			WebElement paybtn=driver.findElement(By.id("SaveCashFromtendered_btn"));
			paybtn.click();
			Thread.sleep(5000);
		}
			
}
