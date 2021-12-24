package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class a4 {
	public static void main(String[] args) throws IOException 
	{

		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.binance.com/en/markets");
		
		
		File r = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(r);
		
		File f=new File("F:\\selenium screenshort\\demo4.jpg");
		
		FileHandler.copy(r, f);
		
		
		
		
		
		
		
}
}