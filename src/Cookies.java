import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// By using Manage only we ca do All the cookies related things and Browser Managements
		
		//before Running the Script we need to delete all the Cookies in our Browser means we can use this,
		driver.manage().deleteAllCookies();
		
	// Before Running the Script we want to delete the particular Cookies which is having the Known Name we can use this,
		
		driver.manage().deleteCookieNamed("Here we can enter the Particular Cookie name");
		
	// Before Running the Script we need to add some cookie and we need to automate meanse we can use this,
		
		driver.manage().addCookie(null);
		
		driver.get("www.googless.comsss");
	}

}
