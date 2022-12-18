import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class login_Password_Dynamically {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		login_Password_Dynamically sc = new login_Password_Dynamically();
		
		String InputPassword = sc.getpassword(driver);
		
		System.out.println("Extracted Password to send in Password filed :"+InputPassword);
		
		String InputEmail = "santhoshselvam343@gmail.com";
		
		driver.navigate().back();
		driver.findElement(By.id("email")).sendKeys(InputEmail);
		
		driver.findElement(By.id("pass")).sendKeys( InputPassword);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(5000);
		
		WebElement ErrorText = driver.findElement(By.xpath("//div[@class='fsl fwb fcb']"));
		String ErrorMessgae = ErrorText.getText();
		System.out.println(ErrorMessgae);
		
		sc.Assertion_Testng(ErrorMessgae);
		
		sc.CloseBrowser(driver);
		

	}

	public String getpassword(WebDriver driver)
	{
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgotten password?")).click();
		String ForgotText = driver.findElement(By.xpath("//div[@class='_9nq2 marginBottom16px']")).getText();
		System.out.println("In Forgot Password page Text :"+ForgotText);
		String ReturnedPassword = PasswordSplit(ForgotText);
		return ReturnedPassword;
		
	}
	
	public static String PasswordSplit(String ForgotText)
	{
		String[] Password1 = ForgotText.split("or");
		
		//Oth index = Please enter your email address
		// 1st Index = mobile number to search for your account.
		
		String Password = Password1[1].split("to")[0];
		
		//String[] Password = Password1[1].split("to");
		//Password[0]
		
		return Password;
	}
	
	public boolean Assertion_Testng(String ErrorMessgae)
	{
		Assert.assertEquals(ErrorMessgae, "Wrong credentials");
		return true;
	}
	
	public void CloseBrowser(WebDriver driver)
	{
		driver.close();
	}
	
}

