import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Multiple_Broken_links {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		/*UnderStand the concept 
		 * 
		 * Broken Link - means URL which is Not working is called Broken Link
		 * For Eg -  when we enter the URL it will show the 404 Bad Gateway Error 
		 * 
		 * Now We need to identify particular box how much links are broken links
		 * 
		 * For that we have a one method in java...By using Both Selenium and Java will find the Broken Links
		 * 
		 * Step -1 --> Get all the urls that tied up with the links by using Selenium
		 * Step -2----> By using the java method call those urls and get the status code
		 * Step -3--->  if the status code which is having >400 as the status codes are Broken Links
		 * */
		// Here WE doing for All the url in the footer
		
		List<WebElement> Links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		SoftAssert a = new SoftAssert(); //------>impot it as the TestNG 
		for(WebElement SingleLink:Links)//Enhanced Loops
		{
			String url = SingleLink.getAttribute("href");
			System.out.println(url);
			HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
			connection.setRequestMethod("HEAD");
			connection.connect();
			int StatusCodeReturn = connection.getResponseCode();
			System.out.println(StatusCodeReturn);
			//Validating the status and code if the status code is above the 400 response we will fail the test
			//By using the if condiditon validation at particular point test will fail and it will not execute further Process 
			//So we Avoid by this scenario by using the If condition Validation//
			
			//For that purpose only we overcome as Soft Assert Concept By using this concept we can Procced further if test is fail also...//
			
			
//Soft Assert Concept // It comes from the TestNG---> First create the object and use it..
			
			
		
			a.assertTrue(StatusCodeReturn<400, "The Broken link Name is "+SingleLink.getText()+"broken with the status code of "+StatusCodeReturn);
			
			
			
			/*if(StatusCodeReturn>400)
			{
				System.out.println("The Broken link Name is "+SingleLink.getText()+"broken with the status code of "+StatusCodeReturn);
				Assert.assertTrue(false);
			}*/
		}
		
		// At end of the Loop must want to enter the AsserAll ---> Because then only in Console we will say 
		//how much Test are failed we came to Know otherwise it will not know for us...//
		
		a.assertAll();
	}

}
