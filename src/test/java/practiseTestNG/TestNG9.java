package practiseTestNG;

import org.testng.annotations.Test;

public class TestNG9 

{
	@Test(priority=1,description="sum of numbers")
	public void testmethod1()
	{
		int x=3;int y=45;int z=x+y;
		System.out.println(z);
	}
	
	@Test(priority=2,description="sum of characters")
	public void testmethod2()
	{
		char x='a' ;char y='4'; char z=(char) (x+y);
		System.out.println(z);
	}
	
	
	@Test(priority=3,description="regarding timeout",timeOut=20000)
	public void testmethod3()
	{
		int x=45;
		int z=34;
		int y=x-z;
		System.out.println(y);
	}
	
	@Test(priority=4,description="regarding exceptions",expectedExceptions= {ArithmeticException.class})
	public void testmethod4()
	{
		int x=10;
		int y=0;
		int z=x/y;
		System.out.println(z);
	}
	
	
	
}
