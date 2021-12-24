package POM_DDF_BaseClass_UtilityClass;

import java.io.FileInputStream;   
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import POM_with_DDF.k1;
import POM_with_DDF.k2;
import POM_with_DDF.k3;



public class kite_testClass1  extends baseclass_1
{
	   

	k1 loginpage;
	k2 submitpage;
	k3 homepage;
	int testID;
	
	@BeforeClass
	public void login() throws EncryptedDocumentException, IOException
	{
		

		
		
          openbrowser();
		
		 loginpage=new k1(driver);
		 submitpage =new k2(driver);
		 homepage =new k3(driver);	
		
			
		
	}	
	
	
			@BeforeMethod
			public void loginpage() throws EncryptedDocumentException, IOException
			{
				
				
				loginpage.inputk1username(utilityclass.getexcell(0, 0));
				loginpage.inputk2password(utilityclass.getexcell(0, 1));
				loginpage.clickk3loginbutton();
				
				submitpage.inputk2pin(utilityclass.getexcell(1, 0));
				submitpage.clickk2submitbutton();
				
				
			}
			
			@Test
			public void homepage11() throws EncryptedDocumentException, IOException
			{
				testID=101;
				String exp = utilityclass.getexcell(2, 2);
				
				String act=homepage.getkitehomepageuserid();
				 Assert.assertEquals(act, exp);
		
				
			}
			
			
			@AfterMethod
			public void logoutfromkite(ITestResult result) throws InterruptedException, IOException
			{
				if(result.getStatus()==ITestResult.FAILURE)
				{
					utilityclass.screenshot(driver, testID);
				}
//				else
//				{
//					
//					
//				}
				homepage.clickonuserID();
				Thread.sleep(3000);
			
				homepage.logoutfromkite();
				
				
			}
			
			
		
	
	@AfterClass
	public void logout() throws InterruptedException
	{
		
		Thread.sleep(3000);
		
		driver=null;
		homepage=null;
		submitpage=null;
		loginpage=null;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
