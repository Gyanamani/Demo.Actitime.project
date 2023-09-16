package pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddnewPage {
	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement createnewcustomerlink;
	
	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement createnewprojectlink;
	
	public AddnewPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
	
		public void createnewcustomer()
		{
			 js=(JavascriptExecutor)driver;
			 wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			 
			 wait.until(ExpectedConditions.visibilityOf(createnewcustomerlink));
			 js.executeScript("arguments[0].click()",createnewcustomerlink);
			 
		}
		public void createnewproject()
		{
			 js=(JavascriptExecutor)driver;
			 wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			 
			 wait.until(ExpectedConditions.visibilityOf(createnewprojectlink));
			 js.executeScript("arguments[0].click()",createnewprojectlink); 
		}
	

}
