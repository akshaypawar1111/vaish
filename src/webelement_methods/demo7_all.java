package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo7_all 
{
public static void main(String[] args) throws InterruptedException {
	
	
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_ya_signin%26adgrpid%3D58507629306%26hvpone%3D%26hvptwo%3D%26hvadid%3D486387989733%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D3267798872766923769%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9301538%26hvtargid%3Dkwd-28878962%26hydadcr%3D14456_2154379%26gclid%3DCjwKCAjw-sqKBhBjEiwAVaQ9axXh36KrYsXuAn5akgnHw1OZF3zkD1hFyUR5Ul5QSYW-t7UBzL0bkRoCHPYQAvD_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	
	
	WebElement e=driver.findElement(By.id("ap_email")); 
	
	e.sendKeys("akshay45612");   //sendkeys
	Thread.sleep(3000);
	
	e.clear();    //clear
	
	
	
	System.out.println(driver.findElement(By.xpath("(//input[contains(@class,'a-')])[1]")).isEnabled());  //isEnabled
	
	
	System.out.println(driver.findElement(By.xpath("//a[text()='Privacy Notice']")).isDisplayed());  //isDisplayed
	
	System.out.println(driver.findElement(By.partialLinkText("Use")).getText());  //getTitle
	
	
	e.sendKeys("nikhil");     //sendkeys
	
	driver.findElement(By.partialLinkText("Create ")).click();   //click
	
	
	
	
	
}
}
