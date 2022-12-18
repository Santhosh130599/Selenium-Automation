import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//div[@class='form-group'] //input[@name='name']")).sendKeys("Santhosh");
		driver.findElement(By.xpath("//div[@class='form-group'] //input[@name='email']")).sendKeys("santhosh@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345678888");
		driver.findElement(By.id("exampleCheck1")).click();
		//Validation for Checkbox//
		Assert.assertTrue(driver.findElement(By.id("exampleCheck1")).isSelected());
		WebElement Dropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		Select output = new Select(Dropdown);
		output.selectByVisibleText("Female");
		System.out.println(output.getFirstSelectedOption().getText());
		output.selectByVisibleText("Male");
		System.out.println(output.getFirstSelectedOption().getText());
		driver.findElement(By.id("inlineRadio1")).click();
		//Validation for radio Button//
		Assert.assertTrue(driver.findElement(By.id("inlineRadio1")).isSelected());
		//Validation for disabaled//
		System.out.println(driver.findElement(By.id("inlineRadio3")).getAttribute("value"));
		if (driver.findElement(By.id("inlineRadio3")).getAttribute("value").contains("option3"))
		{
			Assert.assertFalse(false);
			System.out.println("Its Disabled");
		}
		else
		{
			Assert.assertFalse(true);
		}
		driver.findElement(By.name("bday")).sendKeys("11-05-1897");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	}

}
