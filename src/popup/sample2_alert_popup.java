package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2_alert_popup 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();                     //alert popup   //need to switch selenium focus from main page to alert popup
		
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("akshay");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		
	
		
		Alert a = driver.switchTo().alert();
		
		String t = a.getText();
		
		
		
System.out.println(t);		
Thread.sleep(2000);

  a.accept();                     //accept() to click on OK button
 String e = a.getText();
 System.out.println(e);
  
  

}
}
