package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pom.ActitimeHomePage;
import pom.ActitimeLeaveTypePage;
import pom.ActitimeLoginPage;
import pom.ActitimeSetting;
import pom.CreateNewLeavetypePage;


public class Actitimesetting {
	public static void main(String[] args ) throws InterruptedException{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().window().minimize();
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
	 login.loginMethod();
	 ActitimeHomePage home=new ActitimeHomePage(driver);
	 home.settings();
	 ActitimeSetting setting=new ActitimeSetting(driver);
	 setting.typesofwork();
		/*
		 * ActitimeTypesOfWorkPage typesofworkpage=new ActitimeTypesOfWorkPage(driver);
		 * typesofworkpage.createtypeofwork(); ActitimeCreateNewTypeofWorkPage
		 * newtypeofworkpage=new ActitimeCreateNewTypeofWorkPage(driver);
		 * newtypeofworkpage.name(); newtypeofworkpage.createtypeofwork();
		 * 
		 * ActitimeTypesOfWorkPage typesofworkpage1=new ActitimeTypesOfWorkPage(driver);
		 * 
		 * typesofworkpage1.delete();
		 */
		

	}

}
