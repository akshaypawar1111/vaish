package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class x1
{

	
	
	@FindBy(xpath = "") private WebElement un;
	
	@FindBy(xpath = "") private WebElement pass;
	
	
	
	public x1(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void username()
	{
		
		un.sendKeys();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
