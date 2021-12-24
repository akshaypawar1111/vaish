package sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample6
 {
public static void main(String[] args) throws InterruptedException 
{

	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.navigate().to("https://www.instagram.com/");
	

	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
