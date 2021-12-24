package popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample7_child
{
	public static void main(String[] args) throws InterruptedException
	{

		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(" https://skpatro.github.io/demo/links/");
		
		
		driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
		
		
		Set<String> c = driver.getWindowHandles();
		
		ArrayList<String> a=new ArrayList<>(c);
		
		String index = a.get(1);
		
		System.out.println(index);
		
		
		driver.switchTo().window(index);
		
		
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		Thread.sleep(3000);
		
		
	driver.switchTo().window(a.get(0));
		
		
		
		
}}
