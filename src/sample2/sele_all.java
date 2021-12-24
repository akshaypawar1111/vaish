package sample2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sele_all 
{
public static void main(String[] args) throws InterruptedException 
{

	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.google.com/mail/u/0/#inbox");
	
	String title=driver.getTitle();
	
	String url=driver.getCurrentUrl();
	
	driver.navigate().to("https://www.binance.com/en");
	Thread.sleep(4000);
	
	driver.navigate().back();
	Thread.sleep(4000);
	driver.navigate().forward();
	
	Thread.sleep(4000);
	
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	Dimension d= driver.manage().window().getSize();
	System.out.println(d);
	Thread.sleep(4000);
	
	Point p=driver.manage().window().getPosition();
	System.out.println(p);
	Thread.sleep(4000);
	
	
	Dimension b=new Dimension(600, 700);
	driver.manage().window().setSize(b);
	Thread.sleep(4000);
	
	
	Point l=new Point(400, 200);
	driver.manage().window().setPosition(l);
	Thread.sleep(4000);
	
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
}
}
