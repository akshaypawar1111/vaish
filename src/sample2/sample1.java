package sample2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 
{
public static void main(String[] args) throws InterruptedException 
{

	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.Google.com/");
	
	String t = driver.getTitle();
	  System.out.println(t);
	
	
	
      String u = driver.getCurrentUrl();
      System.out.println(u);
	
	Thread.sleep(3000);
	
	Dimension d=new Dimension(400, 300);
	
	 driver.manage().window().setSize(d);
	  
	  Thread.sleep(3000);
	  
	driver.manage().window().maximize();
	 Thread.sleep(3000);
	 
	 
	 Dimension b=new Dimension(500, 600);
	 driver.manage().window().setSize(b);
	 Thread.sleep(3000);
	 
	 driver.close();
}
}
