package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite_home 
{

	@FindBy(xpath ="//span[@class='user-id']" ) private WebElement userId;
	
	@FindBy(xpath ="//a[text()=' Logout']" ) private WebElement logout;
	
	
	public kite_home(WebDriver driver)
{
		
PageFactory.initElements(driver, this);

}
	
	public String getkitehomepageuserid()
	
	{
		String u = userId.getText();
		
		return u;
		
	}
	
	
	public void clickonuserID()
	{
		
		
		
		userId.click();
		
		
	}
	
	

	public void logoutfromkite()
	{
		
		logout.click();
		
		
	}
	
	
	
	
	
	
	
}
