package practiseTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG14 
{
	
	public RemoteWebDriver driver;
	public ATUTestRecorder r;
	String vp;
	@BeforeClass
	public void method1() throws Exception
	{
		Date dt=new Date();
		SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
		vp="target\\"+"video"+"-"+sf.format(dt);
		 r=new ATUTestRecorder(vp,false);  //false means no audio
		r.start();

	}

	@Test(priority=1)
	public void openbrowser()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("abdulkalam",Keys.ENTER);
		driver.close();
		
	}
	@Test(priority=2)
	public void openbrowser1()
	{
		WebDriverManager.operadriver().setup();
		 driver=new OperaDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("stevejobs",Keys.ENTER);
		driver.close();
	}
	@AfterClass
	public void method() throws ATUTestRecorderException
	{
		r.stop();
	}

}
