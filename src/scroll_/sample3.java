package scroll_;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class sample3
{
public static void main(String[] args) throws InterruptedException {

	
	
	

	System.setProperty("webdriver.opera.driver", 
			"E:\\new opera driver\\operadriver_win64\\operadriver.exe\\");
	
	
	WebDriver driver=new OperaDriver();


driver.get("http://demo.guru99.com/test/guru99home/");



                   WebElement ele = driver.findElement(By.xpath("//a[text()='Twitter']"));
	
	
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()" ,ele);
	
	
	
//	Thread.sleep(3000);
//	
//	
//	
//	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
//	
	
	
	
	
	
	
	
	
	
}
}
