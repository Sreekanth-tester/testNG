
package utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebsiteUtilitiesClass 
{
 public RemoteWebDriver openBrowser(String browsername)
 {
	 RemoteWebDriver driver;
	 if(browsername.equalsIgnoreCase("chrome"))
	 {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	 }
	 else if(browsername.equalsIgnoreCase("opera"))
	 {
		 WebDriverManager.operadriver().setup();
		 driver=new OperaDriver();
	 }
	 else if(browsername.equalsIgnoreCase("edge"))
	 {
		 WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
	 }
	 else
	 {
		 WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
	 }
	 return(driver);
 }
 
 public FluentWait<RemoteWebDriver> waits(RemoteWebDriver driver) throws Exception
 {
	 String temp1=PropertisfileUtility.getValueInPropertiesFile("maxwait");
		int value1=Integer.parseInt(temp1);
		String temp2=PropertisfileUtility.getValueInPropertiesFile("interval");
		int value2=Integer.parseInt(temp2);
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(value1));
		wait.pollingEvery(Duration.ofMillis(value2));
		return (wait);
		
 }
 
 public void launchSite(RemoteWebDriver driver, String url, long wait) throws Exception
 {
	 String temp=PropertisfileUtility.getValueInPropertiesFile("url");
	 driver.get(temp);
	 driver.manage().window().minimize();
 }
 
 public String elementScreenshot(RemoteWebDriver driver) throws Exception
 {
	 SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
	 Date dt=new Date();
	 File src=driver.getScreenshotAs(OutputType.FILE);
	 String fn=System.getProperty("user.dir")+"\\target\\"+sdf.format(dt)+".png";
	 File dst=new File("/target"+"element screeshot.png");
	 FileHandler.copy(src, dst);
	 return(dst.getAbsolutePath());
	 
 }

}
