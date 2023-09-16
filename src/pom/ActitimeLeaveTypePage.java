package pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLeaveTypePage {
	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	@FindBy(xpath="//span[.='Create Leave Type']")
	private WebElement createleavetypebutton;
	
	@FindBy(xpath="//span[.='mani']/../../../../../..//td[contains(@class,'leaveTypeDeleteCell last')]")
	WebElement deletecellicon;
	
	public ActitimeLeaveTypePage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void createleavetype()
	{
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(createleavetypebutton));
		js.executeScript("arguments[0].click()",createleavetypebutton);	
	
	}
	public void deletecell()
	{
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(deletecellicon));
		js.executeScript("arguments[0].click()",deletecellicon);
	    driver.switchTo().alert().accept();
	
	}

}
