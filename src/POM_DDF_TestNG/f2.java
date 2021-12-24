package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class f2
{

	@FindBy(xpath = "//input[@type='text']") private WebElement samsung;
	@FindBy(xpath = "//button[@type='submit']") private WebElement search;
	
	
	
	public f2(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void samsungsearch(String input)
	
	{
		
		samsung.sendKeys(input);
		
	}
	
	
	

	public void searchbutton()
	
	{
		
		search.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
