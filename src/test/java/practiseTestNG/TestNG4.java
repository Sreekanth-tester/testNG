package practiseTestNG;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//@DataProvider annotated provides data to @test annotated methods from .txt files


public class TestNG4 
{
	@DataProvider(name="datamethod")
	public Object[][] method1() throws Exception
	{
		Object[][] data=new Object[11][5];
		File f=new File("src/test/resources/textfiles/textfile1.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String line;
		int i=0;
		while((line=br.readLine())!=null)
		{
			String pieces[]=line.split(",");
			int j=0;
			for(String piece:pieces)
			{
				data[i][j]=piece;
				j++;
			}
			i++;
		}
		fr.close();
		br.close();
		return(data);
		
	}
	
	@Test(dataProvider="datamethod")
	public void testmethod1(String x, String y, String z, String p, String q)
	{
		String w=x+y+z+p+q;
		System.out.println(w);
	}
}
