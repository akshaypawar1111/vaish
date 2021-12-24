package POM_DDF_BC_UC_propertyClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class k2
{

	
	@FindBy(xpath = "//input[@id='pin']") private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement submit;
	
	
	public k2(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void inputk2pin(String pini)
	{
	
	pin.sendKeys(pini);
	
	
	}
	
	public void clickk2submitbutton()
	{
	
	submit.click();
	
	
	}
	
	
	
	
	
	
	
	
	
	
}
