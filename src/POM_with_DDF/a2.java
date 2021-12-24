package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class a2 
{

	
	@FindBy(xpath = "//span[text()='Cart']")  private WebElement cart;
	@FindBy(xpath = "(//div[@class='xtXmba'])[3]") private WebElement mobileclick;
	
	
	public a2(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifya2cart(String cartvalue) throws InterruptedException
	{
		
		String act = cart.getText();
		
		String exp ="Cart";
		
		if(act.equals(exp))
		{
			
			System.out.println("pass");
		}
		
		
		else {
			System.out.println("fail");
			
		}
		
		Thread.sleep(2000);
		
		
//		public String getcartvalue()
//		{
//			
//			String o = cart.getText();
//			
//			return o;
//			
//		}
		
		
		
	}
	
	
		public void mobile()
		{
			
			mobileclick.click();
			
		}
		
}
	
	
	
	
	
	
	

