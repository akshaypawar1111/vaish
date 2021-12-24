package test_NG_suite;



import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class f1_a2 
{
	@Test
	public void method3()
	{
		
		Reporter.log("running method m3", true);
		
	}
	@Test
	public void method4()
	{
		//Assert.fail();
		Reporter.log("running method m4", true);
		
	}
		
}
