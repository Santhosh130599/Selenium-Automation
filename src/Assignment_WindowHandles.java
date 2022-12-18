import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Multiple Windows")));
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> Windows = driver.getWindowHandles();//Parent Window and Child Window we will have
		Iterator<String> a = Windows.iterator();
		String ParentWindows = a.next();
		String ChildWindows = a.next();
		driver.switchTo().window(ChildWindows);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".example")));
		System.out.println(driver.findElement(By.cssSelector(".example")).getText());
		driver.switchTo().window(ParentWindows);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
	}

}
