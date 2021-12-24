package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class m2 
{

		@FindBy(xpath = "//input[@type='password']")  private  WebElement pin;
		@FindBy(xpath = "//button[@type='submit']")  private  WebElement submit;
	//	@FindBy(xpath = "")  private  WebElement loghin;
		
		
		
		public m2(WebDriver driver)
		{
			
			PageFactory.initElements(driver, this);
			
		}
		
		
		
		
		public void inputm2pin(String pinnum)
		{
			
			pin.sendKeys(pinnum);
			
		}
		
		public void clickm2submitbutton()
		{
			
			submit.click();
			
		}
		
}
