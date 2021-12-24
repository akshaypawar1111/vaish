package popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample9_child2
{
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\\\\\new chromedriver.exe\\\\\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> o = driver.getWindowHandles();
		
		ArrayList<String> p=new ArrayList<String>(o);
		
		driver.switchTo().window(p.get(1));
		
		driver.findElement(By.xpath("(//span[text()='About me'])[4]")).click();
		
		driver.switchTo().window(p.get(0));
		
		
		
		
		
		
}}
