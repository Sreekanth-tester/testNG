package practiseTestNG;

//@DataProvider annotated method provides data to @Test annotated methods


  import java.lang.reflect.Method;





import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG2 
{
	@DataProvider(name="datamethod")
	public Object[][] method1(Method m)
	
	{
		
				if(m.getName().equalsIgnoreCase("testmethod1"))
				{
					Object[][] data=new Object[][]
							{
					{23,42,12},
					{24,65,-12},
					{42,14,22}
							};
					return(data);	
				}
				
				else if(m.getName().equalsIgnoreCase("testmethod2"))
				{
					Object[][] data=new Object[][]
							{
					{"abdul","kalam","1"},
					{"rohi","tha","45"},
					{"bipin","cheif","70"}
							};
					return(data);	
				}
				else
				{
					Object[][] data=new Object[][]
							{
						{"sree","1"},
						{"kanthu","Software"}
							};
						return(data);
				}
	}
	
	@Test(priority=1,dataProvider="datamethod")
	public void testMethod1(int x, int y, int z)
	{
		int w=x+y+z;
		System.out.println(w);
	}
	
	@Test(priority=2,dataProvider="datamethod")
	public void testMethod2(String x, String y, String z)
	{
		String w=x+y+z;
		System.out.println(w);
	}
	
	
}
