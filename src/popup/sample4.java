package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		
		Alert a = driver.switchTo().alert();
		
		//a.accept();
		
		String t = a.getText();
		
		System.out.println(t);
		Thread.sleep(2000);
		
		a.accept();
		
		
		
		
		
}}



















