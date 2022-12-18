import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		driver.manage().window().maximize();
		
		driver.get("https://bnl-in-qa-pwa.ivyretailassist.com/");
		
		Thread.sleep(5000);

		//driver.findElement(By.xpath("(//button[@type = \"button\"])[1]")).click();
		
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
		
		driver.findElement(By.xpath("//li[@class='ant-menu-item'] //a[@href='/ivy/productList'] ")).click();
		
		Thread.sleep(5000);
		
		List<WebElement> productsList = driver.findElements(By.cssSelector("h4.p-name-wrap-three-line"));
		
		for(int i =0 ; i<productsList.size(); i++)
		{
			String productName = productsList.get(i).getText();
			System.out.println(productName);
			if(productName.contains("Amul_10"))
			{
				//span[@class='card-plus-sign']
				Thread.sleep(5000);
				//driver.findElements(By.xpath("//button[@class='ant-btn ant-btn-sm ant-btn-icon-only product-qul'] //span[text()='+']")).get(i).click();
				//button[@class='ant-btn ant-btn-sm ant-btn-icon-only product-qul'] //span[@class='card-plus-sign']
				driver.findElements(By.xpath("//button[@class='ant-btn ant-btn-sm ant-btn-icon-only product-qul'] //span[@class='card-plus-sign']")).get(i).click();
				break;
			}
		}

}
}
