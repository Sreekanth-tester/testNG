package practiseTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG8 
{
	@Parameters({"x","y"})
	@Test(priority=1,groups= {"arithmetic addition"})
	public void testmethod1(int x, int y)
	{
		
		int z=x+y;
	    System.out.println(z);
	}
	
	
	@Parameters({"x","y"})
	@Test(priority=2,groups= {"arithmetic substraction"} )
	public void testmethod2(int x, int y)
	{
		int z=x-y;
	    System.out.println(z);
	}
	
	
	
	@Parameters({"x","y"})
	@Test(priority=3,dependsOnGroups = {"arithmetic substraction","arithmetic addition"},enabled=false)
	public void testmethod3(int x, int y)
	{
		int z=x*y;
	    System.out.println(z);
	}
	//here in testmethod3 when we set enabled=false this annotated method wont execute even though the above two methods are passed.
	
	
	
	@Parameters({"x","w"})
	@Test(priority=4,groups= {"arithmetic division"},expectedExceptions=java.lang.ArithmeticException.class)
	public void testmethod4(int x, int w)
	{
		int z=x/w;
	    System.out.println(z);
	}
	
}
