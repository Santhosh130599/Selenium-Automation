import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement Dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select DropDownlist = new Select(Dropdown);
		//By Index method//
		DropDownlist.selectByIndex(3);
		System.out.println(DropDownlist.getFirstSelectedOption().getText());
		
		// by Visible text//
		DropDownlist.selectByVisibleText("AED");
		System.out.println(DropDownlist.getFirstSelectedOption().getText());

		
		//By Value method//
		DropDownlist.selectByValue("INR");
		System.out.println(DropDownlist.getFirstSelectedOption().getText());
	}

}
