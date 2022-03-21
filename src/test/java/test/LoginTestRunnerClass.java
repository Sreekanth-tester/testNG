package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestRunnerClass
{
	@DataProvider(name="testdata",parallel=true)
	public Object[][] datamethod()
	{
		Object[][] data=new Object[][]
				{
						{"chrome","srikanthdevella2020@gmail.com","valid","Srikanthdevella@2020","valid"},
						{"opera","srikanthdella20@gmail.com","invalid","Srikanthdevella@2020","valid"},
						{"firefox","srikanthdevella2020@gmail.com","valid","","blank"},
						{"edge","srikanthdevella2020@gmail.com","valid","srikanth@20","invalid"}
			   
				};
				return(data);
	}
	@Test(priority=1,dataProvider="testdata")
	public void testmethod1(String b,String u, String uc, String p, String pc)
	{
		
	}
}
