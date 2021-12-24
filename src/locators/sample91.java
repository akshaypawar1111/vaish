package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample91 
{
public static void main(String[] args) 
{

	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://zoom.us/");
	
	
	String title= driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	driver.findElement(By.xpath("//a[text()='SIGN IN']")).click();
	
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8546785");
	
	
	driver.findElement(By.xpath("//button[contains(@class,'btn ')]")).click();
	
	
	
	
	
	
	
	
	
	
}
}
