package practiseTestNG;


                                      //@DataProvider annotated method provides data to @Test annotated method



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG1 
{
	@DataProvider(name="datamethod")
	public Object[][] method1()
	{
		Object[][] data=new Object[][]
				{
					{23,42,12},
					{24,65,-12},
					{42,14,22}
				};
				return(data);
	}
	
	@Test(priority=1,dataProvider="datamethod")
	public void testMethod1(int x, int y, int z)
	{
		int w=x+y+z;
		System.out.println(w);
	}
	
	@Test(priority=2,dataProvider="datamethod")
	public void testMethod2(int x, int y, int z)
	{
		int w=x-y+z;
		System.out.println(w);
	}
	
	
}
