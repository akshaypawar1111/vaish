package sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 
 {
public static void main(String[] args) throws InterruptedException 
{

	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.instagram.com/");
	
	Thread.sleep(5000);
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
