	
	package pom;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class ActitimeLoginPage
	{
		public WebDriver driver;
			
		@FindBy(id = "username")
		private WebElement usernameTextfield;
		
		@FindBy(name = "pwd")
		private WebElement passwordTextfield;
		
		@FindBy(id = "keepLoggedInCheckBox")
		private WebElement keepmeloggedinCheckbox;
		
		@FindBy(id = "loginButton")
		private WebElement loginButton;
		
		@FindBy(id = "toPasswordRecoveryPageLink")
		private WebElement forgotyourpasswordLink;
		
		@FindBy(xpath = "//a[.='actiTIME Inc.']")
		private WebElement actitimeincLink;
		
		public ActitimeLoginPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void loginMethod() throws InterruptedException
		{
			usernameTextfield.sendKeys("admin");
			passwordTextfield.sendKeys("manager");
			keepmeloggedinCheckbox.click();
			loginButton.click();
			Thread.sleep(3000);
		}
		
		public void validateTitleMethod()
		{
			String actualTitle=driver.getTitle();
			if(actualTitle.contains("Enter"))
			{
				System.out.println("navigated to home page");
			}
		}
		
		public void forgotpasswordMethod()
		{
			
			forgotyourpasswordLink.click();
		}
		
		public void actitimeincMethod()
		{
			actitimeincLink.click();
		}	
	}

