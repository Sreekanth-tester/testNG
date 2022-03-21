package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class LoginTestPage
{
	//elements locators as private properties
	private RemoteWebDriver driver;
	private FluentWait<RemoteWebDriver> wait;
	
	@FindBy(xpath="")
	private WebElement userid;
	
	@FindBy(xpath="")
	private WebElement password;
	
	@FindBy(xpath="")
	private WebElement login;
	
	//constructor method
	public LoginTestPage(RemoteWebDriver driver)
	{
		this.driver=driver;
		this.wait=wait;
		PageFactory.initElements(driver,this);
	}
	
	//operational methods and observational methods
	
	public void fillUserid(String value)
	{
	     wait.until(ExpectedConditions.visibilityOf(userid)).sendKeys(value);
	}
	
	public void fillPassword(String value)
	{
	     wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(value);
	}
	
	public void clickLogin()
	{
		wait.until(ExpectedConditions.elementToBeClickable(login)).click();
	}
	
	
}
