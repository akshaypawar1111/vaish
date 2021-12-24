package testNG_assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class sample9_3_softAssert_class 
{

	@Test
	public void m1()
	{
		
		SoftAssert ss=new SoftAssert();
		
		
		String a1="akshay";
		String a2="AKSHAY";
		String a3="hi";
		
		
		ss.assertEquals(a1, a2);  //verification 1
		
		ss.assertEquals(a2, a3);   //verification 2
		
		
		ss.assertEquals(a1, a3);   //verification 3
		
		
		
		ss.assertAll();     //assertAll() is used to notify all the failed verifications from the method
		
		
		   //i.e by using SoftAssert we can overcome the disadvantages of assert class
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
