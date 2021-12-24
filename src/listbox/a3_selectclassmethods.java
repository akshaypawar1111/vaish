package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a3_selectclassmethods 
{
public static void main(String[] args)
{

	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");

	 WebDriver driver =new ChromeDriver();
	 
	driver.get("https://www.google.com/search?q=dropdown+sites+testing&sxsrf=AOaemvLT6i8tuRs-5kgR-j-NQoJPLwKMUA%3A1633506336818&ei=IFRdYbOzMcCV4-EP-uq9mAs&ved=0ahUKEwizw8anpbXzAhXAyjgGHXp1D7MQ4dUDCA4&uact=5&oq=dropdown+sites+testing&gs_lcp=Cgdnd3Mtd2l6EAMyBggAEBYQHjoHCCMQsAMQJzoHCAAQRxCwAzoICAAQFhAKEB46CAgAEAgQDRAeSgQIQRgAUKkqWMI6YJw9aAJwAngAgAHSAogBwQ6SAQcwLjMuNC4xmAEAoAEByAEJwAEB&sclient=gws-wiz");
	
	driver.findElement(By.partialLinkText("DropDown ")).click();
	
	
	WebElement l=driver.findElement(By.tagName("select"));
	
//	WebElement l=driver.findElement(By.xpath("//option[text()='Andorra']"));
	
	Select s =new Select(l);
	
         //s.selectByIndex(9);	
       //  s.selectByVisibleText("India");	
	       s.selectByValue("CUB");
	
	
	
	
	
	
	
	
}
}
