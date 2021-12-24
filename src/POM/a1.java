package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class a1 
{
	
	//step1)
   @FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")     private WebElement UN;
    @FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")   private WebElement pass;
    
    @FindBy(xpath = "(//button[@type='submit'])[2]") private WebElement login;


//step2
    
   public a1(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	
    }

//step3


public void username()
{
	UN.sendKeys("8928201111");
	
}

public void password()
{
	pass.sendKeys("akshay@123");
	
}


public void log()
{
	login.click();
	
}











}
