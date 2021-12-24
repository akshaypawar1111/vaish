package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class k1                         //POM class 1
{

	//step1 : varible should be declared with private access specifier using @findby annotation
@FindBy(xpath = "//input[@type='text']")	private WebElement un;       //here variable type is Webelement
@FindBy(xpath = "//input[@type='password']") private WebElement pass;
	
@FindBy(xpath = "//button[@type='submit']")  private WebElement login;
	
	
	  
	  //step 2: initialize within the constructor with access specifier as public and using Pagefactory
	


public k1(WebDriver driver)  //main class driver will now come here(i.e in pom class)
	{
		PageFactory.initElements(driver, this);   //now above drier(i.e driver in constructor) we can use here and now this driver will take you to global variable of current class to convert @findBy annotation to driver.findelement
	}                              //this single statement is enough to convert all the webelement present in class(i.e un, pass, login)
	





	//step3: usage within the method with access specifier public
	public void user()
	{
		un.sendKeys("DV1510");
		
	}
	
	public void pass()
	{
		pass.sendKeys("Pass@123");
		
	}
	public void login()
	{
		
		login.click();
	}
	
	
	
}
