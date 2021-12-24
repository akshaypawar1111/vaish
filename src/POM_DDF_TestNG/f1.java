package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class f1 
{
@FindBy(xpath = "(//input[@type='text'])[2]") private WebElement un;
	
	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']") private WebElement pass;
	@FindBy(xpath = "(//button[@type='submit'])[2]") private WebElement login;
	
	
	public f1(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	

	public void inputa1username(String username)
	{
		
		un.sendKeys(username);
		
		
	}
	
	
	public void inputa1password(String password)
	{
		
		pass.sendKeys(password);
		
		
	}
	
	public void clicka1login()
	{
		
		login.click();
		
		
	}
	
	
}
