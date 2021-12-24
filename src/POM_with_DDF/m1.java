package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class m1
{

	
	@FindBy(xpath = "//input[@type='text']")  private  WebElement un;
	@FindBy(xpath = "//input[@type='password']")  private  WebElement pass;
	@FindBy(xpath = "//button[@type='submit']")  private  WebElement loghin;
	
	
	
	public m1(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	public void inputm1username(String username)
	{
		
		un.sendKeys(username);
		
	}
	
	public void inputm1password(String password)
	{
		
		pass.sendKeys(password);
		
	}
	
	
	public void clickm1loginbutton()
	{
		
		loghin.click();
		
	}
	
	
	
	
	
	
	
	
	
}
