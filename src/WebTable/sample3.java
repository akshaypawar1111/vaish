package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3
{
	public static void main(String[] args) throws InterruptedException      
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\new chromedriver.exe\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("file:///E:/html/sample4.html");  
		                                                        
		
		
		
		String text = driver.findElement(By.xpath("//table[@id='11']//tr[4]/td[2]")).getText();
			
		
		System.out.println(text);                  //to get any value from the table(particular cell)
		 
		
		
//		WebElement r = driver.findElement(By.xpath("//table[@id='11']//tr[1]/td[2]"));
//		
//		System.out.println(r.getText());                    // header data
		
		
		
}}
