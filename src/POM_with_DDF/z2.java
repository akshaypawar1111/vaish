package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class z2
{

@FindBy(xpath = "//input[@id='pin']")	private WebElement pin;
@FindBy(xpath = "//button[@type='submit']")	private WebElement submit;
//@FindBy(xpath = "")	private WebElement lgn;
	
	


public z2(WebDriver driver)
{
	PageFactory.initElements(driver, this);

}



public void pinenter(String pininfo)
{
	pin.sendKeys(pininfo);

}

public void submitbutton()
{
	submit.click();

}


}
