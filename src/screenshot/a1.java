package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class a1 
{
public static void main(String[] args) throws IOException 
{

	System.setProperty("webdriver.chrome.driver", 
			"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	File q1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);    //to take ss using selenium webdriver 1st we need to typr cast webdriver object in takescreenshot interface then we need to call function getscreenshotAS which accepts the  argument output.file 
	
	System.out.println(q1);
	
	
 File f=new File("F:\\selenium screenshort\\demo1.jpg");     
	 
	FileHandler.copy(q1,             f);    //to store ss in local driver we need to call function filehandler.copy which accepts 2 parameters (sourse and destination)
	             //(source, destination)    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
