package pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CreateNewCustomerPage {

	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement Entercustomernametextfield;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement entercustomerdescriptiontextfield;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcustomerbutton;
	
	public CreateNewCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void Entercustomername()
	{
		 js=(JavascriptExecutor)driver;
		 wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		 
		 wait.until(ExpectedConditions.visibilityOf(Entercustomernametextfield));
		 js.executeScript("arguments[0].click()",Entercustomernametextfield);
		 Entercustomernametextfield.sendKeys("jsp");
	}
	public void entercustomerdescription()
	{
		 js=(JavascriptExecutor)driver;
		 wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.visibilityOf(entercustomerdescriptiontextfield));
		 js.executeScript("arguments[0].click()",entercustomerdescriptiontextfield);		 
	}
	public void createcustomer()
	{
		 js=(JavascriptExecutor)driver;
		 wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.visibilityOf(createcustomerbutton));
		 js.executeScript("arguments[0].click()",createcustomerbutton);		 
	}
	
	
	
	
	
	
	

}
