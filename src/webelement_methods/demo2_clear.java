package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2_clear 
{

	

public static void main(String[] args) throws InterruptedException         
{

	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/login/");
	
	
	WebElement a=driver.findElement(By.xpath("//input[@name='email']"));
	
	a.sendKeys("akshaypawar");
	Thread.sleep(3000);
	a.clear();                //clear- used to remove input value from textbox/textfield
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}