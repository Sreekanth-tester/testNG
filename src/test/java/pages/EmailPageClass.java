package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class EmailPageClass 
{
	//elements as private properties
	RemoteWebDriver driver;
	FluentWait<RemoteWebDriver> wait;
	
	@FindBy(xpath="//input[@name='identifier']")
	private WebElement userid;
	
	@FindBy(xpath="//span[text()='Next']/parent::button")
	private WebElement clickuserid;
	
	@FindBy(xpath="//input[@name='identifier']")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Next']/parent::button")
	private WebElement clickpassword;
	
	@FindBys 
	({ 
		@FindBy(xpath="(//table[@role='grid'])[2]/tbody/tr")
	})
	private List<WebElement> mails;
	
	

	
	//constructor method
	public EmailPageClass(RemoteWebDriver driver)
	{
		this.wait=wait;
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//operational and observational methods
	


	

	public void filluserid(String value)
	{
		wait.until(ExpectedConditions.visibilityOf(userid));
		userid.sendKeys(value);
	}
	
	public void clickuserid()
	{
		wait.until(ExpectedConditions.visibilityOf(clickuserid));
		clickuserid.click();
	}
	
	public void fillpassword(String value)
	{
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys(value);
	}
	
	public void clickpassword()
	{
		wait.until(ExpectedConditions.visibilityOf(clickpassword));
		clickpassword.click();
	}
	
	public int getnumberofmails()
	{
		
		int numberofmails=mails.size();
		return(numberofmails);
				
	}
}

