package pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeCreateNewTypeofWorkPage {
	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;

@FindBy(xpath="//input[@name='name']")
private WebElement nametextfield;

@FindBy(xpath="//input[@value='   Create Type of Work   ']")
private WebElement createtypeofworkbutton;

@FindBy(xpath="//input[@value='      Cancel      ']")
private WebElement cancelbutton;

public ActitimeCreateNewTypeofWorkPage(WebDriver driver )
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void name()
{
	js=(JavascriptExecutor)driver;
	wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(nametextfield));
	js.executeScript("arguments[0].click()",nametextfield);
	nametextfield.sendKeys("qsp");
}
public void createtypeofwork()
{
	js=(JavascriptExecutor)driver;
	wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(createtypeofworkbutton));
	js.executeScript("arguments[0].click()",createtypeofworkbutton);
}
public void cancel()
{
	js=(JavascriptExecutor)driver;
	wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(cancelbutton));
	js.executeScript("arguments[0].click()", cancelbutton);
	
			
}

	
}
