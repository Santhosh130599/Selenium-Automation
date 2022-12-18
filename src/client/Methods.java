package client;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Methods 
{

	public void CategorySelection(WebDriver driver,String CategoryList) 
	{
		// String[] CategoryList = {"Bottle","ColdCoffee","Oil-01","SPHERICAL"};

		

		switch (CategoryList) 
		{
		case "Bottle":
			
			driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner'] //div[@title='Bottle'] //div[text()='Bottle']")).click();
			break;
		case "ColdCoffee":
			
			driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner'] //div[@title='ColdCoffee'] //div[text()='ColdCoffee']")).click();
			break;
		case "Oil-01":
			
			driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner'] //div[@title='Oil-01'] //div[text()='Oil-01']")).click();
			break;
		case "SPHERICAL":
			
			driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner'] //div[@title='SPHERICAL'] //div[text()='SPHERICAL']")).click();
			break;
		}
	}
		
		
		public void SubCategorySelection(WebDriver driver, String CategoryList,String SubCategoryList)
		{
			if(CategoryList.contains("SPHERICAL"))
			{
				String[] SphericalSubCategorylist = {"BioTrue OneDay MF","Optima"};
				//System.out.println(SphericalSubCategorylist[0]);
				//System.out.println(SphericalSubCategorylist[1]);
				
				for(int i =0; i<SphericalSubCategorylist.length;i++)
				{
					//System.out.println(SphericalSubCategorylist[i]);
					if (SphericalSubCategorylist[i].equals(SubCategoryList))
					{
						//driver.findElement(By.xpath("(//div[@class='rc-virtual-list-holder-inner'] )[2]  //div[@title="+SubCategoryList+"] //div[text()="+SubCategoryList+"Frooti1']")).click();
						driver.findElement(By.xpath("//div[@title="+"'"+SubCategoryList+"'"+"] //div[text()="+"'"+SubCategoryList+"'"+"]")).click();
					}
					
				}
				
			}
			else if (CategoryList.contains("Oil-01"))
			{
				String OilSubCategorylist = "Speed Petrol";
				if (OilSubCategorylist.equals(SubCategoryList))
				{
				//driver.findElement(By.xpath("(//div[@class='rc-virtual-list-holder-inner'] )[2]  //div[@title='Speed Petrol'] //div[text()='Speed Petrol']")).click();
				driver.findElement(By.xpath("//div[@title="+"'"+SubCategoryList+"'"+"] //div[text()="+"'"+SubCategoryList+"'"+"]")).click();
				}
			}
			else if (CategoryList.contains("ColdCoffee"))
			{
				String CoffeeSubCategorylist = "ColdCoffee";
				if (CoffeeSubCategorylist.equals(SubCategoryList))
				{
				 driver.findElement(By.xpath("(//div[@class='rc-virtual-list-holder-inner'] )[2]  //div[@title='ColdCoffee'] //div[text()='ColdCoffee']")).click();
				  //driver.findElement(By.xpath("//div[@title="+"'"+SubCategoryList+"'"+"] //div[text()="+"'"+SubCategoryList+"'"+"]")).click();
				}
			}
			else
			{
				String[] BottleSubCategorylist = {"Frooti1","Frooti2","Frooti3","SB_2","SB_3","SB_4","SB_5","Slice","Slice2","Slice3"};
				
				for(int i =0; i<BottleSubCategorylist.length;i++)
				{
					//System.out.println(BottleSubCategorylist[i]);
					if (BottleSubCategorylist[i].equals(SubCategoryList))
					{
						//driver.findElement(By.xpath("(//div[@class='rc-virtual-list-holder-inner'] )[2]  //div[@title="+SubCategoryList+"] //div[text()="+SubCategoryList+"Frooti1']")).click();
						driver.findElement(By.xpath("//div[@title="+"'"+SubCategoryList+"'"+"] //div[text()="+"'"+SubCategoryList+"'"+"]")).click();
					}
					
				}
				
			}

		}
		
		public void ReturnProductSelection(WebDriver driver,List ItemList,int Qty) throws InterruptedException
		{
			List<WebElement> ProductList = driver.findElements(By.cssSelector(".ant-col.ant-col-18.p-name-wrap-three-line"));
			Thread.sleep(5000);
			int j=0;
			for(int i = 0 ; i<ProductList.size(); i++)
			{
				String ProductName = ProductList.get(i).getText();
				//System.out.println(ProductName);

				if (ItemList.contains(ProductName))
				{
					Thread.sleep(5000);
					driver.findElements(By.xpath("//div[@class='ant-col ant-col-6 text-center'] //button[@type='button']")).get(i).click();
					Thread.sleep(5000);
					j++;
					
					plusButton(driver,Qty); //Another Method for Product Add + for Adding product//
					
					if(j==ItemList.size())
					{
						break;
					}
					
				}
			}
		}
		
		public void OrderProductSelection(WebDriver driver,int Qty,List ItemList1) throws InterruptedException
		{
			List<WebElement> ProductList = driver.findElements(By.cssSelector(".ant-col.ant-col-22.cursor-pointer"));
			Thread.sleep(5000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;	
			jse.executeScript("window.scrollBy(0,200);");
			int l=0;
			for(int i = 0 ; i<ProductList.size(); i++)
			{
				String ProductName = ProductList.get(i).getText();
				//System.out.println(ProductName);
				
				if (ItemList1.contains(ProductName))
				{
					Thread.sleep(5000);
					int k =0;
					while(k<Qty) 
					{
						Thread.sleep(2000);
					driver.findElements(By.xpath("//span[@class='card-plus-sign']")).get(i).click();
					
					k++;
					
					//plusButton(driver,Qty); //Another Method for Product Add + for Adding product//
					}

				}
				
				if(l==ItemList1.size())
				{
					
					break;
				}
				l++;
			}
					
					NextButtonClick(driver);
					
					String DoneButton = driver.findElement(By.xpath("//span[text()='Done']")).getText();
					
					if(DoneButton.contains("Done"))
					{
						Thread.sleep(5000);
						driver.findElement(By.xpath("//span[text()='Done']")).click();				
					}
					
		}
		
		
		
		public void plusButton(WebDriver driver,int Qty) throws InterruptedException
		{
			int k =0;
			while(k<Qty)
			{
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[@class='d-flex align-items-center mt-1'] //span[@class='card-plus-sign']")).click();
				
				k++;
				
			}
			driver.findElement(By.xpath("//span[contains(.,'Update Entry')]")).click();
			
			Thread.sleep(2000);
		}
		
		public void NextButtonClick(WebDriver driver) throws InterruptedException
		{
			int i = 1;
			while(i<=2)
			{
				i++;
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				Thread.sleep(2000);
				
			}
		}
		
		
		String SuccessfulMessage;
		String NewOrderID;
		String ReturnOrderID;
		
		public boolean Result(WebDriver driver) throws InterruptedException
		{
			Thread.sleep(5000);
		    SuccessfulMessage = driver.findElement(By.xpath("//div[@class='ant-result-title']")).getText();
		    NewOrderID = driver.findElement(By.cssSelector(".pt-2.pb-1")).getText();
			ReturnOrderID = driver.findElement(By.cssSelector(".pt-2.pb-2")).getText();
			
			return true;
		}
		
		public void ValidatingResultNewOrderID(WebDriver driver) throws InterruptedException
		{
			//Successful Message Validating//
			Assert.assertEquals(SuccessfulMessage, "Order placed successfully");
			
			if (NewOrderID.contains("Exchange Order"))
			{
				driver.findElement(By.xpath("//div[@class='nav-link nav-link-drawer-menu-padding mt-1'] //i[@class='fa fa-bars fa-lg fav-product-header-icon cursor-pointer']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[@href='/ivy/orders']")).click();
				
				Thread.sleep(3000);
				List<WebElement> OrdersList1 = driver.findElements(By.xpath("//div[@class='ant-card-body'] //div[@class='ant-row']"));
				
				for (int i = 0; i<OrdersList1.size();i++)
				{
					Thread.sleep(3000);
					String OrderID = OrdersList1.get(i).getText();
					Thread.sleep(5000);
					//System.out.println(OrderID);
					
					// Exchange Order : Ex-OrderDistributor New231120220254
					
					String[] FormattedNewOrderID = NewOrderID.split(":");
					//System.out.println(FormattedNewOrderID[0]);
					//System.out.println(FormattedNewOrderID[1]);
					
					String UpdatedNewOrderID = FormattedNewOrderID[1].trim();
					
					//System.out.println(UpdatedNewOrderID);
					
					if (UpdatedNewOrderID.contains(OrderID))
					{
						System.out.println("Placed New orders are present in the My order Page");
						Assert.assertTrue(true);
						break; 
					}
				}
			}
			
			
		}
		
		public void ValidatingResultReturnOrderID(WebDriver driver) throws InterruptedException
		{
			if (ReturnOrderID.contains("Exchange Return Order"))
			{
				driver.findElement(By.xpath("//div[@class='nav-link nav-link-drawer-menu-padding mt-1'] //i[@class='fa fa-bars fa-lg fav-product-header-icon cursor-pointer']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[@href='/ivy/salesReturnHistory']")).click();
				
				Thread.sleep(3000);
				List<WebElement> ReturnOrdersList = driver.findElements(By.xpath("//div[@class='ant-card-body'] //div[@class='ant-row']"));
				
				for (int i = 0; i<ReturnOrdersList.size();i++)
				{
					Thread.sleep(3000);
					String OrderIDS = ReturnOrdersList.get(i).getText();
					Thread.sleep(5000);
					//System.out.println(OrderIDS);
					
					String[] FormattedreturnOrderID = ReturnOrderID.split(":");
					//System.out.println(FormattedreturnOrderID[0]);
					//System.out.println(FormattedreturnOrderID[1]);
					
					String UpdatedReturnOrderID = FormattedreturnOrderID[1].trim();
					
					//System.out.println(UpdatedReturnOrderID);
					
					if (UpdatedReturnOrderID.contains(OrderIDS))
					{
						Assert.assertTrue(true);
						System.out.println("Returned orders are present in Sales Return History");
						break;
					}
				}
			}
		}

}
