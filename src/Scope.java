import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//1. How we get the count of all the links present in the Webpage.//
		
		/*For this qn we have link tag called a its unique using this we can find*/
		System.out.println(driver.findElements(By.tagName("a")).size());
		
//2. How we get the total links present only at the Footer of the WebPage?
		
		/*For that we can use the SubSet of driver and we get the Total links present at the Footer*/
		
		// This concept is known as the LIMITING WEBDRIVER SCOPE//
		
		WebElement FooterDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(FooterDriver.findElements(By.tagName("a")).size());
		
//3. How we get Footer particular box how much links present?
		
		WebElement ParticularBox = FooterDriver.findElement(By.tagName("ul"));
		
		System.out.println(ParticularBox.findElements(By.tagName("a")).size());
		
//4. Click on Each link present at the Particular box and check if the pages are opening and get the title of each link//
			
			for(int i=1;i<ParticularBox.findElements(By.tagName("a")).size();i++)
			{
				
				String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
				
				ParticularBox.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
				//Thread.sleep(5000L);
				
			}// opens all the tabs
			Set<String> abc=driver.getWindowHandles();//4
			Iterator<String> it=abc.iterator();
			
			while(it.hasNext())
			{
				
			   driver.switchTo().window(it.next());
			   System.out.println(driver.getTitle());
			
			}
			
		}
		
	}

