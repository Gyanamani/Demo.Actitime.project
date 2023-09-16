
	package pom;

	import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



	public class ActitimeHomePage 
	{
			
		public WebDriver driver;
		WebDriverWait wait;
		JavascriptExecutor js;
		//declaration
		@FindBy(xpath="//div[@class='logoSwitcherText']")
		private WebElement switchtoactiplanstext;
		
		@FindBy(id="container_tt")
		private	WebElement entertimetrackcontent;
		
		@FindBy(id="container_tasks")
		private WebElement viewtimetrackcontent;
		
		@FindBy(id="container_reports")
		private WebElement locktimetrackcontent;
		
		@FindBy(id="container_users")
		private WebElement approvetimetrackcontent;
		
		@FindBy(xpath="(//div[@class='menu_icon'])[1]")
		private WebElement calendersicon;
		
		@FindBy(xpath="(//div[@class='menu_icon'])[2]")
		private WebElement settingsicon;
		
		@FindBy(xpath="(//div[@class='menu_icon'])[3]")
		private WebElement integrationsicon;
		
		@FindBy(xpath="(//div[@class='menu_icon'])[4]")
		private WebElement helpandsupportsicon;
		
		@FindBy(xpath="(//div[@class='popup_menu_icon'])[5]")
		private WebElement popupmenuicon;
		
		@FindBy(xpath="//a[@class='userProfileLink username ']")
		private WebElement userprofilelink;
		
		@FindBy(id = "logoutLink")
		private WebElement logoutLink;
		
		

		
		public ActitimeHomePage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public void switchtoactiplans()
		{
			js=(JavascriptExecutor)driver;
			wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(switchtoactiplanstext));
			js.executeScript("arguments[0].click()",switchtoactiplanstext);	
		}
		public void entertimetrack()
		{
			js=(JavascriptExecutor)driver;
			wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf( entertimetrackcontent));
			js.executeScript("arguments[0].click()", entertimetrackcontent);
	
		}
		public void viewtimetrack()
		{
			js=(JavascriptExecutor)driver;
			wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf( viewtimetrackcontent));
			js.executeScript("arguments[0].click()",viewtimetrackcontent);
	
		}
		public void locktimetrack()
		{
			js=(JavascriptExecutor)driver;
			wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(locktimetrackcontent));
			js.executeScript("arguments[0].click()",locktimetrackcontent);
			
		}
		public void  approvetimetrack()
		{
			js=(JavascriptExecutor)driver;
			wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(approvetimetrackcontent));
			js.executeScript("arguments[0].click()",approvetimetrackcontent);
		}
		public void calenders()
		{
			js=(JavascriptExecutor)driver;
			wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(calendersicon));
			js.executeScript("arguments[0].click()",calendersicon);
		}
		
		public void settings()
		{
			js=(JavascriptExecutor)driver;
			wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(settingsicon));
			js.executeScript("arguments[0].click()",settingsicon);
		}
		public void integrations()
		{
			js=(JavascriptExecutor)driver;
			wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(integrationsicon));
			js.executeScript("arguments[0].click()",integrationsicon);
		}
		public void helpandsupports()
		{
			js=(JavascriptExecutor)driver;
			wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(helpandsupportsicon));
			js.executeScript("arguments[0].click()",helpandsupportsicon);
		}
		public void popupmenu()
		{
			js=(JavascriptExecutor)driver;
			wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(popupmenuicon));
			js.executeScript("arguments[0].click()",popupmenuicon);
		}
		public void userprofilele()
		{
			js=(JavascriptExecutor)driver;
			wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(userprofilelink));
			js.executeScript("arguments[0].click()",userprofilelink);
		}
		public void logout()
		{
			js=(JavascriptExecutor)driver;
			wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(logoutLink));
			js.executeScript("arguments[0].click()",logoutLink);
		}
	
		
	
		
		
	
		
	}

