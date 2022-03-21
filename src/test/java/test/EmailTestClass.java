package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.EmailPageClass;

public class EmailTestClass 
{
	RemoteWebDriver driver;
	EmailPageClass pobj;
	
	
	@Test( priority=1, description="open browser")
	public void openBrowser( )
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
	}
	
	@Test( priority=2)
	public void launchSite()
	{
		driver.get("https://www.gmail.com");
		
	}
	
	
	@Test( priority=3,  description="login")
	public void login()
	{
		pobj.filluserid("srikanthdevella2020@gmail.com");
		pobj.clickuserid();
		pobj.fillpassword("Srikanthdevella@2020");
		pobj.clickpassword();
		
	}
	
	@Test( priority=4,  description="getting number of mails")
	public void noMails()
	{
		pobj.getnumberofmails();
	}
	
}
