package com.sauceddemo.testclass;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Screenshot_utility.Screenshotclass;
import com.sauceddemo.pomclass.HomepagePomclass;
import com.sauceddemo.pomclass.LoginPomclassmodel;

public class TextBase_Class
{
	   public WebDriver driver;
	  Logger Log = Logger.getLogger("MavenNewProject");
	   
       @Parameters("browserName")
	   @BeforeMethod
		public void setup(String browserName) throws IOException
		{
		   
		   if(browserName.equals("chrome"))
		   {
		   System.setProperty("webdriver.chrome.driver","./DriverFiles\\chromedriver.exe\\");
		   driver = new ChromeDriver();
		   }
		   
		   else
		   {
			   System.setProperty("webdriver.gecko.driver","./DriverFiles\\geckodriver.exe\\");
			   driver = new FirefoxDriver();
		   }
		   
  PropertyConfigurator.configure("Log4j.properties");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
		Log.info("login Page open");
		Screenshotclass.takescreenshot(driver);
					
				
			LoginPomclassmodel a = new LoginPomclassmodel(driver);
			
			a.sendUsername();		
			Log.info("username is enter");
			
			
			a.sendPassword();	
			Log.info("password is enter");
			
			
			a.clickOnLoginButton();
			Log.info("click on login button");
			Screenshotclass.takescreenshot(driver);
			
		}
		

		@AfterMethod
		public void aftermethod()
		{
			driver.quit();
		     Log.info("browser is closed");
		       
		     Log.info("end of Program");
			
		}
	   
//********************************************************	   
//	   
//	   @BeforeMethod
//		public void beforemethod()
//		{
//		   System.setProperty("webdriver.chrome.driver","D:\\rahul\\crombrowser\\chromedriver_win32\\chromedriver.exe\\");
//		
//		 driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://www.saucedemo.com/");
//		
//					
//				
//			LoginPomclassmodel a = new LoginPomclassmodel(driver);
//			
//			a.sendUsername();		
//			System.out.println("username input");
//			
//			
//			a.sendPassword();	
//			System.out.println("password input");
//			
//			
//			a.clickOnLoginButton();
//			System.out.println("click on loginbutton");
//		}
//		
//
//		@AfterMethod
//		public void aftermethod()
//		{
//			HomepagePomclass x = new HomepagePomclass(driver);
//			x.clickMenuButton();
//			x.clickLogOutButton();
//			driver.quit();
//		       System.out.println("browser is closed");
//		       
//		       System.out.println("end of Program");
//			
//		}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
//	**************************************************   
	   
	   
//	   
//	@BeforeClass
//	public void BeforeClass()
//	{
//System.setProperty("webdriver.chrome.driver","D:\\rahul\\crombrowser\\chromedriver_win32\\chromedriver.exe\\");
//		
//		 driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://www.saucedemo.com/");
//		
//	}
//	
//	
//	@BeforeMethod
//	public void beforemethod()
//	{
//				
//			
//		LoginPomclassmodel a = new LoginPomclassmodel(driver);
//		
//		a.sendUsername();		
//		System.out.println("username input");
//		
//		
//		a.sendPassword();	
//		System.out.println("password input");
//		
//		
//		a.clickOnLoginButton();
//		System.out.println("click on loginbutton");
//	}
//	
//
//	@AfterMethod
//	public void aftermethod()
//	{
//		HomepagePomclass x = new HomepagePomclass(driver);
//		x.clickMenuButton();
//		x.clickLogOutButton();
//		
//		
//	}
//	
//	@AfterClass
//	public void afterclass()
//	{
//		driver.quit();
//	       System.out.println("browser is closed");
//	       
//	       System.out.println("end of Program");
//	}
	
	
	

}
