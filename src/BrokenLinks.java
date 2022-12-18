

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinks {
	
	public static void main(String[] args) throws MalformedURLException, IOException  
	{
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
		// Here only doing for SOAPUI url 
		
//STEP - 1:--> GET THE URL BY USING THE SELENIUM CONCEPT
		
		String url = driver.findElement(By.xpath("(//li[@class='gf-li']/a)[1]")).getAttribute("href");
		System.out.println(url);
		//String url1 = "https://rahulshettyacademy.com/AutomationPractice/";
		
//STEP - 2 --> By using the java method call those urls and get the status code
		
		//for that we need a method called openconnection()
		//To use this openconnection method we having class called urlclass , create the obj anc call the class we can use it this method
		
		HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		int StatusCodeReturn = connection.getResponseCode();
		System.out.println(StatusCodeReturn);
		
	}
}
