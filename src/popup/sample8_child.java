package popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample8_child 
{
public static void main(String[] args) throws InterruptedException
{
	
	System.setProperty("webdriver.chrome.driver", 
			"E:\\\\\\\\new chromedriver.exe\\\\\\\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://skpatro.github.io/demo/links/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//click on new tab from main page
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
	//get child window id
	Set<String> AllIds = driver.getWindowHandles();   //[mainPageID childWindowID]
	ArrayList<String> al=new ArrayList<String>(AllIds); //[mainPageID(0) childWindowID(1)]
	
	
	//switch to child window
	driver.switchTo().window(al.get(1)) ;   //string window id
		

	//click on training link on child window
	driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	
	Thread.sleep(3000);
		
	//switch to main page
	driver.switchTo().window(al.get(0));
	
	//click on new window btn from main page
	driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	
	
	
}
}