package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite_login_page1                           //pom class 1
{

	//step1
	
 @FindBy(xpath = "//input[@type='text']")	private WebElement UN;
	
 @FindBy(xpath = "//input[@type='password']") private WebElement pass;
	
 @FindBy(xpath = "//button[@type='submit']") private WebElement login;
	
	
	//step2
 
	public kite_login_page1(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	//step3
	
	public void username()
	{
		
		UN.sendKeys("DV1510");
		
	}
	

	public void password()
	{
		
		pass.sendKeys("Pass@123");
		
	}
	

	public void loginbutton()
	{
		
		login.click();
		
	}
	
	
	
	
	
}
