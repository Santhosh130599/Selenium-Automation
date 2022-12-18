import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Introduction_Udemy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		
	}

}
