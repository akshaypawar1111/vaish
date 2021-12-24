package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class z1
{

	
@FindBy(xpath = "")	private WebElement un;
@FindBy(xpath = "")	private WebElement pwd;
@FindBy(xpath = "") private WebElement login;
	
	
	
	public z1(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
		
	}	
	
	
	
	public void inputusernamez1()
	{
		
		
		un.sendKeys("");
		
	}
	
	
	
	public void inputpasswordz1()
	{
		
		
		pwd.sendKeys("");
		
	}
	
	
	
	public void clickloginbuttonz1()
	{
		
		
		login.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
