package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 
{
public static void main(String[] args) throws InterruptedException 
{

	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	
	String title=driver.getTitle();
	System.out.println(title);
	
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	driver.get("https://en-gb.facebook.com/");
	
	
	Thread.sleep(3000);
	
	driver.navigate().back();
	
	Thread.sleep(2000);
	
	Dimension d=new Dimension(200, 400);
	driver.manage().window().setSize(d);
	
	Thread.sleep(3000);
	
	Point p=new Point(100, 500);
	driver.manage().window().setPosition(p);
	
	driver.manage().window().maximize();
	
	driver.navigate().forward();
	
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.close();
	
	
	
	
}
}
