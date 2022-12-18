import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_UI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		//driver.get("https://www.easemytrip.com/flights.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;	
		jse.executeScript("window.scrollBy(0,1200)");
		driver.findElement(By.name("form_fields[travel_comp_date]")).click();
		//Now we Want to click any date from the Month for that we need to write the Script//
		List<WebElement> DayList = driver.findElements(By.xpath("//div[@class='dayContainer']"));
		int count = driver.findElements(By.xpath("//div[@class='dayContainer']")).size();
		for (int i =0;i< count; i++ )
		{
			String Text = DayList.get(i).getText();
			if(Text.equals("23"))
			{
				DayList.get(i).click();
				break;
			}
		}
	}

}
