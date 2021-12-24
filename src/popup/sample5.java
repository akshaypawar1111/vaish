package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5
{
public static void main(String[] args) throws InterruptedException 
{

	
	
	System.setProperty("webdriver.chrome.driver", 
			"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
	
	
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("akshaypawar");
	
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	Alert a = driver.switchTo().alert();
	
	Thread.sleep(3000);	
	a.accept();
	String t = a.getText();
	
	System.out.println(t);
	
}
}
