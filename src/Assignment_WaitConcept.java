import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_WaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Login(driver,wait);
		Additems(driver,wait);
		driver.findElement(By.partialLinkText("Checkout")).click();
	}
	
	public static void Login (WebDriver driver,WebDriverWait wait)
	{
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement LsitItem = driver.findElement(By.xpath("//select[@data-style='btn-info']"));
		Select dropdownlist = new Select(LsitItem);
		dropdownlist.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
	}
	
	public static void Additems(WebDriver driver,WebDriverWait wait)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='my-4']")));
		//driver.findElement(By.xpath("//h1[@class='my-4']"));
		List<WebElement> ItemList = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		for (int i =0;i<ItemList.size();i++)
		{
			ItemList.get(i).click();
		}
		
	}

}
