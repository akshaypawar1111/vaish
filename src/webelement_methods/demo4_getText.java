package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4_getText
{

	

public static void main(String[] args)         
{

	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/login/");
	

	
	
   String text = driver.findElement(By.partialLinkText("account")).getText();   //getText- used to get text present in webpage
	
	System.out.println(text);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}