package scroll_;




import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;



public class sample1_down_up
{

	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\new chromedriver.exe\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
	
	
	driver.get("http://demo.guru99.com/test/guru99home/");
	
   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");	

	Thread.sleep(3000);
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-500)");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
