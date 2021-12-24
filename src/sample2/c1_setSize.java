
package sample2;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_setSize 
{
public static void main(String[] args) throws InterruptedException
{

	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	
	driver.get("https://www.instagram.com/");
	

     Thread.sleep(3000);
	
	
	Dimension d =new Dimension(500, 400);
	
	
	driver.manage().window().setSize(d);
	
	Thread.sleep(3000);
	
	
	Dimension i =new Dimension(800, 900);
	driver.manage().window().setSize(i);
	
	

}}
