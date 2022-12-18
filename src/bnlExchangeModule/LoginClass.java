package bnlExchangeModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginClass

{
	public void LoginMethod(WebDriver driver) throws InterruptedException
	{
	driver.get("https://bnl-in-qa-pwa.ivyretailassist.com/");
	
	//Thread.sleep(9000);
	
	//driver.findElement(By.cssSelector(".fa.fa-times-circle.fa-lg.modal-close-button-icon")).click();
	
	WebElement input = driver.findElement(By.id("newLoginUserNameForm_userName"));
	
	input.sendKeys("8892933298");
	
	WebElement sigin = driver.findElement(By.xpath("(//button[@type=\"submit\"])"));
	
	sigin.click();
	
	Thread.sleep(7000);
	}

}
