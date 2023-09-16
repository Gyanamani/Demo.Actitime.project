package pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ActitimeTaskPage {

	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	@FindBy(xpath="//div[.='Add New']")
    private	WebElement Addnewbutton;
	
	@FindBy(xpath="(//div[@class='editButton'])[10]")
	private WebElement settingeditbutton;
	
	public ActitimeTaskPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void Addnewmethod()
	{
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(Addnewbutton));
		js.executeScript("arguments[0].click()", Addnewbutton);			
	}
	public void settingedit()
	{
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(settingeditbutton));
		js.executeScript("arguments[0].click()", settingeditbutton);		
	}
	
	
	
	
	
}
