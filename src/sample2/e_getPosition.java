package sample2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class e_getPosition
{
public static void main(String[] args) throws InterruptedException
{

	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.binance.com/");
	
	Thread.sleep(3000);
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	Dimension d =new Dimension(600, 400);
	driver.manage().window().setSize(d);
	
	Thread.sleep(3000);
	
	Point p =new Point(500, 300);
	driver.manage().window().setPosition(p);      //return type of setposition is Point
	
	Thread.sleep(3000);
	
	
	driver.close();
	
	
	
	
}
}
