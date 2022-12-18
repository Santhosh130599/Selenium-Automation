import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionClassFeatures {
	
	//https://chromedriver.chromium.org/capabilities ------> this the url will help u to features available in the ChromeOptions Class

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		Proxy proxy1 = new Proxy();
		proxy1.setHttpProxy("ipaddress:444");
		options.setCapability("proxy", "proxy1");
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
//SSL Certificate Expired//
		
		// Here it will show like Your Connection is not Private , Certifcate Expired//
	//So we have Once Class like ChromeOptions class, In that Class we having one method we use to Automate for this Situation//
	// This is method "setAcceptInsecureCerts(true)" that class having we can automate by using this.
		
		//Proxies//
		
//Some of the company want to access the Url means need to connnect the proxy then only we can able to Proceed further//
		//For that We have a option the ChromeOptions Class... 
		//"options.setCapability("proxy", "proxy1");" this the way we can use the proxy connections
		// in Selenium we having the proxy Class so that we need to acess those class create the object first and then we access those 
		//classesand thenwe will set the value by using this ,
		
		//Finally Proxy connections steps are,
		
		/*ChromeOptions options = new ChromeOptions();
		Proxy proxy1 = new Proxy();
		proxy1.setHttpProxy("ipaddress:444");
		options.setCapability("proxy", "proxy1");*/
		
		
// Extension also we can done through the ChromeOptions // By refering the Document we can achieve the Extension by using the Document.
		
		
// By Entering any website like Flight booking Websites there and well will get one popup like Allow the Location Allow and Deny 
		//Like that Poppup will display //
		//So we need to block or ignore thoese Poups we can use the below codes to block by using the ChromeOptionsClass only//
		
		//Code for block ChromePopup//
		
		/*ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		   
		 */
	}

}
