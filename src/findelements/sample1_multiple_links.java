package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1_multiple_links
{
public static void main(String[] args) 
{

	
	System.setProperty("webdriver.chrome.driver", 
			"E:\\new chromedriver.exe\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	List<WebElement> m = driver.findElements(By.xpath("//a"));      //findelements () identifies the list of multiple elements present on webpage
	
	System.out.println(m.size());            //total number of links present on webpage
	
	
	for(WebElement all:m)
	
	{
		String i = all.getText();  // to get multiple links present on webpage
		System.out.println(i);
		
	}
	
	
	
}

}
