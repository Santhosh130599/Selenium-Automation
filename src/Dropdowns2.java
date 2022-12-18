import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowns2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Thread.sleep(5000);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(5000);
		
		Dropdowns2 sc = new Dropdowns2();
		sc.AddButton(driver);
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.close();

	}
	
	public void AddButton(WebDriver driver)
	{
		int i = 1;
		while (i<5) 
		{
			driver.findElement(By.id("hrefIncAdt")).click();//Already one time Adult is selected//
			i++;
		}
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
