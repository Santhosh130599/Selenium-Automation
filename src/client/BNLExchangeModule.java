package client;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BNLExchangeModule extends Methods
{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		driver.manage().window().maximize();
		
		driver.get("https://bnl-in-qa-pwa.ivyretailassist.com/");
		
		//Thread.sleep(9000);
		
		//driver.findElement(By.cssSelector(".fa.fa-times-circle.fa-lg.modal-close-button-icon")).click();
		
		WebElement input = driver.findElement(By.id("newLoginUserNameForm_userName"));
		
		input.sendKeys("8892933298");
		
		WebElement sigin = driver.findElement(By.xpath("(//button[@type=\"submit\"])"));
		
		sigin.click();
		
		Thread.sleep(7000);
		
		String CategoryList = "Bottle";
		String SubCategoryList = "Slice";
		String[] ReturnProduct = {"AquaBlue_12","AquaBlue_16"};
		//String[] ReturnProduct = {"optima - ORANGE"};
		String[] OrderProduct = {"AquaBlue_11","AquaBlue_13"};
		int Qty = 4;
		
		//WebElement Menu = driver.findElement(By.xpath("(//i[@class='fa fa-bars fa-lg fav-product-header-icon cursor-pointer'])[1]"));
		
		//div[@class='nav-link nav-link-drawer-menu-padding mt-1'] //i[@class='fa fa-bars fa-lg fav-product-header-icon cursor-pointer']
		Thread.sleep(7000);
		WebElement Menu = driver.findElement(By.xpath("//div[@class='nav-link nav-link-drawer-menu-padding mt-1'] //i[@class='fa fa-bars fa-lg fav-product-header-icon cursor-pointer']"));
		Menu.click();
		
		Thread.sleep(5000);
		
		WebElement ExchangeMenu = driver.findElement(By.xpath("//a[@href='/ivy/exchangeReturn']"));
		
		ExchangeMenu.click();
		
		Thread.sleep(9000);	
		
		driver.findElement(By.id("rc_select_0")).click();
		
		Thread.sleep(5000);
			
		BNLExchangeModule sc = new BNLExchangeModule();
		
		sc.CategorySelection(driver,CategoryList);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("rc_select_1")).click();
		Thread.sleep(5000);
		sc.SubCategorySelection(driver, CategoryList,SubCategoryList);
		
		List ItemList = Arrays.asList(ReturnProduct);
		List ItemList1 = Arrays.asList(OrderProduct);
		
		Thread.sleep(9000);	
		sc.ReturnProductSelection(driver,ItemList,Qty);
		
		sc.NextButtonClick(driver);
		
		Thread.sleep(5000);
		sc.OrderProductSelection(driver,Qty,ItemList1);
		sc.Result(driver);
		System.out.println("Result Method Executed Properly");
		Thread.sleep(5000);
		sc.ValidatingResultNewOrderID(driver);
		System.out.println("Validation of New Order Id are done");
		sc.ValidatingResultReturnOrderID(driver);
		System.out.println("Validation of Return Order Id are done");
		
		driver.close();

	}

}
