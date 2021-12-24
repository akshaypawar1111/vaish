package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class z2 
{

	
@FindBy(xpath = "")	private WebElement ok;


public z2(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}
	
	
	
	public void clickokbutton()
	{
		
		
		ok.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
