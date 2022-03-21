package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertisfileUtility 
{

	

		public static String getValueInPropertiesFile(String propertyname) throws Exception
		{
			//Every project is having only one "config.properties" file by default
			String pfpath=System.getProperty("user.dir")
										+"src\\test\\resources\\datafiles\\file1.propertiesfile";
			//Access "config.properties" file, which consists of common data or setup data
			FileInputStream fi=new FileInputStream(pfpath);
			Properties p=new Properties();
			p.load(fi);
			String value=p.getProperty(propertyname);
			fi.close();
			return(value);
	

	}

}
