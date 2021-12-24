package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class b2
{

	
	@FindBy(xpath = "//input[@id='pin']") private WebElement pp;
	@FindBy(xpath = "//button[@type='submit']") private WebElement s;
	
	
	public b2(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void pin()
	{
		
		pp.sendKeys("959594");
	}
	
	public void submit()
	{
		
		s.click();
	}
	
	
	
	
	
	
	
	
}
