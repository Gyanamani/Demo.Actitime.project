package pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeTypesOfWorkPage {
	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement createtypeofworkbutton;
	
	@FindBy(xpath="//input[@value='Show Types of Work']")
	private WebElement showtypeofworkbutton;
	
	@FindBy(xpath="//a[.='qsp']/../..//a[contains(text(),'delete')]")
	private WebElement deletelink;
	
	public ActitimeTypesOfWorkPage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	public void createtypeofwork()
	{
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(createtypeofworkbutton));
		js.executeScript("arguments[0].click()",createtypeofworkbutton);	
	}
	public void showtypeofwork()
	{
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(showtypeofworkbutton));
		js.executeScript("arguments[0].click()",showtypeofworkbutton);	
	}
	public void delete()
	{
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(deletelink));
		js.executeScript("arguments[0].click()",deletelink);
		driver.switchTo().alert().accept();
	}

	

	

}
