package practiseTestNG;

//@DataProvider annotatde method provides data to @Test annotated methods in another class also



import org.testng.annotations.Test;

public class TestNG3 
{
 @Test(priority=1,dataProvider="datamethod",dataProviderClass= TestNG2.class)
 public void testmethod3(String x, String y)
 {
	 String z=x+y;
	 System.out.println(z);
	 
 }

}
