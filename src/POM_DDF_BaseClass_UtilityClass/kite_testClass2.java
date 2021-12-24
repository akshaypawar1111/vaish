package POM_DDF_BaseClass_UtilityClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_DDF_TestNG.kite_home;

public class kite_testClass2 extends baseclass_222
{
	k1 s1;
	k2 s2;
	k3 s3;
	int testcaseID;
	
	@BeforeClass
	public void open()
	{
		
		browsercode();
		
		
		 s1=new k1(driver);
		 s2=new k2(driver);
	     s3=new k3(driver);
	
		
	}
	
	
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException
	{
		
		s1.inputk1username(utilityclass222.exceINFO(0, 0));
	    s1.inputk2password(utilityclass222.exceINFO(0, 1));
		s1.clickk3loginbutton();
		
		s2.inputk2pin(utilityclass222.exceINFO(1, 0));
		s2.clickk2submitbutton();
		
	}
	
	
	
	
	@Test
public void tc1() throws EncryptedDocumentException, IOException
{
		
		testcaseID=999;
		String act = s3.getkitehomepageuserid();

   String exp=utilityclass222.exceINFO(2, 2);
   
   Assert.assertEquals(act, exp);
  

}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void logout(ITestResult result) throws IOException 
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			
			utilityclass222.capturescreenshot(driver, testcaseID);
		}
//		else
//		{
//			
//			
//		}
		
		s3.clickonuserID();
		s3.logoutfromkite();
	}
	
	
	
	
	
	
	
	
	@AfterClass
	public void close()
	{
		driver.close();
		driver=null;
		s1=null;
		s2=null;
		s3=null;
		
		
	}
	
	
	
	
	
	
}
