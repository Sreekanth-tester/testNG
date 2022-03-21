package practiseTestNG;

import org.testng.annotations.Test;

public class TestNG10 
{
	@Test(priority=1,invocationCount=3)
	public void testmethod0()
	{
		int x=10;
		int y=0;
		int z=x/y;
		System.out.println(z);
		
	}
	
	@Test(priority=1,invocationCount=3,invocationTimeOut=20000)
	public void testmethod1()
	{
		int x=10;
		int y=20;
		int z=x+y;
		System.out.println(z);
		
	}
	
	@Test(priority=1,dependsOnMethods= {"testmethod0","testmethod1"})
	public void testmethod()
	{
		int x=10;
		int y=20;
		int z=x+y;
		System.out.println(z);
		
	}
}
