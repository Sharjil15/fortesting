package dhar7companies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class croodstest {
	@Test
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
		Thread.sleep(3000);
		
		WebElement pos=driver.findElement(By.partialLinkText("POS"));
		pos.click();	
		Thread.sleep(2000);
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
		
	
		WebElement  product21=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product21.sendKeys("Productcode082");
		Thread.sleep(1000);
		Actions actionforproduct21= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();	
		
		WebElement  product22=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product22.sendKeys("Productcode081");
		Thread.sleep(1000);
		Actions actionforproduct22= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product23=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product23.sendKeys("Productcode080");
		Thread.sleep(1000);
		Actions actionforproduct23= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		
		WebElement  product24=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product24.sendKeys("Productcode079");
		Thread.sleep(1000);
		Actions actionforproduct24= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		
		WebElement  product25=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product25.sendKeys("Productcode078");
		Thread.sleep(1000);
		Actions actionforproduct25= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product26=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product26.sendKeys("Productcode077");
		Thread.sleep(1000);
		Actions actionforproduct26= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product27=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product27.sendKeys("Productcode076");
		Thread.sleep(1000);
		Actions actionforproduct27= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product28=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product28.sendKeys("Productcode075");
		Thread.sleep(1000);
		Actions actionforproduct28= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		
		WebElement  product29=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product29.sendKeys("Productcode074");
		Thread.sleep(1000);
		Actions actionforproduct29= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product30=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product30.sendKeys("Productcode073");
		Thread.sleep(1000);
		Actions actionforproduct30= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product31=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product31.sendKeys("Productcode072");
		Thread.sleep(1000);
		Actions actionforproduct31= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product32=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product32.sendKeys("Productcode071");
		Thread.sleep(1000);
		Actions actionforproduct32= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product33=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product33.sendKeys("Productcode070");
		Thread.sleep(1000);
		Actions actionforproduct33= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
	
		WebElement  product34=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product34.sendKeys("Productcode069");
		Thread.sleep(1000);
		Actions actionforproduct34= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product35=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product35.sendKeys("Productcode068");
		Thread.sleep(1000);
		Actions actionforproduct35= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product36=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product36.sendKeys("Productcode067");
		Thread.sleep(1000);
		Actions actionforproduct36= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product37=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product37.sendKeys("Productcode066");
		Thread.sleep(1000);
		Actions actionforproduct37= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
	
		WebElement  product38=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product38.sendKeys("Productcode065");
		Thread.sleep(1000);
		Actions actionforproduct38= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
	
		WebElement  product39=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product39.sendKeys("Productcode064");
		Thread.sleep(1000);
		Actions actionforproduct39= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product40=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product40.sendKeys("Productcode063");
		Thread.sleep(1000);
		Actions actionforproduct40= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product41=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product41.sendKeys("Productcode062");
		Thread.sleep(1000);
		Actions actionforproduct41= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		
		WebElement  product42=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product42.sendKeys("Productcode061");
		Thread.sleep(1000);
		Actions actionforproduct42= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
	
		WebElement  product43=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product43.sendKeys("Productcode060");
		Thread.sleep(1000);
		Actions actionforproduct43= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product44=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product44.sendKeys("Productcode059");
		Thread.sleep(1000);
		Actions actionforproduct44= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product45=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product45.sendKeys("Productcode058");
		Thread.sleep(1000);
		Actions actionforproduct45= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product46=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product46.sendKeys("Productcode057");
		Thread.sleep(1000);
		Actions actionforproduct46= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
	
		WebElement  product47=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product47.sendKeys("Productcode056");
		Thread.sleep(1000);
		Actions actionforproduct47= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product48=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product48.sendKeys("Productcode055");
		Thread.sleep(1000);
		Actions actionforproduct48= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product49=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product49.sendKeys("Productcode054");
		Thread.sleep(1000);
		Actions actionforproduct49= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product50=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product50.sendKeys("Productcode053");
		Thread.sleep(1000);
		Actions actionforproduct50= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product51=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product51.sendKeys("Productcode052");
		Thread.sleep(1000);
		Actions actionforproduct51= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		
		WebElement  product52=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product52.sendKeys("Productcode051");
		Thread.sleep(1000);
		Actions actionforproduct52= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		
		WebElement  product53=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product53.sendKeys("Productcode050");
		Thread.sleep(1000);
		Actions actionforproduct53= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		
		WebElement  product54=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product54.sendKeys("Productcode049");
		Thread.sleep(1000);
		Actions actionforproduct54= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		
		WebElement  product55=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product55.sendKeys("Productcode048");
		Thread.sleep(1000);
		Actions actionforproduct55= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		
		WebElement  product56=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product56.sendKeys("Productcode047");
		Thread.sleep(1000);
		Actions actionforproduct56= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
	
		WebElement  product57=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product57.sendKeys("Productcode046");
		Thread.sleep(1000);
		Actions actionforproduct57= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product58=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product58.sendKeys("Productcode045");
		Thread.sleep(1000);
		Actions actionforproduct58= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product59=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product59.sendKeys("Productcode044");
		Thread.sleep(1000);
		Actions actionforproduct59= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product60=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product60.sendKeys("Productcode043");
		Thread.sleep(1000);
		Actions actionforproduct60= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product61=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product61.sendKeys("Productcode042");
		Thread.sleep(1000);
		Actions actionforproduct61= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product62=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product62.sendKeys("Productcode041");
		Thread.sleep(1000);
		Actions actionforproduct62= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product63=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product63.sendKeys("Productcode040");
		Thread.sleep(1000);
		Actions actionforproduct63= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product64=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product64.sendKeys("Productcode039");
		Thread.sleep(1000);
		Actions actionforproduct64= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product65=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product65.sendKeys("Productcode038");
		Thread.sleep(1000);
		Actions actionforproduct65= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product66=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product66.sendKeys("Productcode037");
		Thread.sleep(1000);
		Actions actionforproduct66= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product67=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product67.sendKeys("Productcode036");
		Thread.sleep(1000);
		Actions actionforproduct67= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product68=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product68.sendKeys("Productcode035");
		Thread.sleep(1000);
		Actions actionforproduct68= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product69=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product69.sendKeys("Productcode034");
		Thread.sleep(1000);
		Actions actionforproduct69= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
	
		WebElement  product70=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product70.sendKeys("Productcode033");
		Thread.sleep(1000);
		Actions actionforproduct70= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product71=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product71.sendKeys("Productcode032");
		Thread.sleep(1000);
		Actions actionforproduct71= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product72=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product72.sendKeys("Productcode031");
		Thread.sleep(1000);
		Actions actionforproduct72= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product73=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product73.sendKeys("Productcode030");
		Thread.sleep(1000);
		Actions actionforproduct73= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product74=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product74.sendKeys("Productcode029");
		Thread.sleep(1000);
		Actions actionforproduct74= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product75=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product75.sendKeys("Productcode028");
		Thread.sleep(1000);
		Actions actionforproduct75= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product76=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product76.sendKeys("Productcode027");
		Thread.sleep(1000);
		Actions actionforproduct76= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product77=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product77.sendKeys("Productcode026");
		Thread.sleep(1000);
		Actions actionforproduct77= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product78=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product78.sendKeys("Productcode025");
		Thread.sleep(1000);
		Actions actionforproduct78= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
	
		WebElement  product79=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product79.sendKeys("Productcode024");
		Thread.sleep(1000);
		Actions actionforproduct79= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product80=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product80.sendKeys("Productcode023");
		Thread.sleep(1000);
		Actions actionforproduct80= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product81=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product81.sendKeys("Productcode022");
		Thread.sleep(1000);
		Actions actionforproduct81= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product82=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product82.sendKeys("Productcode021");
		Thread.sleep(1000);
		Actions actionforproduct82= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product83=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product83.sendKeys("Productcode020");
		Thread.sleep(1000);
		Actions actionforproduct83= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product84=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product84.sendKeys("Productcode019");
		Thread.sleep(1000);
		Actions actionforproduct84= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product85=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product85.sendKeys("Productcode018");
		Thread.sleep(1000);
		Actions actionforproduct85= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product86=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product86.sendKeys("Productcode017");
		Thread.sleep(1000);
		Actions actionforproduct86= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product87=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product87.sendKeys("Productcode016");
		Thread.sleep(1000);
		Actions actionforproduct87= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product88=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product88.sendKeys("Productcode015");
		Thread.sleep(1000);
		Actions actionforproduct88= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product89=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product89.sendKeys("Productcode014");
		Thread.sleep(1000);
		Actions actionforproduct89= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product90=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product90.sendKeys("Productcode013");
		Thread.sleep(1000);
		Actions actionforproduct90= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product91=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product91.sendKeys("Productcode012");
		Thread.sleep(1000);
		Actions actionforproduct91= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product92=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product92.sendKeys("Productcode011");
		Thread.sleep(1000);
		Actions actionforproduct92= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product93=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product93.sendKeys("Productcode010");
		Thread.sleep(1000);
		Actions actionforproduct93= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product94=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product94.sendKeys("Productcode009");
		Thread.sleep(1000);
		Actions actionforproduct94= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
	
		WebElement  product95=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product95.sendKeys("Productcode008");
		Thread.sleep(1000);
		Actions actionforproduct95= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
	
		WebElement  product96=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product96.sendKeys("Productcode007");
		Thread.sleep(1000);
		Actions actionforproduct96= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product97=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product97.sendKeys("Productcode006");
		Thread.sleep(1000);
		Actions actionforproduct97= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product98=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product98.sendKeys("Productcode005");
		Thread.sleep(1000);
		Actions actionforproduct98= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product99=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product99.sendKeys("Productcode004");
		Thread.sleep(1000);
		Actions actionforproduct99= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		WebElement  product100=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
		product100.sendKeys("Productcode003");
		Thread.sleep(1000);
		Actions actionforproduct100= new Actions(driver);
		action.sendKeys(Keys.RETURN);
		action.perform();
		
		
		WebElement cashbtn=driver.findElement(By.id("cashbtn"));
		cashbtn.click();
		Thread.sleep(2000);
		WebElement paybtn=driver.findElement(By.id("SaveCashFromtendered_btn"));
		paybtn.click();
		Thread.sleep(5000);
	}
	
	     @Test
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
			
		
			WebElement  product21=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product21.sendKeys("Productcode082");
			Thread.sleep(1000);
			Actions actionforproduct21= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();	
			
			WebElement  product22=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product22.sendKeys("Productcode081");
			Thread.sleep(1000);
			Actions actionforproduct22= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product23=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product23.sendKeys("Productcode080");
			Thread.sleep(1000);
			Actions actionforproduct23= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product24=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product24.sendKeys("Productcode079");
			Thread.sleep(1000);
			Actions actionforproduct24= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product25=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product25.sendKeys("Productcode078");
			Thread.sleep(1000);
			Actions actionforproduct25= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product26=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product26.sendKeys("Productcode077");
			Thread.sleep(1000);
			Actions actionforproduct26= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product27=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product27.sendKeys("Productcode076");
			Thread.sleep(1000);
			Actions actionforproduct27= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product28=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product28.sendKeys("Productcode075");
			Thread.sleep(1000);
			Actions actionforproduct28= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product29=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product29.sendKeys("Productcode074");
			Thread.sleep(1000);
			Actions actionforproduct29= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product30=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product30.sendKeys("Productcode073");
			Thread.sleep(1000);
			Actions actionforproduct30= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product31=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product31.sendKeys("Productcode072");
			Thread.sleep(1000);
			Actions actionforproduct31= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product32=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product32.sendKeys("Productcode071");
			Thread.sleep(1000);
			Actions actionforproduct32= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product33=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product33.sendKeys("Productcode070");
			Thread.sleep(1000);
			Actions actionforproduct33= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product34=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product34.sendKeys("Productcode069");
			Thread.sleep(1000);
			Actions actionforproduct34= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product35=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product35.sendKeys("Productcode068");
			Thread.sleep(1000);
			Actions actionforproduct35= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product36=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product36.sendKeys("Productcode067");
			Thread.sleep(1000);
			Actions actionforproduct36= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product37=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product37.sendKeys("Productcode066");
			Thread.sleep(1000);
			Actions actionforproduct37= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
		
			WebElement  product38=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product38.sendKeys("Productcode065");
			Thread.sleep(1000);
			Actions actionforproduct38= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product39=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product39.sendKeys("Productcode064");
			Thread.sleep(1000);
			Actions actionforproduct39= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product40=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product40.sendKeys("Productcode063");
			Thread.sleep(1000);
			Actions actionforproduct40= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product41=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product41.sendKeys("Productcode062");
			Thread.sleep(1000);
			Actions actionforproduct41= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product42=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product42.sendKeys("Productcode061");
			Thread.sleep(1000);
			Actions actionforproduct42= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
		
			WebElement  product43=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product43.sendKeys("Productcode060");
			Thread.sleep(1000);
			Actions actionforproduct43= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product44=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product44.sendKeys("Productcode059");
			Thread.sleep(1000);
			Actions actionforproduct44= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product45=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product45.sendKeys("Productcode058");
			Thread.sleep(1000);
			Actions actionforproduct45= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product46=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product46.sendKeys("Productcode057");
			Thread.sleep(1000);
			Actions actionforproduct46= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product47=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product47.sendKeys("Productcode056");
			Thread.sleep(1000);
			Actions actionforproduct47= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product48=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product48.sendKeys("Productcode055");
			Thread.sleep(1000);
			Actions actionforproduct48= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product49=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product49.sendKeys("Productcode054");
			Thread.sleep(1000);
			Actions actionforproduct49= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product50=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product50.sendKeys("Productcode053");
			Thread.sleep(1000);
			Actions actionforproduct50= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product51=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product51.sendKeys("Productcode052");
			Thread.sleep(1000);
			Actions actionforproduct51= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product52=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product52.sendKeys("Productcode051");
			Thread.sleep(1000);
			Actions actionforproduct52= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product53=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product53.sendKeys("Productcode050");
			Thread.sleep(1000);
			Actions actionforproduct53= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product54=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product54.sendKeys("Productcode049");
			Thread.sleep(1000);
			Actions actionforproduct54= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product55=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product55.sendKeys("Productcode048");
			Thread.sleep(1000);
			Actions actionforproduct55= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product56=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product56.sendKeys("Productcode047");
			Thread.sleep(1000);
			Actions actionforproduct56= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product57=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product57.sendKeys("Productcode046");
			Thread.sleep(1000);
			Actions actionforproduct57= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product58=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product58.sendKeys("Productcode045");
			Thread.sleep(1000);
			Actions actionforproduct58= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product59=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product59.sendKeys("Productcode044");
			Thread.sleep(1000);
			Actions actionforproduct59= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product60=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product60.sendKeys("Productcode043");
			Thread.sleep(1000);
			Actions actionforproduct60= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product61=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product61.sendKeys("Productcode042");
			Thread.sleep(1000);
			Actions actionforproduct61= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product62=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product62.sendKeys("Productcode041");
			Thread.sleep(1000);
			Actions actionforproduct62= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product63=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product63.sendKeys("Productcode040");
			Thread.sleep(1000);
			Actions actionforproduct63= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product64=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product64.sendKeys("Productcode039");
			Thread.sleep(1000);
			Actions actionforproduct64= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product65=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product65.sendKeys("Productcode038");
			Thread.sleep(1000);
			Actions actionforproduct65= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product66=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product66.sendKeys("Productcode037");
			Thread.sleep(1000);
			Actions actionforproduct66= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product67=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product67.sendKeys("Productcode036");
			Thread.sleep(1000);
			Actions actionforproduct67= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product68=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product68.sendKeys("Productcode035");
			Thread.sleep(1000);
			Actions actionforproduct68= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product69=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product69.sendKeys("Productcode034");
			Thread.sleep(1000);
			Actions actionforproduct69= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product70=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product70.sendKeys("Productcode033");
			Thread.sleep(1000);
			Actions actionforproduct70= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product71=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product71.sendKeys("Productcode032");
			Thread.sleep(1000);
			Actions actionforproduct71= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product72=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product72.sendKeys("Productcode031");
			Thread.sleep(1000);
			Actions actionforproduct72= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product73=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product73.sendKeys("Productcode030");
			Thread.sleep(1000);
			Actions actionforproduct73= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product74=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product74.sendKeys("Productcode029");
			Thread.sleep(1000);
			Actions actionforproduct74= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product75=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product75.sendKeys("Productcode028");
			Thread.sleep(1000);
			Actions actionforproduct75= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product76=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product76.sendKeys("Productcode027");
			Thread.sleep(1000);
			Actions actionforproduct76= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product77=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product77.sendKeys("Productcode026");
			Thread.sleep(1000);
			Actions actionforproduct77= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product78=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product78.sendKeys("Productcode025");
			Thread.sleep(1000);
			Actions actionforproduct78= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product79=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product79.sendKeys("Productcode024");
			Thread.sleep(1000);
			Actions actionforproduct79= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product80=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product80.sendKeys("Productcode023");
			Thread.sleep(1000);
			Actions actionforproduct80= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product81=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product81.sendKeys("Productcode022");
			Thread.sleep(1000);
			Actions actionforproduct81= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product82=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product82.sendKeys("Productcode021");
			Thread.sleep(1000);
			Actions actionforproduct82= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product83=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product83.sendKeys("Productcode020");
			Thread.sleep(1000);
			Actions actionforproduct83= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product84=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product84.sendKeys("Productcode019");
			Thread.sleep(1000);
			Actions actionforproduct84= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product85=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product85.sendKeys("Productcode018");
			Thread.sleep(1000);
			Actions actionforproduct85= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product86=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product86.sendKeys("Productcode017");
			Thread.sleep(1000);
			Actions actionforproduct86= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product87=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product87.sendKeys("Productcode016");
			Thread.sleep(1000);
			Actions actionforproduct87= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product88=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product88.sendKeys("Productcode015");
			Thread.sleep(1000);
			Actions actionforproduct88= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product89=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product89.sendKeys("Productcode014");
			Thread.sleep(1000);
			Actions actionforproduct89= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product90=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product90.sendKeys("Productcode013");
			Thread.sleep(1000);
			Actions actionforproduct90= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product91=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product91.sendKeys("Productcode012");
			Thread.sleep(1000);
			Actions actionforproduct91= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product92=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product92.sendKeys("Productcode011");
			Thread.sleep(1000);
			Actions actionforproduct92= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product93=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product93.sendKeys("Productcode010");
			Thread.sleep(1000);
			Actions actionforproduct93= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product94=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product94.sendKeys("Productcode009");
			Thread.sleep(1000);
			Actions actionforproduct94= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product95=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product95.sendKeys("Productcode008");
			Thread.sleep(1000);
			Actions actionforproduct95= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product96=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product96.sendKeys("Productcode007");
			Thread.sleep(1000);
			Actions actionforproduct96= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product97=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product97.sendKeys("Productcode006");
			Thread.sleep(1000);
			Actions actionforproduct97= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product98=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product98.sendKeys("Productcode005");
			Thread.sleep(1000);
			Actions actionforproduct98= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product99=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product99.sendKeys("Productcode004");
			Thread.sleep(1000);
			Actions actionforproduct99= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product100=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product100.sendKeys("Productcode003");
			Thread.sleep(1000);
			Actions actionforproduct100= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			
			
			WebElement cashbtn=driver.findElement(By.id("cashbtn"));
			cashbtn.click();
			Thread.sleep(2000);
			WebElement paybtn=driver.findElement(By.id("SaveCashFromtendered_btn"));
			paybtn.click();
			Thread.sleep(5000);
		}
			
	  @Test
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
			
		
			WebElement  product21=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode082");
			Thread.sleep(1000);
			Actions actionforproduct21= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();	
			
			WebElement  product22=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode081");
			Thread.sleep(1000);
			Actions actionforproduct22= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product23=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode080");
			Thread.sleep(1000);
			Actions actionforproduct23= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product24=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode079");
			Thread.sleep(1000);
			Actions actionforproduct24= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product25=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode078");
			Thread.sleep(1000);
			Actions actionforproduct25= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product26=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode077");
			Thread.sleep(1000);
			Actions actionforproduct26= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product27=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode076");
			Thread.sleep(1000);
			Actions actionforproduct27= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product28=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode075");
			Thread.sleep(1000);
			Actions actionforproduct28= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product29=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode074");
			Thread.sleep(1000);
			Actions actionforproduct29= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product30=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode073");
			Thread.sleep(1000);
			Actions actionforproduct30= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product31=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode072");
			Thread.sleep(1000);
			Actions actionforproduct31= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product32=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode071");
			Thread.sleep(1000);
			Actions actionforproduct32= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product33=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode070");
			Thread.sleep(1000);
			Actions actionforproduct33= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product34=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode069");
			Thread.sleep(1000);
			Actions actionforproduct34= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product35=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode068");
			Thread.sleep(1000);
			Actions actionforproduct35= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product36=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode067");
			Thread.sleep(1000);
			Actions actionforproduct36= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product37=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode066");
			Thread.sleep(1000);
			Actions actionforproduct37= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
		
			WebElement  product38=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode065");
			Thread.sleep(1000);
			Actions actionforproduct38= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product39=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode064");
			Thread.sleep(1000);
			Actions actionforproduct39= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product40=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode063");
			Thread.sleep(1000);
			Actions actionforproduct40= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product41=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode062");
			Thread.sleep(1000);
			Actions actionforproduct41= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product42=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode061");
			Thread.sleep(1000);
			Actions actionforproduct42= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
		
			WebElement  product43=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode060");
			Thread.sleep(1000);
			Actions actionforproduct43= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product44=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode059");
			Thread.sleep(1000);
			Actions actionforproduct44= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product45=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode058");
			Thread.sleep(1000);
			Actions actionforproduct45= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product46=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode057");
			Thread.sleep(1000);
			Actions actionforproduct46= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product47=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode056");
			Thread.sleep(1000);
			Actions actionforproduct47= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product48=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode055");
			Thread.sleep(1000);
			Actions actionforproduct48= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product49=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode054");
			Thread.sleep(1000);
			Actions actionforproduct49= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product50=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode053");
			Thread.sleep(1000);
			Actions actionforproduct50= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product51=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product51.sendKeys("Productcode052");
			Thread.sleep(1000);
			Actions actionforproduct51= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product52=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product52.sendKeys("Productcode051");
			Thread.sleep(1000);
			Actions actionforproduct52= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product53=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product53.sendKeys("Productcode050");
			Thread.sleep(1000);
			Actions actionforproduct53= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product54=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product54.sendKeys("Productcode049");
			Thread.sleep(1000);
			Actions actionforproduct54= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product55=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product55.sendKeys("Productcode048");
			Thread.sleep(1000);
			Actions actionforproduct55= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product56=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product56.sendKeys("Productcode047");
			Thread.sleep(1000);
			Actions actionforproduct56= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product57=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product57.sendKeys("Productcode046");
			Thread.sleep(1000);
			Actions actionforproduct57= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product58=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product58.sendKeys("Productcode045");
			Thread.sleep(1000);
			Actions actionforproduct58= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product59=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product59.sendKeys("Productcode044");
			Thread.sleep(1000);
			Actions actionforproduct59= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product60=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product60.sendKeys("Productcode043");
			Thread.sleep(1000);
			Actions actionforproduct60= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product61=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product61.sendKeys("Productcode042");
			Thread.sleep(1000);
			Actions actionforproduct61= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product62=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product62.sendKeys("Productcode041");
			Thread.sleep(1000);
			Actions actionforproduct62= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product63=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product63.sendKeys("Productcode040");
			Thread.sleep(1000);
			Actions actionforproduct63= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product64=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product64.sendKeys("Productcode039");
			Thread.sleep(1000);
			Actions actionforproduct64= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product65=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product65.sendKeys("Productcode038");
			Thread.sleep(1000);
			Actions actionforproduct65= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product66=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product66.sendKeys("Productcode037");
			Thread.sleep(1000);
			Actions actionforproduct66= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product67=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product67.sendKeys("Productcode036");
			Thread.sleep(1000);
			Actions actionforproduct67= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product68=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product68.sendKeys("Productcode035");
			Thread.sleep(1000);
			Actions actionforproduct68= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product69=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product69.sendKeys("Productcode034");
			Thread.sleep(1000);
			Actions actionforproduct69= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product70=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product70.sendKeys("Productcode033");
			Thread.sleep(1000);
			Actions actionforproduct70= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product71=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product71.sendKeys("Productcode032");
			Thread.sleep(1000);
			Actions actionforproduct71= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product72=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product72.sendKeys("Productcode031");
			Thread.sleep(1000);
			Actions actionforproduct72= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product73=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product73.sendKeys("Productcode030");
			Thread.sleep(1000);
			Actions actionforproduct73= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product74=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product74.sendKeys("Productcode029");
			Thread.sleep(1000);
			Actions actionforproduct74= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product75=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product75.sendKeys("Productcode028");
			Thread.sleep(1000);
			Actions actionforproduct75= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product76=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product76.sendKeys("Productcode027");
			Thread.sleep(1000);
			Actions actionforproduct76= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product77=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product77.sendKeys("Productcode026");
			Thread.sleep(1000);
			Actions actionforproduct77= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product78=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product78.sendKeys("Productcode025");
			Thread.sleep(1000);
			Actions actionforproduct78= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product79=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product79.sendKeys("Productcode024");
			Thread.sleep(1000);
			Actions actionforproduct79= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product80=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product80.sendKeys("Productcode023");
			Thread.sleep(1000);
			Actions actionforproduct80= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product81=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product81.sendKeys("Productcode022");
			Thread.sleep(1000);
			Actions actionforproduct81= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product82=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product82.sendKeys("Productcode021");
			Thread.sleep(1000);
			Actions actionforproduct82= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product83=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product83.sendKeys("Productcode020");
			Thread.sleep(1000);
			Actions actionforproduct83= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product84=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product84.sendKeys("Productcode019");
			Thread.sleep(1000);
			Actions actionforproduct84= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product85=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product85.sendKeys("Productcode018");
			Thread.sleep(1000);
			Actions actionforproduct85= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product86=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product86.sendKeys("Productcode017");
			Thread.sleep(1000);
			Actions actionforproduct86= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product87=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product87.sendKeys("Productcode016");
			Thread.sleep(1000);
			Actions actionforproduct87= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product88=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product88.sendKeys("Productcode015");
			Thread.sleep(1000);
			Actions actionforproduct88= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product89=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product89.sendKeys("Productcode014");
			Thread.sleep(1000);
			Actions actionforproduct89= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product90=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product90.sendKeys("Productcode013");
			Thread.sleep(1000);
			Actions actionforproduct90= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product91=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product91.sendKeys("Productcode012");
			Thread.sleep(1000);
			Actions actionforproduct91= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product92=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product92.sendKeys("Productcode011");
			Thread.sleep(1000);
			Actions actionforproduct92= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product93=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product93.sendKeys("Productcode010");
			Thread.sleep(1000);
			Actions actionforproduct93= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product94=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product94.sendKeys("Productcode009");
			Thread.sleep(1000);
			Actions actionforproduct94= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product95=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product95.sendKeys("Productcode008");
			Thread.sleep(1000);
			Actions actionforproduct95= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product96=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product96.sendKeys("Productcode007");
			Thread.sleep(1000);
			Actions actionforproduct96= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product97=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product97.sendKeys("Productcode006");
			Thread.sleep(1000);
			Actions actionforproduct97= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product98=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product98.sendKeys("Productcode005");
			Thread.sleep(1000);
			Actions actionforproduct98= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product99=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product99.sendKeys("Productcode004");
			Thread.sleep(1000);
			Actions actionforproduct99= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product100=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product100.sendKeys("Productcode003");
			Thread.sleep(1000);
			Actions actionforproduct100= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			
			
			WebElement cashbtn=driver.findElement(By.id("cashbtn"));
			cashbtn.click();
			Thread.sleep(2000);
			WebElement paybtn=driver.findElement(By.id("SaveCashFromtendered_btn"));
			paybtn.click();
			Thread.sleep(5000);
		}
	  
		@Test
		public void TestEmployee4login () throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://croodstest.vasyerp.com/dashboard");
			driver.manage().window().maximize();
			WebElement userName=driver.findElement(By.xpath("//input[@name='userName']"));
			userName.sendKeys("abcd");
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
			
		
			WebElement  product21=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode082");
			Thread.sleep(1000);
			Actions actionforproduct21= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();	
			
			WebElement  product22=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode081");
			Thread.sleep(1000);
			Actions actionforproduct22= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product23=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode080");
			Thread.sleep(1000);
			Actions actionforproduct23= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product24=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode079");
			Thread.sleep(1000);
			Actions actionforproduct24= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product25=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode078");
			Thread.sleep(1000);
			Actions actionforproduct25= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product26=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode077");
			Thread.sleep(1000);
			Actions actionforproduct26= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product27=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode076");
			Thread.sleep(1000);
			Actions actionforproduct27= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product28=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode075");
			Thread.sleep(1000);
			Actions actionforproduct28= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product29=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode074");
			Thread.sleep(1000);
			Actions actionforproduct29= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product30=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode073");
			Thread.sleep(1000);
			Actions actionforproduct30= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product31=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode072");
			Thread.sleep(1000);
			Actions actionforproduct31= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product32=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode071");
			Thread.sleep(1000);
			Actions actionforproduct32= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product33=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode070");
			Thread.sleep(1000);
			Actions actionforproduct33= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product34=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode069");
			Thread.sleep(1000);
			Actions actionforproduct34= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product35=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode068");
			Thread.sleep(1000);
			Actions actionforproduct35= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product36=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode067");
			Thread.sleep(1000);
			Actions actionforproduct36= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product37=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode066");
			Thread.sleep(1000);
			Actions actionforproduct37= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
		
			WebElement  product38=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode065");
			Thread.sleep(1000);
			Actions actionforproduct38= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product39=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode064");
			Thread.sleep(1000);
			Actions actionforproduct39= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product40=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode063");
			Thread.sleep(1000);
			Actions actionforproduct40= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product41=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode062");
			Thread.sleep(1000);
			Actions actionforproduct41= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product42=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode061");
			Thread.sleep(1000);
			Actions actionforproduct42= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
		
			WebElement  product43=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode060");
			Thread.sleep(1000);
			Actions actionforproduct43= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product44=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode059");
			Thread.sleep(1000);
			Actions actionforproduct44= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product45=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode058");
			Thread.sleep(1000);
			Actions actionforproduct45= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product46=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode057");
			Thread.sleep(1000);
			Actions actionforproduct46= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product47=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode056");
			Thread.sleep(1000);
			Actions actionforproduct47= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product48=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode055");
			Thread.sleep(1000);
			Actions actionforproduct48= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product49=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode054");
			Thread.sleep(1000);
			Actions actionforproduct49= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product50=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode053");
			Thread.sleep(1000);
			Actions actionforproduct50= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product51=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product51.sendKeys("Productcode052");
			Thread.sleep(1000);
			Actions actionforproduct51= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product52=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product52.sendKeys("Productcode051");
			Thread.sleep(1000);
			Actions actionforproduct52= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product53=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product53.sendKeys("Productcode050");
			Thread.sleep(1000);
			Actions actionforproduct53= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product54=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product54.sendKeys("Productcode049");
			Thread.sleep(1000);
			Actions actionforproduct54= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product55=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product55.sendKeys("Productcode048");
			Thread.sleep(1000);
			Actions actionforproduct55= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product56=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product56.sendKeys("Productcode047");
			Thread.sleep(1000);
			Actions actionforproduct56= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product57=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product57.sendKeys("Productcode046");
			Thread.sleep(1000);
			Actions actionforproduct57= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product58=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product58.sendKeys("Productcode045");
			Thread.sleep(1000);
			Actions actionforproduct58= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product59=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product59.sendKeys("Productcode044");
			Thread.sleep(1000);
			Actions actionforproduct59= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product60=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product60.sendKeys("Productcode043");
			Thread.sleep(1000);
			Actions actionforproduct60= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product61=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product61.sendKeys("Productcode042");
			Thread.sleep(1000);
			Actions actionforproduct61= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product62=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product62.sendKeys("Productcode041");
			Thread.sleep(1000);
			Actions actionforproduct62= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product63=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product63.sendKeys("Productcode040");
			Thread.sleep(1000);
			Actions actionforproduct63= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product64=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product64.sendKeys("Productcode039");
			Thread.sleep(1000);
			Actions actionforproduct64= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product65=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product65.sendKeys("Productcode038");
			Thread.sleep(1000);
			Actions actionforproduct65= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product66=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product66.sendKeys("Productcode037");
			Thread.sleep(1000);
			Actions actionforproduct66= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product67=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product67.sendKeys("Productcode036");
			Thread.sleep(1000);
			Actions actionforproduct67= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product68=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product68.sendKeys("Productcode035");
			Thread.sleep(1000);
			Actions actionforproduct68= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product69=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product69.sendKeys("Productcode034");
			Thread.sleep(1000);
			Actions actionforproduct69= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product70=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product70.sendKeys("Productcode033");
			Thread.sleep(1000);
			Actions actionforproduct70= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product71=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product71.sendKeys("Productcode032");
			Thread.sleep(1000);
			Actions actionforproduct71= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product72=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product72.sendKeys("Productcode031");
			Thread.sleep(1000);
			Actions actionforproduct72= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product73=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product73.sendKeys("Productcode030");
			Thread.sleep(1000);
			Actions actionforproduct73= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product74=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product74.sendKeys("Productcode029");
			Thread.sleep(1000);
			Actions actionforproduct74= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product75=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product75.sendKeys("Productcode028");
			Thread.sleep(1000);
			Actions actionforproduct75= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product76=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product76.sendKeys("Productcode027");
			Thread.sleep(1000);
			Actions actionforproduct76= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product77=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product77.sendKeys("Productcode026");
			Thread.sleep(1000);
			Actions actionforproduct77= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product78=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product78.sendKeys("Productcode025");
			Thread.sleep(1000);
			Actions actionforproduct78= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product79=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product79.sendKeys("Productcode024");
			Thread.sleep(1000);
			Actions actionforproduct79= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product80=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product80.sendKeys("Productcode023");
			Thread.sleep(1000);
			Actions actionforproduct80= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product81=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product81.sendKeys("Productcode022");
			Thread.sleep(1000);
			Actions actionforproduct81= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product82=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product82.sendKeys("Productcode021");
			Thread.sleep(1000);
			Actions actionforproduct82= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product83=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product83.sendKeys("Productcode020");
			Thread.sleep(1000);
			Actions actionforproduct83= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product84=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product84.sendKeys("Productcode019");
			Thread.sleep(1000);
			Actions actionforproduct84= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product85=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product85.sendKeys("Productcode018");
			Thread.sleep(1000);
			Actions actionforproduct85= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product86=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product86.sendKeys("Productcode017");
			Thread.sleep(1000);
			Actions actionforproduct86= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product87=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product87.sendKeys("Productcode016");
			Thread.sleep(1000);
			Actions actionforproduct87= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product88=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product88.sendKeys("Productcode015");
			Thread.sleep(1000);
			Actions actionforproduct88= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product89=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product89.sendKeys("Productcode014");
			Thread.sleep(1000);
			Actions actionforproduct89= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product90=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product90.sendKeys("Productcode013");
			Thread.sleep(1000);
			Actions actionforproduct90= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product91=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product91.sendKeys("Productcode012");
			Thread.sleep(1000);
			Actions actionforproduct91= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product92=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product92.sendKeys("Productcode011");
			Thread.sleep(1000);
			Actions actionforproduct92= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product93=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product93.sendKeys("Productcode010");
			Thread.sleep(1000);
			Actions actionforproduct93= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product94=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product94.sendKeys("Productcode009");
			Thread.sleep(1000);
			Actions actionforproduct94= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product95=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product95.sendKeys("Productcode008");
			Thread.sleep(1000);
			Actions actionforproduct95= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product96=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product96.sendKeys("Productcode007");
			Thread.sleep(1000);
			Actions actionforproduct96= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product97=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product97.sendKeys("Productcode006");
			Thread.sleep(1000);
			Actions actionforproduct97= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product98=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product98.sendKeys("Productcode005");
			Thread.sleep(1000);
			Actions actionforproduct98= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product99=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product99.sendKeys("Productcode004");
			Thread.sleep(1000);
			Actions actionforproduct99= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product100=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product100.sendKeys("Productcode003");
			Thread.sleep(1000);
			Actions actionforproduct100= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			
			
			WebElement cashbtn=driver.findElement(By.id("cashbtn"));
			cashbtn.click();
			Thread.sleep(2000);
			WebElement paybtn=driver.findElement(By.id("SaveCashFromtendered_btn"));
			paybtn.click();
			Thread.sleep(5000);
		}
		@Test
		public void TestEmployee5login () throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://croodstest.vasyerp.com/dashboard");
			driver.manage().window().maximize();
			WebElement userName=driver.findElement(By.xpath("//input[@name='userName']"));
			userName.sendKeys("ayushijayswal662");
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
			
		
			WebElement  product21=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode082");
			Thread.sleep(1000);
			Actions actionforproduct21= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();	
			
			WebElement  product22=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode081");
			Thread.sleep(1000);
			Actions actionforproduct22= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product23=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode080");
			Thread.sleep(1000);
			Actions actionforproduct23= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product24=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode079");
			Thread.sleep(1000);
			Actions actionforproduct24= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product25=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode078");
			Thread.sleep(1000);
			Actions actionforproduct25= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product26=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode077");
			Thread.sleep(1000);
			Actions actionforproduct26= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product27=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode076");
			Thread.sleep(1000);
			Actions actionforproduct27= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product28=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode075");
			Thread.sleep(1000);
			Actions actionforproduct28= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product29=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode074");
			Thread.sleep(1000);
			Actions actionforproduct29= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product30=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode073");
			Thread.sleep(1000);
			Actions actionforproduct30= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product31=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode072");
			Thread.sleep(1000);
			Actions actionforproduct31= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product32=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode071");
			Thread.sleep(1000);
			Actions actionforproduct32= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product33=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode070");
			Thread.sleep(1000);
			Actions actionforproduct33= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product34=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode069");
			Thread.sleep(1000);
			Actions actionforproduct34= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product35=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode068");
			Thread.sleep(1000);
			Actions actionforproduct35= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product36=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode067");
			Thread.sleep(1000);
			Actions actionforproduct36= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product37=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode066");
			Thread.sleep(1000);
			Actions actionforproduct37= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
		
			WebElement  product38=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode065");
			Thread.sleep(1000);
			Actions actionforproduct38= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product39=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode064");
			Thread.sleep(1000);
			Actions actionforproduct39= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product40=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode063");
			Thread.sleep(1000);
			Actions actionforproduct40= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product41=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode062");
			Thread.sleep(1000);
			Actions actionforproduct41= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product42=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode061");
			Thread.sleep(1000);
			Actions actionforproduct42= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
		
			WebElement  product43=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode060");
			Thread.sleep(1000);
			Actions actionforproduct43= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product44=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode059");
			Thread.sleep(1000);
			Actions actionforproduct44= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product45=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode058");
			Thread.sleep(1000);
			Actions actionforproduct45= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product46=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode057");
			Thread.sleep(1000);
			Actions actionforproduct46= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product47=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode056");
			Thread.sleep(1000);
			Actions actionforproduct47= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product48=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode055");
			Thread.sleep(1000);
			Actions actionforproduct48= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product49=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode054");
			Thread.sleep(1000);
			Actions actionforproduct49= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product50=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode053");
			Thread.sleep(1000);
			Actions actionforproduct50= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product51=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product51.sendKeys("Productcode052");
			Thread.sleep(1000);
			Actions actionforproduct51= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product52=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product52.sendKeys("Productcode051");
			Thread.sleep(1000);
			Actions actionforproduct52= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product53=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product53.sendKeys("Productcode050");
			Thread.sleep(1000);
			Actions actionforproduct53= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product54=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product54.sendKeys("Productcode049");
			Thread.sleep(1000);
			Actions actionforproduct54= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product55=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product55.sendKeys("Productcode048");
			Thread.sleep(1000);
			Actions actionforproduct55= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product56=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product56.sendKeys("Productcode047");
			Thread.sleep(1000);
			Actions actionforproduct56= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product57=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product57.sendKeys("Productcode046");
			Thread.sleep(1000);
			Actions actionforproduct57= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product58=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product58.sendKeys("Productcode045");
			Thread.sleep(1000);
			Actions actionforproduct58= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product59=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product59.sendKeys("Productcode044");
			Thread.sleep(1000);
			Actions actionforproduct59= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product60=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product60.sendKeys("Productcode043");
			Thread.sleep(1000);
			Actions actionforproduct60= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product61=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product61.sendKeys("Productcode042");
			Thread.sleep(1000);
			Actions actionforproduct61= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product62=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product62.sendKeys("Productcode041");
			Thread.sleep(1000);
			Actions actionforproduct62= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product63=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product63.sendKeys("Productcode040");
			Thread.sleep(1000);
			Actions actionforproduct63= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product64=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product64.sendKeys("Productcode039");
			Thread.sleep(1000);
			Actions actionforproduct64= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product65=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product65.sendKeys("Productcode038");
			Thread.sleep(1000);
			Actions actionforproduct65= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product66=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product66.sendKeys("Productcode037");
			Thread.sleep(1000);
			Actions actionforproduct66= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product67=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product67.sendKeys("Productcode036");
			Thread.sleep(1000);
			Actions actionforproduct67= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product68=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product68.sendKeys("Productcode035");
			Thread.sleep(1000);
			Actions actionforproduct68= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product69=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product69.sendKeys("Productcode034");
			Thread.sleep(1000);
			Actions actionforproduct69= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product70=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product70.sendKeys("Productcode033");
			Thread.sleep(1000);
			Actions actionforproduct70= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product71=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product71.sendKeys("Productcode032");
			Thread.sleep(1000);
			Actions actionforproduct71= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product72=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product72.sendKeys("Productcode031");
			Thread.sleep(1000);
			Actions actionforproduct72= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product73=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product73.sendKeys("Productcode030");
			Thread.sleep(1000);
			Actions actionforproduct73= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product74=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product74.sendKeys("Productcode029");
			Thread.sleep(1000);
			Actions actionforproduct74= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product75=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product75.sendKeys("Productcode028");
			Thread.sleep(1000);
			Actions actionforproduct75= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product76=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product76.sendKeys("Productcode027");
			Thread.sleep(1000);
			Actions actionforproduct76= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product77=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product77.sendKeys("Productcode026");
			Thread.sleep(1000);
			Actions actionforproduct77= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product78=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product78.sendKeys("Productcode025");
			Thread.sleep(1000);
			Actions actionforproduct78= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product79=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product79.sendKeys("Productcode024");
			Thread.sleep(1000);
			Actions actionforproduct79= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product80=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product80.sendKeys("Productcode023");
			Thread.sleep(1000);
			Actions actionforproduct80= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product81=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product81.sendKeys("Productcode022");
			Thread.sleep(1000);
			Actions actionforproduct81= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product82=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product82.sendKeys("Productcode021");
			Thread.sleep(1000);
			Actions actionforproduct82= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product83=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product83.sendKeys("Productcode020");
			Thread.sleep(1000);
			Actions actionforproduct83= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product84=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product84.sendKeys("Productcode019");
			Thread.sleep(1000);
			Actions actionforproduct84= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product85=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product85.sendKeys("Productcode018");
			Thread.sleep(1000);
			Actions actionforproduct85= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product86=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product86.sendKeys("Productcode017");
			Thread.sleep(1000);
			Actions actionforproduct86= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product87=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product87.sendKeys("Productcode016");
			Thread.sleep(1000);
			Actions actionforproduct87= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product88=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product88.sendKeys("Productcode015");
			Thread.sleep(1000);
			Actions actionforproduct88= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product89=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product89.sendKeys("Productcode014");
			Thread.sleep(1000);
			Actions actionforproduct89= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product90=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product90.sendKeys("Productcode013");
			Thread.sleep(1000);
			Actions actionforproduct90= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product91=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product91.sendKeys("Productcode012");
			Thread.sleep(1000);
			Actions actionforproduct91= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product92=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product92.sendKeys("Productcode011");
			Thread.sleep(1000);
			Actions actionforproduct92= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product93=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product93.sendKeys("Productcode010");
			Thread.sleep(1000);
			Actions actionforproduct93= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product94=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product94.sendKeys("Productcode009");
			Thread.sleep(1000);
			Actions actionforproduct94= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product95=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product95.sendKeys("Productcode008");
			Thread.sleep(1000);
			Actions actionforproduct95= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product96=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product96.sendKeys("Productcode007");
			Thread.sleep(1000);
			Actions actionforproduct96= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product97=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product97.sendKeys("Productcode006");
			Thread.sleep(1000);
			Actions actionforproduct97= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product98=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product98.sendKeys("Productcode005");
			Thread.sleep(1000);
			Actions actionforproduct98= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product99=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product99.sendKeys("Productcode004");
			Thread.sleep(1000);
			Actions actionforproduct99= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product100=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product100.sendKeys("Productcode003");
			Thread.sleep(1000);
			Actions actionforproduct100= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement cashbtn=driver.findElement(By.id("cashbtn"));
			cashbtn.click();
			Thread.sleep(2000);
			WebElement paybtn=driver.findElement(By.id("SaveCashFromtendered_btn"));
			paybtn.click();
			Thread.sleep(5000);
			
		}
		@Test
		public void TestEmployee6login () throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharjil\\eclipse-workspace\\drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://croodstest.vasyerp.com/dashboard");
			driver.manage().window().maximize();
			WebElement userName=driver.findElement(By.xpath("//input[@name='userName']"));
			userName.sendKeys("emp1");
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
			
		
			WebElement  product21=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode082");
			Thread.sleep(1000);
			Actions actionforproduct21= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();	
			
			WebElement  product22=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode081");
			Thread.sleep(1000);
			Actions actionforproduct22= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product23=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode080");
			Thread.sleep(1000);
			Actions actionforproduct23= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product24=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode079");
			Thread.sleep(1000);
			Actions actionforproduct24= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product25=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode078");
			Thread.sleep(1000);
			Actions actionforproduct25= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product26=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode077");
			Thread.sleep(1000);
			Actions actionforproduct26= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product27=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode076");
			Thread.sleep(1000);
			Actions actionforproduct27= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product28=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode075");
			Thread.sleep(1000);
			Actions actionforproduct28= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product29=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode074");
			Thread.sleep(1000);
			Actions actionforproduct29= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product30=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode073");
			Thread.sleep(1000);
			Actions actionforproduct30= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product31=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode072");
			Thread.sleep(1000);
			Actions actionforproduct31= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product32=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode071");
			Thread.sleep(1000);
			Actions actionforproduct32= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product33=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode070");
			Thread.sleep(1000);
			Actions actionforproduct33= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product34=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode069");
			Thread.sleep(1000);
			Actions actionforproduct34= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product35=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode068");
			Thread.sleep(1000);
			Actions actionforproduct35= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product36=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode067");
			Thread.sleep(1000);
			Actions actionforproduct36= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product37=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode066");
			Thread.sleep(1000);
			Actions actionforproduct37= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
		
			WebElement  product38=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode065");
			Thread.sleep(1000);
			Actions actionforproduct38= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product39=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode064");
			Thread.sleep(1000);
			Actions actionforproduct39= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product40=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode063");
			Thread.sleep(1000);
			Actions actionforproduct40= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product41=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode062");
			Thread.sleep(1000);
			Actions actionforproduct41= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product42=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode061");
			Thread.sleep(1000);
			Actions actionforproduct42= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
		
			WebElement  product43=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode060");
			Thread.sleep(1000);
			Actions actionforproduct43= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product44=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode059");
			Thread.sleep(1000);
			Actions actionforproduct44= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product45=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode058");
			Thread.sleep(1000);
			Actions actionforproduct45= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product46=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode057");
			Thread.sleep(1000);
			Actions actionforproduct46= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product47=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode056");
			Thread.sleep(1000);
			Actions actionforproduct47= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product48=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode055");
			Thread.sleep(1000);
			Actions actionforproduct48= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product49=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode054");
			Thread.sleep(1000);
			Actions actionforproduct49= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product50=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product1.sendKeys("Productcode053");
			Thread.sleep(1000);
			Actions actionforproduct50= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product51=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product51.sendKeys("Productcode052");
			Thread.sleep(1000);
			Actions actionforproduct51= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product52=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product52.sendKeys("Productcode051");
			Thread.sleep(1000);
			Actions actionforproduct52= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product53=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product53.sendKeys("Productcode050");
			Thread.sleep(1000);
			Actions actionforproduct53= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product54=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product54.sendKeys("Productcode049");
			Thread.sleep(1000);
			Actions actionforproduct54= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product55=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product55.sendKeys("Productcode048");
			Thread.sleep(1000);
			Actions actionforproduct55= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			
			WebElement  product56=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product56.sendKeys("Productcode047");
			Thread.sleep(1000);
			Actions actionforproduct56= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product57=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product57.sendKeys("Productcode046");
			Thread.sleep(1000);
			Actions actionforproduct57= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product58=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product58.sendKeys("Productcode045");
			Thread.sleep(1000);
			Actions actionforproduct58= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product59=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product59.sendKeys("Productcode044");
			Thread.sleep(1000);
			Actions actionforproduct59= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product60=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product60.sendKeys("Productcode043");
			Thread.sleep(1000);
			Actions actionforproduct60= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product61=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product61.sendKeys("Productcode042");
			Thread.sleep(1000);
			Actions actionforproduct61= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product62=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product62.sendKeys("Productcode041");
			Thread.sleep(1000);
			Actions actionforproduct62= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product63=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product63.sendKeys("Productcode040");
			Thread.sleep(1000);
			Actions actionforproduct63= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product64=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product64.sendKeys("Productcode039");
			Thread.sleep(1000);
			Actions actionforproduct64= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product65=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product65.sendKeys("Productcode038");
			Thread.sleep(1000);
			Actions actionforproduct65= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product66=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product66.sendKeys("Productcode037");
			Thread.sleep(1000);
			Actions actionforproduct66= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product67=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product67.sendKeys("Productcode036");
			Thread.sleep(1000);
			Actions actionforproduct67= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product68=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product68.sendKeys("Productcode035");
			Thread.sleep(1000);
			Actions actionforproduct68= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product69=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product69.sendKeys("Productcode034");
			Thread.sleep(1000);
			Actions actionforproduct69= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product70=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product70.sendKeys("Productcode033");
			Thread.sleep(1000);
			Actions actionforproduct70= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product71=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product71.sendKeys("Productcode032");
			Thread.sleep(1000);
			Actions actionforproduct71= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product72=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product72.sendKeys("Productcode031");
			Thread.sleep(1000);
			Actions actionforproduct72= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product73=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product73.sendKeys("Productcode030");
			Thread.sleep(1000);
			Actions actionforproduct73= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product74=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product74.sendKeys("Productcode029");
			Thread.sleep(1000);
			Actions actionforproduct74= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product75=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product75.sendKeys("Productcode028");
			Thread.sleep(1000);
			Actions actionforproduct75= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product76=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product76.sendKeys("Productcode027");
			Thread.sleep(1000);
			Actions actionforproduct76= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product77=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product77.sendKeys("Productcode026");
			Thread.sleep(1000);
			Actions actionforproduct77= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product78=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product78.sendKeys("Productcode025");
			Thread.sleep(1000);
			Actions actionforproduct78= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product79=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product79.sendKeys("Productcode024");
			Thread.sleep(1000);
			Actions actionforproduct79= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product80=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product80.sendKeys("Productcode023");
			Thread.sleep(1000);
			Actions actionforproduct80= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product81=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product81.sendKeys("Productcode022");
			Thread.sleep(1000);
			Actions actionforproduct81= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product82=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product82.sendKeys("Productcode021");
			Thread.sleep(1000);
			Actions actionforproduct82= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product83=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product83.sendKeys("Productcode020");
			Thread.sleep(1000);
			Actions actionforproduct83= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product84=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product84.sendKeys("Productcode019");
			Thread.sleep(1000);
			Actions actionforproduct84= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product85=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product85.sendKeys("Productcode018");
			Thread.sleep(1000);
			Actions actionforproduct85= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product86=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product86.sendKeys("Productcode017");
			Thread.sleep(1000);
			Actions actionforproduct86= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product87=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product87.sendKeys("Productcode016");
			Thread.sleep(1000);
			Actions actionforproduct87= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product88=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product88.sendKeys("Productcode015");
			Thread.sleep(1000);
			Actions actionforproduct88= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product89=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product89.sendKeys("Productcode014");
			Thread.sleep(1000);
			Actions actionforproduct89= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product90=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product90.sendKeys("Productcode013");
			Thread.sleep(1000);
			Actions actionforproduct90= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product91=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product91.sendKeys("Productcode012");
			Thread.sleep(1000);
			Actions actionforproduct91= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product92=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product92.sendKeys("Productcode011");
			Thread.sleep(1000);
			Actions actionforproduct92= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product93=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product93.sendKeys("Productcode010");
			Thread.sleep(1000);
			Actions actionforproduct93= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product94=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product94.sendKeys("Productcode009");
			Thread.sleep(1000);
			Actions actionforproduct94= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product95=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product95.sendKeys("Productcode008");
			Thread.sleep(1000);
			Actions actionforproduct95= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
		
			WebElement  product96=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product96.sendKeys("Productcode007");
			Thread.sleep(1000);
			Actions actionforproduct96= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product97=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product97.sendKeys("Productcode006");
			Thread.sleep(1000);
			Actions actionforproduct97= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product98=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product98.sendKeys("Productcode005");
			Thread.sleep(1000);
			Actions actionforproduct98= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product99=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product99.sendKeys("Productcode004");
			Thread.sleep(1000);
			Actions actionforproduct99= new Actions(driver);
			action.sendKeys(Keys.RETURN);
			action.perform();
			
			WebElement  product100=driver.findElement(By.xpath("//input[@class='form-control form-control-sm tt-input']"));
			product100.sendKeys("Productcode003");
			Thread.sleep(1000);
			Actions actionforproduct100= new Actions(driver);
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
