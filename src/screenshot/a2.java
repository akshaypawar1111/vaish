package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class a2 
{
	public static void main(String[] args) throws IOException 
	{

		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("akshay pawar");
		
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
		
		File i = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		System.out.println(i);
		
		File n=new File("F:\\\\selenium screenshort\\\\demo2.jpg");
		
		
		FileHandler.copy(i, n);
		
		
		
		
		
		
		
		
}}
