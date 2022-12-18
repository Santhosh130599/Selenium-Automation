import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcept 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));//Explicit wait
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] vegetableName = {"Cauliflower","Beetroot","Brocolli"};
		Thread.sleep(5000);
		addItems(driver,vegetableName);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(.,'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promocode")));//Explicit Wait using
		driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}
	
	
	public static void addItems(WebDriver driver,String[] vegetableName )
	{
		List<WebElement> productList = driver.findElements(By.cssSelector("h4.product-name"));
		
		int j = 0;
		for (int i =0 ; i<productList.size() ; i++)
		{
			String[] productName = productList.get(i).getText().split("-");                                
			
			
			String formattedProductName = productName[0].trim();
			
			//System.out.println(productName);
			//System.out.println(formattedProductName);
			
		
			
			List itemsList = Arrays.asList(vegetableName);
			
			
			if (itemsList.contains(formattedProductName))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//break;-- Here we no need to use break statement because we choosing Multiple Product //
				
				//We need to add break Statement then only code will be Optimized//
				
				//if(j==3) //Here why I used 3 means only im adding 3 products so i used as the 3
					//Important Note: For Array size we want means we need to use the length() method
					//But when we wnat ArrayList Size means we will use Size()//
				if(j==vegetableName.length)
				{
					break;
				}
			}
		}
	}
	}


