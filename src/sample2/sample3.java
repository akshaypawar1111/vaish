package sample2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3 
{
public static void main(String[] args) throws InterruptedException 
{

	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.instagram.com/");
	
	String title=driver.getTitle();
	System.out.println(title);
	
	String url= driver.getCurrentUrl();
	System.out.println(url);
	
	
	
	driver.navigate().to("https://www.binance.com/");
	
	Thread.sleep(2000);
	
	
	
	Dimension d=driver.manage().window().getSize();

	System.out.println(d);
	Thread.sleep(2000);
	
driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	
	Dimension f=new Dimension(500, 400);
	
		driver.manage().window().setSize(f)	;
		Thread.sleep(3000);
		
		
		driver.quit();
	
	
	
}
}
