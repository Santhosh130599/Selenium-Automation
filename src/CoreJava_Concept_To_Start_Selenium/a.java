package CoreJava_Concept_To_Start_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*String NewOrderID = "Exchange Order : Ex-OrderDistributor New231120220254";
	
	String[] FormattedNewOrderID = NewOrderID.split(":");
	
	System.out.println(FormattedNewOrderID[0]);
	System.out.println(FormattedNewOrderID[1]);
	
	String UpdatedNewOrderID = FormattedNewOrderID[1].trim();
	
	System.out.println(UpdatedNewOrderID);*/
		
		System.setProperty("webdriver.chrome.driver", "C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		driver.manage().window().maximize();
		
		driver.get("https://bnl-in-qa-pwa.ivyretailassist.com/");
		
		//Thread.sleep(9000);
		
		//driver.findElement(By.cssSelector(".fa.fa-times-circle.fa-lg.modal-close-button-icon")).click();
		
		WebElement input = driver.findElement(By.id("newLoginUserNameForm_userName"));
		
		input.sendKeys("8892933298");
		
		WebElement sigin = driver.findElement(By.xpath("(//button[@type=\"submit\"])"));
		
		sigin.click();
		

	}

}
