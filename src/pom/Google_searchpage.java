package pom;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_searchpage
{
	@FindBy(id="APjFqb")
	private WebElement searchTextfield;
	
	@FindBy(xpath="//span[contains(text(),'selenium')]")
	private List<WebElement>allSuggestions;
	
	public Google_searchpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	public void searchMethod() throws InterruptedException
	{
		searchTextfield.sendKeys("selenium");
		Thread.sleep(2000);
	}
	public void selectSuggestionMethod()
	{
		for (int i = 0; i <allSuggestions.size() ; i++)
		{
			if (allSuggestions.get(i).getText().equals("selenium webdriver"))
			{
				allSuggestions.get(i).click();
				break;
				
			}
			
		} 
	}
	
	

}
