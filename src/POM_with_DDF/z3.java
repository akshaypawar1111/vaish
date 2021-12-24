package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class z3
{
	@FindBy(xpath = "//span[@class='user-id']")	private WebElement userIDverify;
	//@FindBy(xpath = "")	private WebElement click;
	@FindBy(xpath = "//a[text()=' Logout']")	private WebElement logout;
		
		


	public z3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}



	public void verifyuserid(String verifyinfo)
	{
		
String act = userIDverify.getText();
String exp="";

if(act.equals(exp))
{
	
System.out.println("passed");

}
else
{
	System.out.println("failed");
	}

	}
	
	
	
	public void clickonuser()
	{
		userIDverify.click();

	}
	public void logoutuser()
	{
		logout.click();

	}
}
