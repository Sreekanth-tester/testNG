package practiseTestNG;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class TestNG15PageClass
{

		//elements as private properties
		private RemoteWebDriver driver;
		@FindBy(xpath="//input[@formcontrolname='username']")
		private WebElement userid;
		
		@FindBy(xpath="//input[@formcontrolname='password']")
		private WebElement password;
		
		@FindBy(xpath="//span[text()=' LOGIN ']")
		private WebElement login;
		
		//constructor method
		public TestNG15PageClass(RemoteWebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
		//operational and observational methods
		public void login(String value)
		{
			driver.manage().window().maximize();
			userid.sendKeys("sambasiva",Keys.ENTER);
		}
		
		public void password(String value)
		{
			password.sendKeys("Samba@18688142",Keys.ENTER);
		}
		public void login()
		{
			login.click();
		}
		
		
		
		
		
		
		
		
	}

