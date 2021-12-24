package POM_DDF_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class k1 
{

	@FindBy(xpath = "//input[@type='text']") private WebElement un;
	@FindBy(xpath = "//input[@type='password']") private WebElement pass;
	@FindBy(xpath = "//button[@type='submit']") private WebElement login;
	
	
	public k1(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void inputk1username(String username)
	{
	
	un.sendKeys(username);
	
	}
	
	
//	public void inputk2password(String password)
//	{
//	
//	pass.sendKeys(password);
//	
//	}
	
	public void inputk2password(String password)
	{
		
		pass.sendKeys(password);
	}
	
	public void clickk3loginbutton()
	{
	
	login.click();
	
	}
	
	
	
	
	
	
}
