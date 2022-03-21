package practiseTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class TestNG6 
{
	
	@Parameters({"country","fname","lname"})
	@Test(priority=1)
	public void sree1(String country, String fname,String lname)
	{
		System.out.println(country+fname+lname);
		
	}
	@Parameters({"country","lname"})
	@Test(priority=2)
	public void sree2( String country,String lname)
	{
		System.out.println(country+lname);
	}
	
	@Parameters({"country", "fname"})
	@Test(priority=3)
	public void sree3(String country,String fname)
	{
		System.out.println(country+fname);
		
	}
	@Parameters({"country"})
	@Test(priority=4)
	public void sree4(String country)
	{
		System.out.println(country);
		
	}

}
