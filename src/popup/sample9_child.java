package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample9_child 
{
public static void main(String[] args) throws InterruptedException
{

	System.setProperty("webdriver.chrome.driver", 
			"E:\\\\\\\\new chromedriver.exe\\\\\\\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://skpatro.github.io/demo/links/");
	
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	
	
	
	Set<String> Allid = driver.getWindowHandles();
	
	ArrayList<String> a=new ArrayList<String>(Allid);
	
	
	driver.switchTo().window(a.get(1));
	
	driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("akshaypawar1111");
	
	
	
	Thread.sleep(3000);
	
	driver.switchTo().window(a.get(0));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}