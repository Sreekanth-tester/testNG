package practiseTestNG;


import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestNG7 
{
	
	@Parameters({"country","fname","lname"})
    @Test(priority=1)
	public void testmethod1(String country,@Optional ("kalam")  String fname ,@Optional("abdul") String lname)
	{
		String result=country+fname+lname;
		System.out.println(result);
	}
	@Parameters({"country","fname"})
	 @Test(priority=2)
	public void testmethod2(String country,@Optional ("steve")  String fname )
	{
		String result=country+fname;
		System.out.println(result);
	}
	@Parameters({"country","lname"})
	 @Test(priority=3)
	public void testmethod3(String country,@Optional("jobs") String lname)
	{
		String result=country+lname;
		System.out.println(result);
	}
	
	
}
