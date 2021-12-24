package sample2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4
{
public static void main(String[] args) {
	
	
	
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
driver.get("https://www.binance.com/en");

	String t = driver.getTitle();
	
String expTitle="binance";

	if(expTitle.equals(t))
			{
		System.out.println("pass");
		
			}
	
	else
	{
		System.out.println("fail");
	}
	
	
	
	
	
	
	
	
	
	
}
}
