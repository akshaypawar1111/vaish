package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class b4 
{
	public static void main(String[] args) throws InterruptedException 
	{

		
		System.setProperty("webdriver.chrome.driver",
	                    "E:\\\\new chromedriver.exe\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/search?q=dropdown+sites+testing&oq=&aqs=chrome.2.35i39i362l8...8.132524803j0j15&sourceid=chrome&ie=UTF-8");
		
		
		driver.findElement(By.partialLinkText("Selenium ")).click();
		
		
		Thread.sleep(1000);
		
		WebElement week = driver.findElement(By.xpath("//select[@id='multi-select']"));
		
		Select s=new Select(week);
		Thread.sleep(1000);
		
		
		s.selectByVisibleText("Pennsylvania");             //selectbyvisibletext
		Thread.sleep(1000);
		
		s.selectByIndex(2);                          //selectbyindex 
		Thread.sleep(1000);
		s.selectByVisibleText("Washington");
		Thread.sleep(1000);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByIndex(4);
		Thread.sleep(2000);
		
		s.deselectAll();                                     //deselect
		
		s.selectByVisibleText("Pennsylvania");
		Thread.sleep(1000);
		
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByVisibleText("Washington");
		
		
		
		System.out.println("..............first selected option............");
		
		String tt = s.getFirstSelectedOption().getText();            //getfirstselectedoption    
		
		
		System.out.println(tt);
		
		
		System.out.println("..............all selected options............");
		
		
		List<WebElement> allselected = s.getAllSelectedOptions();           //getallselectedoptions
		
		for(WebElement q1:allselected)
		
		System.out.println(q1.getText());              //Note: if we dont write getText we will only get address of that elements
		
		System.out.println("..............all   options............");
		
		
		
		List<WebElement> overall = s.getOptions();            //getoptions
		
		for(WebElement o:overall)
		
		
		System.out.println(o.getText());
		
		System.out.println("..............size............");
		
		System.out.println(s.getOptions().size());                         //size 
		
		
		
		
		
		
		
		
		
		
		
		
}}
