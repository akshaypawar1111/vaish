package test_NG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multibrowser2_ 
{


	@Parameters("browserName")
	@Test
	public void testcase1(String browserName) throws InterruptedException
	{
		
		
	WebDriver driver=null;
if(browserName.equals("Chrome"))
	
{
	
	System.setProperty("webdriver.chrome.driver", 
			"E:\\new chromedriver.exe\\chromedriver.exe");
	
	 driver=new ChromeDriver();
}
	

else if(browserName.equals("msedge")) {

System.setProperty("webdriver.edge.driver", 
		"E:\\new edge driver\\msedgedriver.exe");
		
 driver=new EdgeDriver();


	}
else if(browserName.equals("Opera")) 
{

System.setProperty("webdriver.opera.driver", 
		"E:\\new opera driver\\operadriver_win64\\operadriver.exe");
		
driver=new OperaDriver();


	
	
	
}



driver.get("https://www.flipkart.com/");

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();


driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mi tv");

driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

WebElement tt = driver.findElement(By.xpath("(//div[@class='_3pLy-c row']//span)[13]"));

    tt.click();
String text = tt.getText();


System.out.println(text);




}
}
