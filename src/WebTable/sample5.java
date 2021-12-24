package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5
{
	public static void main(String[] args) throws InterruptedException      
{
	
	System.setProperty("webdriver.chrome.driver", 
			"E:\\new chromedriver.exe\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("file:///E:/html/sample4.html");  
	
	
	for(int i=1; i<=3; i++)           //to get data from header column
		
	{
		
		String tt = driver.findElement(By.xpath("//table[@id='11']//tr[1]/td["+i+"]")).getText();
		
		System.out.print(tt+" ");
	}
	
	
	
	
	
}
}
