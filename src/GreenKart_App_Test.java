import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart_App_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//After enter into the Url we need to choose the product so we will extract all the products in current page and selectwhat product we want//
		
		List<WebElement> productList = driver.findElements(By.cssSelector("h4.product-name"));
		
		//Above code will give the all the product Name and then we need to click what product we want so we can use loop//
		//here we Adding the product to cart as the Single Product//
		
		for (int i =0 ; i<productList.size() ; i++)
		{
			String productName = productList.get(i).getText();
			System.out.println(productName);
			if (productName.contains("Beetroot"))
			{
				driver.findElements(By.xpath("//div[@class='product-action'] //button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
	}

}
