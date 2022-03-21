package practiseTestNG;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG5 
{
	@DataProvider(name="datamethod")
	public Object[][] method1() throws Exception
	{
		File f=new File("src/test/resources/excelfiles/Excel.xls");
		FileInputStream fi=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet("Excel");
		int nour=sh.getPhysicalNumberOfRows();
		int nouc=sh.getRow(0).getLastCellNum();
		Object[][] data=new Object[nour-1][nouc];
		for(int i=1;i<nour;i++)
		{
			for(int j=0;j<nouc;j++)
			{
				try
				{
			DataFormatter df=new DataFormatter();       //it will read the data from excel as string values
			data[i-1][j]=df.formatCellValue(sh.getRow(i).getCell(j));
				}
				catch(Exception ex)
				{
					data[i-1][j]="";
				}
		   }
	   }
		
		fi.close();
		wb.close();
		return(data);
		
	}
	@Test(dataProvider="datamethod")
	public void testmethod(String x, String y, String z, String p, String q)
	{
		String w=x+y+z+p+q;
		System.out.println(w);
	}
}
