import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BNL_Exchange_Methods {

	
	public void PlusButton_RetrunPage(WebDriver driver) throws InterruptedException
	{
		int i = 1;
		
		while(i<6)
		{
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[@class='d-flex align-items-center mt-1'] //button[@type='button'] //span[@class='card-plus-sign']")).click();
			
			i++;
		}
		
		driver.findElement(By.xpath("//span[text()='Update Entry']")).click();
	}
	
	public void PlusButton_OrderPage(WebDriver driver) throws InterruptedException
	{
		int i = 1;
		
		while(i<6)
		{
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//span[@class=\"card-plus-sign\"])[1]")).click();
			
			i++;
		}
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}
	
	public void ResultChecking(WebDriver driver)
	{
		String Output = driver.findElement(By.xpath("//div[@class='ant-result-title']")).getText();
		
		System.out.println(Output);
		
		Assert.assertEquals(Output, "Order placed successfully");
	}
	
	public void New_Order_Details(WebDriver driver)
	{
		String Orders = driver.findElement(By.xpath("//div[@class='ant-result-subtitle']")).getText();
		
		System.out.println("Newly Placed and Retrun Orders Id's are :"+ Orders);
	}

}
