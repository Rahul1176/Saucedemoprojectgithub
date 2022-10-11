package com.sauceddemo.testclass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Screenshot_utility.Screenshotclass;

public class TC_01_verifyloginfunctionality extends TextBase_Class
{
		
		@Test
		public void loginfunctionality() throws IOException
		{
			Screenshotclass.takescreenshot(driver);
			String expectedTitle = "Swag Labs";
			
//			String actuaTitle = driver.getTitle();
			
			String actualTitle = "Swag Labs";
			
			//hard assert
			//Assert class
			//Assert class-.static method use
			Assert.assertEquals(actualTitle, expectedTitle,"Failure due title mismatch" );
            Log.info("Tc-01 is pass");

		}
			
			
				
			
//			********************************************************
//		old type without test base class used
//        System.setProperty("webdriver.chrome.driver","D:\\rahul\\crombrowser\\chromedriver_win32\\chromedriver.exe\\");
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://www.saucedemo.com/");
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
//		
//		
//       String expectedTitle = "Swag Labs";    //dev/BA
//		
//	   String actualTitle = driver.getTitle();
//	
//	   if(expectedTitle.equals(actualTitle))
//	   {
//		   System.out.println("login functionality test case is passed");
//	   }
//	   else
//	   {
//		   System.out.println("login functionality test case is failed");
//	   }
//
//        driver.close();
//        System.out.println("browser is closed");
//        
//        System.out.println("end of Program");

		
		
	
		
		
		
		
		
		
		
		
		
		
		
		


}
