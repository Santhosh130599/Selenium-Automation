import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement Mousehover = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a = new Actions(driver);
		a.moveToElement(Mousehover).contextClick().build().perform();
		WebElement Text = driver.findElement(By.id("twotabsearchtextbox"));// Normal Actions 
		a.moveToElement(Text).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();//Composite Actions
	}

}
