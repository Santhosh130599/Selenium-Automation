import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//santhosh.s//Downloads//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		int RowsValues = driver.findElements(By.xpath("//table[@name='courses']//tbody//tr")).size();
		System.out.println(RowsValues);
		int ColumnValues = driver.findElements(By.xpath("//table[@name='courses']//tbody//tr//th")).size();
		System.out.println(ColumnValues);
		String Data = driver.findElement(By.xpath("//table[@name='courses']//tbody//tr[3]")).getText();
		System.out.println(Data);
	}

}
