package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class b1 
{
	public static void main(String[] args) throws InterruptedException
	{

		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\new chromedriver.exe\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///E:/html/sample6_multiplecountry.html");
		
		
	//	Thread.sleep(1000);
		
		
		WebElement multi = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s=new Select(multi);
		
		s.selectByIndex(0);
		
		s.selectByVisibleText("UK");
		s.selectByVisibleText("NEPAL");
		
		List<WebElement> q1 = s.getAllSelectedOptions();
		
		
		for(WebElement f:q1)
		{
			
			System.out.println(f.getText());
		}
		
		System.out.println("...................get All...................");
		
		List<WebElement> w = s.getOptions();
		
		
		for(WebElement t1:w)
		
		{
			System.out.println(t1.getText());
		}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
}}
