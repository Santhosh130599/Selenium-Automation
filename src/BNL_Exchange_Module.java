import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BNL_Exchange_Module extends BNL_Exchange_Methods
{
/*TEST CASE:
 * Login to Application
 * Navigate to the Exchange Module
 * Choose the Category and Sub Category
 * Choose the product and update the Qty and navigate to the next page
 * In Return Summary page Click Next 
 * In Order Page Choose the product and update the Same  Qty and Move to the Next page
 * Mover from order Summary Page by click on next button
 * Complete the order by clicking on Done Button
 * Once Completed get The Successfull message ie, "Order placed Sucessfully"
 * Get the both Order (Return and Placed orders) ID's should print in Console output.
 * */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		driver.manage().window().maximize();
		
		driver.get("https://bnl-in-qa-pwa.ivyretailassist.com/");
		
		Thread.sleep(5000);

		//driver.findElement(By.xpath("(//button[@type = \"button\"])[1]")).click();
		
		WebElement input = driver.findElement(By.id("newLoginUserNameForm_userName"));
		
		input.sendKeys("8892933298");
		
		WebElement sigin = driver.findElement(By.xpath("(//button[@type=\"submit\"])"));
		
		sigin.click();
		
		Thread.sleep(7000);

		
		//WebElement Menu = driver.findElement(By.xpath("(//i[@class='fa fa-bars fa-lg fav-product-header-icon cursor-pointer'])[1]"));
		
		//div[@class='nav-link nav-link-drawer-menu-padding mt-1'] //i[@class='fa fa-bars fa-lg fav-product-header-icon cursor-pointer']
		
		WebElement Menu = driver.findElement(By.xpath("//div[@class='nav-link nav-link-drawer-menu-padding mt-1'] //i[@class='fa fa-bars fa-lg fav-product-header-icon cursor-pointer']"));
		Menu.click();
		
		Thread.sleep(5000);
		
		WebElement ExchangeMenu = driver.findElement(By.xpath("//a[@href='/ivy/exchangeReturn']"));
		
		ExchangeMenu.click();
		
		Thread.sleep(9000);
		
		driver.findElement(By.xpath("//input[@id='rc_select_0']")).click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner'] //div[@title='Bottle'] //div[text()='Bottle']")).click();
		
		driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner'] //div[@title='ColdCoffee'] //div[text()='ColdCoffee']")).click();
		
		Thread.sleep(2000);
		
		//Xpath-//input[@id='rc_select_1']
		
		driver.findElement(By.xpath("//input[@id='rc_select_1']")).click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("(//div[@class='rc-virtual-list-holder-inner'] )[2] //div[@title='Frooti1'] //div[text()='Frooti1']")).click();
		
		driver.findElement(By.xpath("(//div[@class='rc-virtual-list-holder-inner'] )[2]  //div[@title='ColdCoffee'] //div[text()='ColdCoffee']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@type=\"button\"])[6]")).click();
		
		BNL_Exchange_Module sc = new BNL_Exchange_Module();
		
		sc.PlusButton_RetrunPage(driver);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		//span[text()='Next']
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		
		sc.PlusButton_OrderPage(driver);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		
		Thread.sleep(5000);
		sc.ResultChecking(driver);
		
		Thread.sleep(2000);
		sc.New_Order_Details(driver);
		
		//driver.close();
		
	}
}
