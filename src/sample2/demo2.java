package sample2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 
{
public static void main(String[] args) 
{
  
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.instagram.com/");
	
	        String  actTitle = driver.getTitle();
	
	        
	
	String expTitle ="Instagram";
	
	
	if(actTitle.equals(expTitle))
	{
		System.out.println("Pass");
	}
	
	else
	{
		System.out.println("Fail");
	}
	
	
	
}
}
