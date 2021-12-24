package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class b3
{

	
	
	@FindBy(xpath = "//span[text()='DV1510']") private WebElement userid;
	
	
	public b3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void user()
	{
		
		String act= userid.getText();
		
		String exp="5165216";
		
		
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
