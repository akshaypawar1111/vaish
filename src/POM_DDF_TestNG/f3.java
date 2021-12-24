package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class f3
{

	//@FindBy(xpath = "//input[@type='text']") private WebElement clicks21;
	@FindBy(xpath = "(//div[@class='_4rR01T'])[1]") private WebElement ratings;
	//@FindBy(xpath = "//input[@type='text']") private WebElement clickrating;
	
	

	public f3(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
//public void clickons21() throws InterruptedException
//	
//	{
//		
//		clicks21.click();
//		Thread.sleep(2000);
//		
//	}
	
	public void checkratings()
	
	{
		
		ratings.click();
		
	}
	
	
	
	
	
	
	
	
}
