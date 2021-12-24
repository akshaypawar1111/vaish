package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class c1
{

	@FindBy(xpath = "") private WebElement un;
	@FindBy(xpath = "") private WebElement pass;
	@FindBy(xpath = "") private WebElement login;
	
	
	public c1(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void username() 
	{
		
		un.sendKeys("8928201111");
	}
	
	
	public void password() 
	{
		
		pass.sendKeys("akshay@123");
	}
	
	
	public void login() 
	{
		
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
