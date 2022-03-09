package vasy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewEmployee {

	public static void main(String[] args) throws Exception {
	/*	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\chromedriver_win32\\chromedriver.exe");
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
		WebElement Employee=driver.findElement(By.partialLinkText("Employee"));
		Employee.click();

		WebElement createNewEmployee=driver.findElement(By.xpath("//a[@id='newEmployee']"));
		createNewEmployee.click();


		WebElement EmpName=driver.findElement(By.name("name"));
		EmpName.sendKeys("Employee Name");

		WebElement  mobNumber=driver.findElement(By.id("mobNo"));
		mobNumber.sendKeys("987654321023");

		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("Employee1@gmail.com");

		WebElement EmpPan=driver.findElement(By.name("panNo"));
		EmpPan.sendKeys("aclpf4266k");

		WebElement manager=driver.findElement(By.xpath("//label[@class='m-checkbox m-checkbox--solid m-checkbox--brand ']//span"));
		manager.click();

		WebElement IsdeleviryUser=driver.findElement(By.xpath("//div[@class='col-md-2'][4]/div[1]/div[1]/label[1]/span[1]"));
		IsdeleviryUser.click();

		driver.findElement(By.name("address")).sendKeys("Employee address");

		driver.findElement(By.id("select2-stateCode-container")).click();

		List <WebElement> statelist= driver.findElements(By.xpath("//ul[@id='select2-stateCode-results']//li"));
		System.out.println(statelist.size());
		for(int i=0;i<statelist.size();i++) {
			System.out.println(statelist.get(i).getText());
			if(statelist.get(i).getText().contains("Delhi")) {
				statelist.get(i).click();
				break;
			}
		}

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='select2-cityCode-container']")).click();


		List <WebElement> citylist= driver.findElements(By.xpath("//ul[@id='select2-cityCode-results']//li"));
		System.out.println(citylist.size());
		for(int i=0;i<citylist.size();i++) {
			System.out.println(citylist.get(i).getText());
			if(citylist.get(i).getText().contains("Delhi Municipal Corporation (U)")) {
				citylist.get(i).click();
				break;
			}
		}
		WebElement pincode=driver.findElement(By.name("pincode"));
		pincode.sendKeys("548752");

		WebElement BankName=driver.findElement(By.name("bankName"));
		BankName.sendKeys("VasyBank");
		WebElement BranchName=driver.findElement(By.name("bankBranch"));
		BranchName.sendKeys("ahemdabad");
		WebElement accountNum=driver.findElement(By.name("bankAcno"));
		accountNum.sendKeys("78965432105");
		WebElement IFSC=driver.findElement(By.name("bankIFSC"));
		IFSC.sendKeys("VASY0566874");
		WebElement accountholder=driver.findElement(By.name("bankAcholderName"));
		accountholder.sendKeys("Vasy Employee1");
		WebElement swiftCode=driver.findElement(By.name("bankSwiftCode"));
		swiftCode.sendKeys("779542VASY");
		WebElement 	Wages=driver.findElement(By.name("wages"));
		Wages.sendKeys("770");
		WebElement 	com=driver.findElement(By.name("commission"));
		com.sendKeys("7"); 
		WebElement 	extraWages=driver.findElement(By.name("extraWages"));
		extraWages.sendKeys("300");

		//WebElement 	Cancelbutton=driver.findElement(By.xpath(" //a[@id='cancel_employee']"));
		// Cancelbutton.click();

		//WebElement 	Subbmitbutton=driver.findElement(By.xpath("//button[@id='save_employee']"));
		//Subbmitbutton.click();

		Thread.sleep(5000);
		driver.quit();
	}
}
