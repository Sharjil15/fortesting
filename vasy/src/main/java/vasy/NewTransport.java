package vasy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTransport {

	public static void main(String[] args) throws Exception {
		/*    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		*/
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\geckodriver-v0.22.0-win64\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    
		driver.get("https://croods.vasyerp.com/login?logout");
		driver.manage().window().maximize();
		WebElement userName=driver.findElement(By.xpath("//input[@name='userName']"));
		userName.sendKeys("vyaparerp");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("123456789");

		WebElement button=driver.findElement(By.xpath("//button[@name='signin_submit']"));
		button.click();
		Thread.sleep(5000);

		WebElement contacts=driver.findElement(By.xpath("//i[@class='m-menu__link-icon m-menu__link-icon fa fa-user']"));
		contacts.click();

		Thread.sleep(5000);
		WebElement Trans=driver.findElement(By.partialLinkText("Transport"));
		Trans.click();
		
		WebElement createNewTransport=driver.findElement(By.xpath("//a[@id='newContact']"));
		createNewTransport.click();
		Thread.sleep(5000);
		
		WebElement firstName=driver.findElement(By.name("firstName"));
		firstName.sendKeys("TransportFirstName");

		WebElement  lastName=driver.findElement(By.name("lastName"));
		lastName.sendKeys("TransportLastName");

		WebElement  CompName=driver.findElement(By.id("companyName"));
		CompName.sendKeys("Transport Company Name");
		
		WebElement  mobNumber=driver.findElement(By.id("mobNo"));
		mobNumber.sendKeys("98765432478");

        WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("Transporter@gmail.com");
		
		WebElement remark=driver.findElement(By.name("remark"));
		remark.sendKeys("I am Transporter");
		
		driver.findElement(By.xpath("//span[@id='select2-gst_type-container']")).click();

		List <WebElement> statelist= driver.findElements(By.xpath("//ul[@id='select2-gst_type-results']//li"));
		System.out.println(statelist.size());
		for(int i=0;i<statelist.size();i++) {
			System.out.println(statelist.get(i).getText());
			if(statelist.get(i).getText().contains("Overseas")) {
				statelist.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("gstin")).sendKeys("24AADCB2230M1Z2");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[@class='m-checkbox m-checkbox--solid m-checkbox--brand']")).click();
        WebElement Credit=driver.findElement(By.name("creditLimit"));
		
        Credit.sendKeys("55000");
		driver.findElement(By.id("contactAddressVos[0].addressLine1")).sendKeys("Transporter Colony,Transport road");
		driver.findElement(By.name("contactAddressVos[0].addressLine2")).sendKeys("Transporter City,near transport pvt");
		
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//span[@id='select2-stateCode0-container']"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
		
		List <WebElement> statelist1= driver.findElements(By.xpath("//ul[@class='select2-results__options']//li"));
		System.out.println(statelist1.size());
		for(int i=0;i<statelist1.size();i++) {
			System.out.println(statelist1.get(i).getText());
			if(statelist1.get(i).getText().contains("Rajasthan")) {
				statelist1.get(i).click();
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
			if(citylist.get(i).getText().contains("Ajmer")) {
				citylist.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//input[@id='contactAddressVos[0].pinCode']")).sendKeys("457990");

		WebElement payment=driver.findElement(By.xpath("//span[contains(text(),'Select Payment Mode')]"));
		payment.click();

		List <WebElement> selectpay=driver.findElements(By.xpath("//ul[@id='select2-payment_mode-results']//li"));
		System.out.println(selectpay.size());
		for(int i=0;i<selectpay.size();i++) {
			System.out.println(selectpay.get(i).getText());
			if(selectpay.get(i).getText().contains("pgyt")) {
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
			if(paytermslist.get(i).getText().contains("AAAA")) {
				paytermslist.get(i).click();
				break;
			}
		}
		driver.findElement(By.name("opening")).sendKeys("55000");
		WebElement CreateNew=driver.findElement(By.xpath("//button[@id='save_contact']"));
		CreateNew.click();
		Thread.sleep(5000);
		WebElement Delete=driver.findElement(By.id("contact_delete"));
		Delete.click();
		Thread.sleep(5000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		WebElement del = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		js2.executeScript("arguments[0].scrollIntoView();", del);
		del.click();
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
