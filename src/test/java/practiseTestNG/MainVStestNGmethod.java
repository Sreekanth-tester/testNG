package practiseTestNG;

import org.testng.annotations.Test;

public class MainVStestNGmethod 
{

	//only one main method of java in a class
	public static void main(String[] args) 
	{
		System.out.println("main method running");

	}
	
	//multiple @Test annotations methods in one class
	
	@Test(priority=1)
	public void testmethod1()
	{
		System.out.println("test annotations method1");
		
	}
	@Test(priority=2)
	public void testmethod2()
	{
		System.out.println("test annotations method2");
		
	}
	
	

}
