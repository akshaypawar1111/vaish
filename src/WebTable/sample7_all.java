package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample7_all
{
	public static void main(String[] args) throws InterruptedException      
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\new chromedriver.exe\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("file:///E:/html/sample4.html");
		
		for(int i=2;i<=4;i++)
		{
			
			for (int j = 1; j <=3; j++) 
			
			
			{
				if(i==1) 
				{
				String alltext = driver.findElement(By.xpath("//table[@id='11']//tr["+i+"]/th["+j+"]")).getText();
				
				System.out.print(alltext+"    ");
				}
				else
				{
					
					String alltext = driver.findElement(By.xpath("//table[@id='11']//tr["+i+"]/td["+j+"]")).getText();
					
					System.out.print(alltext+"    ");
					
				}
				
				
				
			}
			System.out.println();
			
			
		}
		
		
		
		
		
}}
