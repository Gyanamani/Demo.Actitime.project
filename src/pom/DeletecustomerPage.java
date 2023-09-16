package pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeletecustomerPage {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	
	@FindBy(xpath="(//div[@class='actionButton'])[7]")
	private WebElement deleteactionButton;
	
	
	@FindBy(xpath="(//div[.='Delete'])[2]")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//span[.='Delete permanently']")
	private WebElement deletepermanentlybutton;
	
	public DeletecustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void deleteaction()
	{
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(deleteactionButton));
		js.executeScript("arguments[0].click()",deleteactionButton);
	}
	public void delete()
	{
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(deleteButton));
		js.executeScript("arguments[0].click()",deleteButton);
	}
	
	public void deletepermanently()
	{
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(deletepermanentlybutton));
		js.executeScript("arguments[0].click()",deletepermanentlybutton);
	}
	
	
	
	
	
	

}
