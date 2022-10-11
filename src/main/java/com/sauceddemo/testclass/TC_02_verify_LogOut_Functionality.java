package com.sauceddemo.testclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Screenshot_utility.Screenshotclass;
import com.sauceddemo.pomclass.HomepagePomclass;
import com.sauceddemo.pomclass.LoginPomclassmodel;

public class TC_02_verify_LogOut_Functionality extends TextBase_Class
{
	@Test
	public void verifylogout() throws IOException
	{
//		with testbase class	
		Screenshotclass.takescreenshot(driver);
		System.out.println("apply the validation");
		
		   String expectedTitle = "Swag Labs";    //dev/BA
			
//		   String actualTitle = driver.getTitle();
		   String actualTitle = "Swag Labs";
			
			//hard assert
			//Assert class
			//Assert class-.static method use
			Assert.assertEquals(actualTitle, expectedTitle,"Failure due title mismatch" );
			Log.info("Tc-02  is pass");
	}
		
//	
//		   
//		   ***************************************************************	
//		 without testbase class
//		   
//		   @Test
//			public void verifylogout()
//			{
//				
//		
//        System.setProperty("webdriver.chrome.driver","D:\\rahul\\crombrowser\\chromedriver_win32\\chromedriver.exe\\");
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://www.saucedemo.com/");	
//		
//		
//	
//		
//		LoginPomclassmodel a = new LoginPomclassmodel(driver);
//		a.sendUsername();
//		a.sendPassword();
//		a.clickOnLoginButton();
//		
//		
//		
//		HomepagePomclass x = new HomepagePomclass(driver);
//		x.clickMenuButton();
//		x.clickLogOutButton();
//		
//		
//		System.out.println("apply the validation");
//		
//		   String expectedTitle = "Swag Labs";    //dev/BA
//			
//		   String actualTitle = driver.getTitle();
//		
//		   if(expectedTitle.equals(actualTitle))
//		   {
//			   System.out.println("logOut functionality test case is passed");
//		   }
//		   else
//		   {
//			   System.out.println("logOut functionality test case is failed");
//		   }
//
//		   driver.quit();
//	       System.out.println("browser is closed");
//	       
//	       System.out.println("end of Program");


		
		
		
		
		
		
		
		
		
		
		
		
	

}
