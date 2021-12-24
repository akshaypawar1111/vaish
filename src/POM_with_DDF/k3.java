package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class k3 
{

  @FindBy(xpath = "//span[@class='user-id']")	private WebElement userid;
  @FindBy(xpath ="//a[text()=' Logout']" ) private WebElement logout;
	
	public k3(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
public String getkitehomepageuserid()
	
	{
		String u = userid.getText();
		
		return u;
		
	}
	
	
	public void clickonuserID()
	{
		
		
		
		userid.click();
		
		
	}
	
	

	public void logoutfromkite()
	{
		
		logout.click();
		
		
	}
	
	public void verifyk3userid(String uid) 
	{
	
	String act = userid.getText();
	
	String exp="DV1510";
	
	if(exp.equals(act))
	{
		System.out.println("pass");
		
	}
	else
	{
		
		System.out.println("fail");
	}
	}
	

	
	
	
	
	
	
	
	
	
}
