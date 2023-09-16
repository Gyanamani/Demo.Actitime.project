package pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeSetting {
	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	
	
	//@FindBy(xpath="//div[@class='menu_icon'])[2]")
	//private WebElement settingsicon;
	
	@FindBy(xpath="//div[.='Turn Features On / Off']")
	private WebElement turnfeaturesonofftitle;
	
	@FindBy(xpath="//div[.='Manage system settings & configure actiTIME']")
	private WebElement generalsettinglink;
	
	@FindBy(xpath="//a[.='Workflow Settings']")
	private WebElement workflowsettinglink;
	
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typesofworklink;
	
	@FindBy(xpath="//a[.='Leave Types']")
	private WebElement leavetypeslink;
	
	@FindBy(xpath="Notifications")
	private WebElement notificationslink;
	
	@FindBy(xpath="//a[.='Logo Settings']")
	private WebElement logosettingslink;
	
	@FindBy(xpath="//div[.='Licenses']")
	private WebElement licenseslink;
	
	public ActitimeSetting (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void turnfeaturesonoff()
	{
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(turnfeaturesonofftitle));
		js.executeScript("arguments[0].click()",turnfeaturesonofftitle);
	}
	public void generalsetting()
	{
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(generalsettinglink));
		js.executeScript("arguments[0].click()",generalsettinglink);
	}
	public void workflowsetting()
	{
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(workflowsettinglink));
		js.executeScript("arguments[0].click()",workflowsettinglink);
	}
	public void typesofwork()
	{
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(typesofworklink));
		js.executeScript("arguments[0].click()",typesofworklink);
	}
	public void leavetypes()
	{
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(leavetypeslink));
		js.executeScript("arguments[0].click()",leavetypeslink);
	}
	public void notifications()
	{
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(notificationslink));
		js.executeScript("arguments[0].click()",notificationslink);
	}
	public void logosettings()
	{
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(logosettingslink));
		js.executeScript("arguments[0].click()",logosettingslink);
	}
	public void licenses()
	{
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(licenseslink));
		js.executeScript("arguments[0].click()",licenseslink);
	}

	


	

	

	


	
	
	
	
	
	
	

}
