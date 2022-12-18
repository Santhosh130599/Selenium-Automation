import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scroller {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//For Scroller in WebPage we need to use the Console tab in Webapage//
		//In Selenium we don't have the Scroller Feature so we will use the JavaScript and We will invoke our Driver to JavaScript then it will work//
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		//We need to scroll inside the Web page Tab One table Scroller is there means for that have Syntax//
		//Syntax//
		//document.querySelector(".tableFixHead").scrollTop=5000;// ---> Put it in the Console tab
		Thread.sleep(3000);
		jse.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		//Handling gird tables in the WebPage//
		
		List<WebElement> AmountList = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));;
		int Sum =0;
		for(int i =0; i<AmountList.size();i++)
		{
			String Values= AmountList.get(i).getText();
			int j =Integer.parseInt(Values);
			Sum= Sum+j;
	
		}
		System.out.println(Sum);
		
		// now we need to validate whether Total value is the correct or not//
		System.out.println(driver.findElement(By.cssSelector(".totalAmount")).getText());
		System.out.println(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		int ExpectedOutput = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		/*if (ExpectedOutput.equals(Sum))
		{
			Assert.assertTrue(true);
			driver.close();
		}
		else
			System.out.println("Test Case Failed");*/
		Assert.assertEquals(Sum, ExpectedOutput);
		System.out.println("Test Case Passed");
	}

}
