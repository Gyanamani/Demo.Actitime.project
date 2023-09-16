package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ActitimeHomePage;
import pom.ActitimeLeaveTypePage;
import pom.ActitimeLoginPage;
import pom.ActitimeSetting;
import pom.CreateNewLeavetypePage;

public class createleavetypetest {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().window().minimize();
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
	 login.loginMethod();
	 ActitimeHomePage home=new ActitimeHomePage(driver);
	 home.settings();
	 ActitimeSetting setting=new ActitimeSetting(driver);
	// setting.typesofwork();
	 setting.leavetypes();
	 ActitimeLeaveTypePage typepage=new ActitimeLeaveTypePage(driver);
	typepage.createleavetype();
	CreateNewLeavetypePage leavetypePage=new  CreateNewLeavetypePage(driver);
	leavetypePage.leavetypename();
	leavetypePage.createleavetype();
	ActitimeLeaveTypePage typepage1=new ActitimeLeaveTypePage(driver);
	typepage1.deletecell();
		
			

	}

}
