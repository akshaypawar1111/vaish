package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class z1 
{

@FindBy(xpath = "//input[@type='text']")	private WebElement usd;
@FindBy(xpath = "//input[@type='password']")	private WebElement psd;
@FindBy(xpath = "//button[@type='submit']")	private WebElement lgn;
	
	


public z1(WebDriver driver)
{
	PageFactory.initElements(driver, this);

}



public void un(String userinfo)
{
	usd.sendKeys(userinfo);

}

public void pass(String passinfo)
{
psd.sendKeys(passinfo);	

}

public void login()
{
	lgn.click();

}


	
	
}
