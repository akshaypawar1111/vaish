package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1_rowsize
{
	public static void main(String[] args) throws InterruptedException      
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\new chromedriver.exe\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("file:///E:/html/sample4.html");                                      
		
		
		List<WebElement> o = driver.findElements(By.xpath("//table[@id='11']//tr"));      //findelements
		
		
		System.out.println(o.size());                               //rowsize       
		
		
		
		
		
		
		
		
		
}}
