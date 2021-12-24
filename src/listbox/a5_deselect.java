package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a5_deselect
{
	public static void main(String[] args) throws InterruptedException
	{

		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");

		 WebDriver driver =new ChromeDriver();
		 
		driver.get("file:///E:/html/sample6_multiplecountry.html");
		
		WebElement country = driver.findElement(By.xpath("//select[@id='1234']"));
		
		
		
		Select s=new Select(country);
		Thread.sleep(3000);
		
		
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByIndex(0);
		Thread.sleep(2000);
		
		s.deselectByIndex(2);        // to deselect selected option
		
		s.deselectAll();         //deselectAll - to deselect all the selected options
		 
		boolean t = s.isMultiple();
		
		System.out.println(t);
		
		if(t==true)
		{
			System.out.println("listbox is of multiple select");
		}		
		else
		{
			System.out.println("list box is of single select");
		}
		
		
		
	
	}
		
//		public static void main(int[] args) 
//		{
//		
//			System.out.println("main ethod 2");
//		}
//	
		
		
}
