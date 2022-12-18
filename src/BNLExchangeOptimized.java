import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BNLExchangeOptimized {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		driver.manage().window().maximize();
		driver.get("https://bnl-in-qa-pwa.ivyretailassist.com/");
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
		
		driver.findElement(By.id("rc_select_0")).click();
		
		 driver.findElements(By.cssSelector("//div[@style='display: flex; flex-direction: column;']"));
	/*	Thread.sleep(5000);
		for(int i = 0 ; i<CategoryList.size();i++)
		{
			String CategoryName = CategoryList.get(i).getText();
			System.out.println(CategoryName);
		}*/

	}

}
