import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("santhoshselvam130599@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Santhosh@2141");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Facebook");

	}

}
