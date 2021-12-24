package POM_DDF_BC_UC_propertyClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass_222 
{
	
	 WebDriver driver;
public void browsercode() throws IOException
{
	
	System.setProperty("webdriver.chrome.driver", 
			"E:\\new chromedriver.exe\\chromedriver.exe");
	
	
     driver =new ChromeDriver();
	
	
	driver.get(utilityclass222.getdatafromPF("url"));   //pass key (url)
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);







}
}
