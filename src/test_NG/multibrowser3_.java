package test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multibrowser3_
{
    @Parameters("bname")
	@Test
	public void testcase1(String bname)
	{
    	WebDriver driver=null;
if(bname.equals("msedge")) {
	
System.setProperty("webdriver.edge.driver", 
		"E:\\new edge driver\\msedgedriver.exe");
		

 driver=new EdgeDriver();}
 
 else if(bname.endsWith("Chrome"))
 {
	 System.setProperty("webdriver.chrome.driver", 
				"E:\\new chromedriver.exe\\chromedriver.exe");
		
		
driver=new ChromeDriver();
 
 }
 else if(bname.equals("Opera"))
 {
 
	 System.setProperty("webdriver.opera.driver", 
				"E:\\new opera driver\\operadriver_win64\\operadriver.exe");
		
		
		 driver=new OperaDriver();
		
	//	driver.get("");
	
 }


driver.get("https://www.flipkart.com/");
           









 }
		
		
		
}
