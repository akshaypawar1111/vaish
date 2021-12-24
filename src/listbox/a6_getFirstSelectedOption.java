package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a6_getFirstSelectedOption 
{
public static void main(String[] args) throws InterruptedException
{

	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	
	WebElement e= driver.findElement(By.xpath("//select[@id='year']"));
	
	
	Select s=new Select(e);
	
	//s.selectByValue("1999");
	
	String q1 = s.getFirstSelectedOption().getText();
	
	System.out.println(q1);
	

	
	
	
	
	
}
}
