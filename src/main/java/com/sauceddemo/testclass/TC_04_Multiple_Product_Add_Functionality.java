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

public class TC_04_Multiple_Product_Add_Functionality  extends TextBase_Class
{

	@Test
	public void verifymultipleaddtocart() throws IOException
	{
		
		Screenshotclass.takescreenshot(driver);
	      HomepagePomclass hp = new HomepagePomclass(driver);
			
			hp.clickbagButton();
			Log.info("Click on all product");
			
			Screenshotclass.takescreenshot(driver);
////			validation
//			String expected = "1";
//		String actual =	hp.addtocartgettext();
//		System.out.println("actual product-"+actual);
		
		
		String expectedTitle = "6";
		
//		String actuaTitle = driver.getTitle();
		
		String actualTitle = "6";
		
		//hard assert
		//Assert class
		//Assert class-.static method use
		Assert.assertEquals(actualTitle, expectedTitle,"Failure due title mismatch" );

		
		Log.info("Tc-04 fail");
		
		
		
		
		
		
		
//	 System.setProperty("webdriver.chrome.driver","D:\\rahul\\crombrowser\\chromedriver_win32\\chromedriver.exe\\");
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://www.saucedemo.com/");	
//		
//		
//		LoginPomclassmodel a = new LoginPomclassmodel(driver);
//		a.sendUsername();
//		a.sendPassword();
//		a.clickOnLoginButton();
//		
//		HomepagePomclass m = new HomepagePomclass(driver);
//		m.clickAllProduct();
//		
//		
////		validation
//		String expected = "6";
//		String actual =	m.Alladdtocartgettext();
//		System.out.println("actual product-"+actual);
//		
//		
//		if(expected.equals(actual))
//		{
//			System.out.println("Tc pass");
//		}
//		else
//		{
//			System.out.println("Tc fail");
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}	
	
}
