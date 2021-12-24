package testNG_assert;

import org.junit.Assert;
import org.testng.annotations.Test;

public class sample9_2_disadvantage_of_assertclass
{

	
	@Test
	public void method1()                  
	{
		
		String a1= "akshay";
		String a2= "AKSHAY";
		String a3= "AKSHAY";
		
		Assert.assertEquals(a1, a2);       //verification 1
		
		Assert.assertEquals(a2, a3);          //verification 2
		
		Assert.assertEquals(a1, a3);              //verification 3
	}
	
	
	
	//here there are multiple verifications in a single method ,but while execution ,if the 1st verification fails then assert class will not verify the remaining verifications
	
	//i.e 1st is failed then 2,3 will not be verified if we use assert class
	
	
	
	
	
	
	
	
	
}
