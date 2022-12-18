import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("checkBoxOption3")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='checkbox-example'] //label[@for='honda']")).getText());
		String GrabbedLabel = driver.findElement(By.xpath("//div[@id='checkbox-example'] //label[@for='honda']")).getText();
		WebElement S = driver.findElement(By.id("dropdown-class-example"));
		Select Dropdown = new Select(S);
		Dropdown.selectByVisibleText(GrabbedLabel);
		driver.findElement(By.id("name")).sendKeys(GrabbedLabel);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		String GrabbedAlertText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		//Verifying whether GrabbedLabel is displayed in the GrabbedAlerttext
		if (GrabbedAlertText.contains(GrabbedLabel))
		{
			Assert.assertTrue(true);
			driver.close();
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

}
