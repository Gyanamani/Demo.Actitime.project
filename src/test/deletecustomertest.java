package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;
import pom.ActitimeTaskPage;
import pom.DeletecustomerPage;

public class deletecustomertest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
	 login.loginMethod();
	 ActitimeHomePage home=new ActitimeHomePage(driver);
	 home.viewtimetrack();
	 ActitimeTaskPage page=new ActitimeTaskPage(driver);
	 page.settingedit();
	 
	 DeletecustomerPage cPage=new DeletecustomerPage(driver);
	
	 cPage.deleteaction();
	 cPage.delete();
	 cPage.deletepermanently();
	 
	 
	

	}

}
