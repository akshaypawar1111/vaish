package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class b1 
{

	
	//step 1
	@FindBy(xpath = "//input[@type='text']") private WebElement u;
	@FindBy(xpath = "//input[@type='password']") private WebElement p;
	@FindBy(xpath = "//button[@type='submit']") private WebElement L;
	
	
	//step2
	
	public b1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);   //pageFactory is a class which contains static methods i.e initElements which is used to initialize the variable by identifying each element in webpage
		
	}
	
	public void un()
	{
		
		u.sendKeys("DV1510");
	}
	

	public void pass()
	{
		
		p.sendKeys("Pass@123");
	}
	

	public void login()
	{
		
		L.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
