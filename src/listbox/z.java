package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class z
{
public static void main(String[] args) throws InterruptedException 
{


	
	System.setProperty("webdriver.chrome.driver",
			"E:\\new chromedriver.exe\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	
	driver.findElement(By.xpath("(//a[contains(@class,'_42ft ')])[3]")).click();
	
	Thread.sleep(3000);
	
	
	WebElement s = driver.findElement(By.xpath("//select[@id='month']"));
	
	
	Select a= new Select(s);
	
//	a.selectByIndex(5);
	
//	boolean t = a.isMultiple();
//	
//	
//	
//	
//	if(t==true)
//	{
//		
//		System.out.println("listbox is multselectable");
//	}	
//	else
//{
//		
//		System.out.println("listbox is NOT a  multselectable");
//	}	
//	
	
	
	List<WebElement> oo = a.getOptions();
	
	
//	System.out.println(oo);
	
	
	
	for(WebElement all:oo)
	
	
	{
		
		
		String v = all.getText();
		
		System.out.println(v);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
