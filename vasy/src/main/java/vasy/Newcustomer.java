package vasy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newcustomer {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\geckodriver-v0.22.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();

		driver.get("https://croods.vasyerp.com/login?logout");
		driver.manage().window().maximize();
		WebElement userName=driver.findElement(By.xpath("//input[@name='userName']"));
		userName.sendKeys("vyaparerp");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("123456789");
		//	Actions actions=new Actions(driver);

		WebElement button=driver.findElement(By.xpath("//button[@name='signin_submit']"));
		button.click();
		Thread.sleep(5000);

		WebElement contacts=driver.findElement(By.xpath("//i[@class='m-menu__link-icon m-menu__link-icon fa fa-user']"));
		contacts.click();

		Thread.sleep(5000);
		WebElement customer=driver.findElement(By.partialLinkText("Customers"));
		customer.click();

		WebElement createNewcustomer=driver.findElement(By.xpath("//a[@id='newContact']"));
		createNewcustomer.click();

		WebElement firstName=driver.findElement(By.name("firstName"));
		firstName.sendKeys("EnterFirstName");

		WebElement  lastName=driver.findElement(By.name("lastName"));
		lastName.sendKeys("EnterLastName");

		WebElement  CompName=driver.findElement(By.id("companyName"));
		CompName.sendKeys("Enter Company Name");

		WebElement  mobNumber=driver.findElement(By.id("mobNo"));
		mobNumber.sendKeys("987654321023");

		WebElement  watsNumber=driver.findElement(By.id("whatsappNo"));
		watsNumber.sendKeys("9876543210");
		Thread.sleep(5000);

		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("abdch@gmail.com");

		WebElement remark=driver.findElement(By.name("remark"));
		remark.sendKeys("Na");

		driver.findElement(By.xpath("//span[@id='select2-gst_type-container']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='select2-dropdown select2-dropdown--below']//span[2]/ul/li[4]")).click();
		driver.findElement(By.xpath("//input[@id='gstin']")).sendKeys("asdr5543ww");


		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[@class='m-checkbox m-checkbox--solid m-checkbox--brand']")).click();


		//driver.findElements(By.xpath("//ul[conatins(@class,'select2-results__options']//li//class"));
		//WebElement Pan=driver.findElement(By.name("panNo"));
		//Pan.sendKeys("NASdEJ5421GH");


		WebElement Credit=driver.findElement(By.name("creditLimit"));
		Credit.sendKeys("10000");


		WebElement Addres=driver.findElement(By.name("contactAddressVos[0].addressLine1"));
		Addres.sendKeys("abc colony,xyz street");


		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//span[@id='select2-stateCode0-container']"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
		
		List <WebElement> statelist= driver.findElements(By.xpath("	//ul[@class='select2-results__options']//li"));
		System.out.println(statelist.size());
		for(int i=0;i<statelist.size();i++) {
			System.out.println(statelist.get(i).getText());
			if(statelist.get(i).getText().contains("Maharashtra")) {
				statelist.get(i).click();
				break;
			}
		}
		
		Thread.sleep(5000);  
       
		WebElement clickcity = driver.findElement(By.xpath("//span[@id='select2-cityCode0-container']"));
		clickcity.click();
       List <WebElement> citylist=driver.findElements(By.xpath("//ul[@id='select2-cityCode0-results']//li"));
		System.out.println(citylist.size());
		for(int i=0;i<citylist.size();i++) {
			System.out.println(citylist.get(i).getText());
			if(citylist.get(i).getText().contains("Dhule")) {
				citylist.get(i).click();
				break;
			}
		}
		
		
		driver.findElement(By.xpath("//input[@id='contactAddressVos[0].pinCode']")).sendKeys("424001");
		
		WebElement payment=driver.findElement(By.xpath("//span[contains(text(),'Select Payment Mode')]"));
		payment.click();
		
		 List <WebElement> selectpay=driver.findElements(By.xpath("//ul[@id='select2-payment_mode-results']//li"));
		 System.out.println(selectpay.size());
			for(int i=0;i<selectpay.size();i++) {
				System.out.println(selectpay.get(i).getText());
				if(selectpay.get(i).getText().contains("GUGLUU")) {
					selectpay.get(i).click();
					break;
				}
			}
		 Thread.sleep(5000);
		 
			WebElement payterms=driver.findElement(By.xpath("//span[@id='select2-payment_term-container']"));
			payterms.click();
			
			List <WebElement> paytermslist=driver.findElements(By.xpath("//ul[@id='select2-payment_term-results']//li"));	
			 System.out.println(paytermslist.size());
				for(int i=0;i<paytermslist.size();i++) {
					System.out.println(paytermslist.get(i).getText());
					if(paytermslist.get(i).getText().contains("instructions")) {
						paytermslist.get(i).click();
						break;
					}
				}
				
				driver.findElement(By.name("opening")).sendKeys("10000");
				
				driver.findElement(By.xpath("//div[@class='col-lg-12 p-0']//label[3]")).click();
     
		WebElement CreateNew=driver.findElement(By.xpath("//button[@id='save_contact']"));
		CreateNew.click();
		
		Thread.sleep(5000);
		driver.quit();


		//bug in calendar
		//driver.findElement(By.xpath("//input[@id='dateOfBirth']")).click();
		//driver.findElement(By.xpath("//td[@class='day']");


		/*driver.findElement(By.id("select2-gst_type-container")).click();
		WebElement forgst=driver.findElement(By.xpath("//input[@type='search']"));
	    forgst.sendKeys("Consumer");
		 */




	}

}
