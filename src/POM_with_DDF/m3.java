package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class m3
{

	@FindBy(xpath = "//span[@class='user-id']")  private  WebElement userID;
	//@FindBy(xpath = "")  private  WebElement submit;
//	@FindBy(xpath = "")  private  WebElement loghin;
	
	
	
	public m3(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void verifym3userID(String ID)
	{
		
		String act = userID.getText();
		
		String exp = "DV1510";
		
		
		if(act.equals(exp))
		{
			
			System.out.println("pass");
			
		}
		else
		{
			
			System.out.println("fail");
		}
	}
}
