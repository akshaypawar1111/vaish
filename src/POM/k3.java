package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class k3                      //POM class 3
{

	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement user;
	
	
	public k3(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void id()
	
	{
		
		String act = user.getText();
		
		String exp= "455";
		
		if(act.equals(exp))
		{
			
			System.out.println("pass");
		}
		
		else
		{
			System.out.println("fail");
		}
		
	}
	
	
	
	
	
}
