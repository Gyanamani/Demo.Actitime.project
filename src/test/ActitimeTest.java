
		package test;

		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import pom.ActitimeHomePage;
		import pom.ActitimeLoginPage;

import pom.ActitimeTaskPage;
import pom.AddnewPage;

		public class ActitimeTest 
		{
			public static void main(String[] args) throws Throwable
			{
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demo.actitime.com");
				
				
				 ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
				 loginPage.loginMethod();
				//loginPage.validateTitleMethod();
				 
				// * ActitimeHomePage homePage=new ActitimeHomePage(driver);
				// * homePage.logoutMethod();
			//	 */
				ActitimeHomePage homepage=new  ActitimeHomePage(driver) ;
				//homepage.switchtoactiplans();
				//homepage.userprofilele();
				//homepage.settings();
				homepage.viewtimetrack();
				ActitimeTaskPage taskpage=new ActitimeTaskPage(driver);
				taskpage.Addnewmethod();
				AddnewPage page=new AddnewPage(driver);
				page.createnewcustomer();
				
				
			
					
				
			
			}
		}
	


