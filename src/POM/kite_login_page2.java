package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite_login_page2
{

	

	@FindBy(xpath = "//input[@id='pin']") private WebElement pin;
	
	@FindBy(xpath = "//button[@type='submit']") private WebElement submit;
	
	
	
	public kite_login_page2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void pin()
	{
	 pin.sendKeys("959594");
		
	}
	
	
	
	public void sumbitbutton()
	{
		submit.click();
		
	}
	
	
	
	
	
	
	
	
	
}
