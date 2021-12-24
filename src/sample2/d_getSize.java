package sample2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class d_getSize
{
public static void main(String[] args) {
	
	
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.Google.com/");
	
	
	
	Dimension d = driver.manage().window().getSize();
	
	System.out.println(d);
	
	
	
	
	
}
}
