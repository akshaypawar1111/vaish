package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite_page3_home

{

	
@FindBy(xpath = "//span[@class='user-id']") 	private WebElement userid;
	
	
	
public kite_page3_home(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
	
	
	public void homepg()
	{
		
		String act= userid.getText();
		
		String exp = "DV1510";
	
	
	if(act.equals(exp))
	{
	System.out.println("pass");
	
	}
	else
	{
	
	System.out.println("fail");
	
	
	}
	
	}}
