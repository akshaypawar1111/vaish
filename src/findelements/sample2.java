package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 
{
	public static void main(String[] args) 
	{

		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\new chromedriver.exe\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_1cfjttkdmt_e&adgrpid=58507629306&hvpone=&hvptwo=&hvadid=549521495433&hvpos=&hvnetw=g&hvrand=2670116715536632728&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-28878962&hydadcr=14456_2238352&gclid=CjwKCAjwk6-LBhBZEiwAOUUDpw5rNsnNYGYhvdrMbAcUglxMkkmQ-xcNgpwf0ixcOAjaaw1yCfNf2hoC8U8QAvD_BwE");
		
		
		List<WebElement> totallinks = driver.findElements(By.xpath("//a"));
		
		
		System.out.println(totallinks.size());
		
		System.out.println("............................................");
		
		
		for(WebElement y:totallinks)
		
		{
			String text = y.getText();
			
			System.out.println(text);
		}
		
		
		
		
		
		
		
		
		
}}
