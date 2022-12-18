import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		// id locator & Name Locator//
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("santhoshselvam130599@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Santhosh21411");
		driver.findElement(By.name("login")).click();
		
		// Css selector//
		
		/* We can use the Css selector suppose we don't have the Id locator in HTML code then also we can convert it as  the CSs selector
		 * By ussing the  Syntax, tagname#id
		 * css selector for class name - tagname.class name it will convert top the Css selector
		 * CSS Selector Normally , Tagname[Attribute='Value']    */
		
		System.out.println(driver.findElement(By.cssSelector("div.fsl.fwb.fcb")).getText());
		
		//Linktext//
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		Thread.sleep(1000);
		
		/* X-Path:
		 * Syntax for X-Path ----> //Tagname[@Attribute='Value'] */
		
		//driver.findElement(By.xpath("//input[@placeholder='Email address or mobile number']")).sendKeys("Sandy");
		
		driver.findElement(By.cssSelector("input[placeholder='Email address or mobile number']")).sendKeys("Santhoshsandy");
		driver.findElement(By.xpath("(//input[@name='email']) [2]")).clear();
		
		// Parent to Child Move//
		
		driver.findElement(By.xpath("//td/input")).sendKeys("SandySanthosh55555555");
		driver.findElement(By.id("did_submit")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class=\"pam uiBoxRed\"]")).getText());

	}

}
