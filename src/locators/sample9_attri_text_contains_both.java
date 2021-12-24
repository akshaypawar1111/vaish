package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample9_attri_text_contains_both 
{
public static void main(String[] args) 
{

	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

	
	driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click(); //contains using text
	
	driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys("ahsjdsjd");  // xpath by attribute
	
	
      driver.findElement(By.xpath("//a[contains(text(),'Sign')]")).click();  //contains using text
	 
	driver.findElement(By.xpath("//input[contains(@class,'a-input')]")).sendKeys("8928201111");  //contains using attributes
	
	
	
	
}
}
