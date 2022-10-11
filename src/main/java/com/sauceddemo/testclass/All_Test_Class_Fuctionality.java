package com.sauceddemo.testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauceddemo.pomclass.HomepagePomclass;
import com.sauceddemo.pomclass.LoginPomclassmodel;

public class All_Test_Class_Fuctionality extends TextBase_Class
{
	
	@Test
	public void loginfunctionality()
	{
      String expectedTitle = "Swag Labs";    //dev/BA
		
	   String actualTitle = driver.getTitle();
	
	   if(expectedTitle.equals(actualTitle))
	   {
		   System.out.println("login functionality test case is passed");
	   }
	   else
	   {
		   System.out.println("login functionality test case is failed");
	   }	
	   
	 }
	   
	@Test
	public void verifylogout()
	{
//		with testbase class	
		
		System.out.println("apply the validation");
		
		   String expectedTitle = "Swag Labs";    //dev/BA
			
		   String actualTitle = driver.getTitle();
		
		   if(expectedTitle.equals(actualTitle))
		   {
			   System.out.println("logOut functionality test case is passed");
		   }
		   else
		   {
			   System.out.println("logOut functionality test case is failed");
		   }	  
	   
	}
	   
	@Test
	public void verifyaddtocart()
	{    
	       HomepagePomclass hp = new HomepagePomclass(driver);
	        hp.clickbagButton();
			System.out.println("products selected");
			
			
//			validation
			String expected = "1";
		String actual =	hp.addtocartgettext();
		System.out.println("actual product-"+actual);
		
		
		if(expected.equals(actual))
		{
			System.out.println("Tc pass");
		}
		else
		{
			System.out.println("Tc fail");
		}
	}
	   
	   
	@Test
	public void verifymultipleaddtocart()
	{
	    HomepagePomclass m = new HomepagePomclass(driver);
		m.clickAllProduct();
		
		
//		validation
		String expected = "6";
		String actual =	m.Alladdtocartgettext();
		System.out.println("actual product-"+actual);
		
		
		if(expected.equals(actual))
		{
			System.out.println("Tc pass");
		}
		else
		{
			System.out.println("Tc fail");
		}   
	}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
