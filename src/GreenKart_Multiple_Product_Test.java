import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart_Multiple_Product_Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//After enter into the Url we need to choose the product so we will extract all the products in current page and selectwhat product we want//
		
		List<WebElement> productList = driver.findElements(By.cssSelector("h4.product-name"));
		
		//Above code will give the all the product Name and then we need to click what product we want so we can use loop//
		//here we Adding the product to cart as the Multiple Product//
		/*
		 * STEPS TO BE FOLLOWED FOR THE MULTIPLE PRODUCT
		 * STEP1 - CHOOSE SOME MULTIPLE PRODUCT 
		 * STEP2 - Ater choosing the multiple product Store it in a String of Array.
		 * STEP3 - After stored , Check whether choosen product name is present in the Stored Array 
		 * STEP4 - Convert Array to array list
		 * STEP5 - Format it get Actual Vegetable Name
		 */
		
		String[] vegetableName = {"Cauliflower","Beetroot","Brocolli"};
		int j = 0;
		Thread.sleep(5000);
		for (int i =0 ; i<productList.size() ; i++)
		{
			String[] productName = productList.get(i).getText().split("-");                                //Step6//
			//Now this Product name will split it as the // 
			// productName[0] =Barcolli 
			//productName[1]= 1kg
			//in productName[0] at last space is there so again we need to trim that space so we can use the trim method//
			
			String formattedProductName = productName[0].trim();
			
			//System.out.println(productName);
			System.out.println(formattedProductName);
			
			// Converting Array to Array list - Syntax for Converting from Array to ArrayList is - using Arrays.asList//
			
			List itemsList = Arrays.asList(vegetableName);
			
			//After converted to array list and then also test will fail becoz fof its carrying name as "Barcolli - 1kg" So we need to Split and take
			//the Exact Name which u have Stored in the Array//
			
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
