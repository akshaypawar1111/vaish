package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a7_getoptions 
{
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.navigate().to("file:///E:/html/sample6_multiplecountry.html");
		
		WebElement q = driver.findElement(By.xpath("//select[@id='1234']"));
		
		
	Select s=new Select(q);
	Thread.sleep(2000);
//		
		s.selectByIndex(2);
//		
	Thread.sleep(1000);
	s.selectByVisibleText("INDIA");
	Thread.sleep(1000);
	s.selectByVisibleText("TURKEY");
	Thread.sleep(1000);
		
		
		s.deselectByIndex(2);
		Thread.sleep(1000);
//		
		boolean w = s.isMultiple();
		
		System.out.println(w);
		
		if(w==true)
		{
			System.out.println("list is multi selectable");
			
		}
		else
		{
			System.out.println("list box is single selectable");
		}
	
		
            String text = s.getFirstSelectedOption().getText();

		
		System.out.println(text);
		
		
		
		
		
		
		
}}
