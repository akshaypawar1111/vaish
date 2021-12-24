package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class a6 
{
	public static void main(String[] args) throws IOException 
	{

		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jio.com/selfcare/login/");
		
		
		File p = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		System.out.println(p);
		
		
		File f =new File("F:\\selenium screenshort\\demo6.jpg");
		
		FileHandler.copy(p, f);
		
			
		
}}
