package popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample6_child_browser_popup
{
public static void main(String[] args)
{

	
	System.setProperty("webdriver.chrome.driver", 
			"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get(" https://skpatro.github.io/demo/links/");
	
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
	
	Set<String> c = driver.getWindowHandles();    //to get child browser id/address as well as the main pg id call function getwindowHandles
	
	ArrayList<String> a=new ArrayList<String>(c);  //to store the set of ids make use of arraylist 
	
	String id = a.get(1);
	
	driver.switchTo().window(id);    //to switch selenium focus from main page to child window use funtion (<--)
	
	
	
	driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	
	
	
	
}
}
