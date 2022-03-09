package vasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VasySignup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\geckodriver-v0.22.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();


		String singupUrl="https://croods.vasyerp.com/signup";
		driver.get(singupUrl);



		driver.manage().window().maximize();
		WebElement businessName=driver.findElement(By.xpath("//input[@title='Please Enter Your Store Name']"));
		businessName.sendKeys("ABC PVT LTD");
		Select drpBusinessType=new Select(driver.findElement(By.id("industry_list")));
		drpBusinessType.selectByVisibleText("Mobile Stores");

		Select countries=new Select(driver.findElement(By.id("countriesCode")));
		countries.selectByVisibleText("India");

		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("qwert@abc.com");

		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("asdf1234");

		WebElement firstname=driver.findElement(By.xpath("//input[@name='signup[first_name]']"));
		firstname.sendKeys("ramesh");

		WebElement lastName=driver.findElement(By.id("lastname"));
		lastName.sendKeys("Patel");


		WebElement phonenum=driver.findElement(By.xpath("//input[@name='signup[phone]']"));
		phonenum.sendKeys("9876543210");

		WebElement button=driver.findElement(By.xpath("//button[@id='sendotpbtn']"));
		button.click();

		Thread.sleep(10000);
		WebElement submitbutton=driver.findElement(By.xpath("//button[@id='submit_button']"));
		submitbutton.click();

	}
}
