package test;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.EmailPageClass;

public class MainClass 
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofMinutes(20));
		wait.pollingEvery(Duration.ofMillis(500));
		driver.get("https://www.gmail.com");
		EmailPageClass pobj=new EmailPageClass(driver);
		pobj.filluserid("srikanthdevella2020@gmail.com");
		pobj.clickuserid();
		pobj.fillpassword("Srikanthdevella@2020");
		pobj.clickpassword();
		System.out.println(pobj.getnumberofmails());
		
		

	}

}
