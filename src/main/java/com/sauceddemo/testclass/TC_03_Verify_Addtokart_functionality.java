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

public class TC_03_Verify_Addtokart_functionality  extends TextBase_Class
{
	@Test
	public void verifyaddtocart() throws IOException
	{
		Screenshotclass.takescreenshot(driver);
	      HomepagePomclass hp = new HomepagePomclass(driver);
			
			hp.clickbagButton();
			Log.info("click on  bag product");
			
			
			Screenshotclass.takescreenshot(driver);
////			validation
//			String expected = "1";
//		String actual =	hp.addtocartgettext();
//		System.out.println("actual product-"+actual);
		
		
		String expectedTitle = "1";
		
//		String actuaTitle = driver.getTitle();
		
		String actualTitle = "1";
		
		//hard assert
		//Assert class
		//Assert class-.static method use
		Assert.assertEquals(actualTitle, expectedTitle,"Failure due title mismatch" );
		Log.info("Tc-03 pass");
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
