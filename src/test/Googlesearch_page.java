package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Google_searchpage;

public class Googlesearch_page {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		Google_searchpage search=new Google_searchpage(driver);
				search.searchMethod();
				search.selectSuggestionMethod();
				
		
	}

}
