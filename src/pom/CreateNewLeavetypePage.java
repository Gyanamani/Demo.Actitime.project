package pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewLeavetypePage {
	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	
	@FindBy(xpath="//input[@placeholder='Leave Type Name']")
	 private WebElement leavetypenametextfield;
	
	@FindBy(xpath="(//span[.='Create Leave Type'])[2]")
	private WebElement createleavetypebutton;
	
	public CreateNewLeavetypePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void leavetypename()
	{
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(leavetypenametextfield));
		js.executeScript("arguments[0].click()",leavetypenametextfield);
		leavetypenametextfield.sendKeys("mani");
	}
	public void createleavetype()
	{
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(createleavetypebutton));
		js.executeScript("arguments[0].click()",createleavetypebutton);		
	}
	
	
	

}
