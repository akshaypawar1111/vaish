package testNG_assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class sample99 
{

	
	@Test
	public void m1()
	{
		
		String v ="akshay";
		
		String w ="pawar";
		
		String  x="akshay";
		
		
		String y  ="pawar";
		
		
		
		SoftAssert s=new SoftAssert();
		
		s.assertEquals(v, w);
		
		s.assertEquals(v, x);
		
		s.assertEquals(v, y);
		
		
		
		
		s.assertAll();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
