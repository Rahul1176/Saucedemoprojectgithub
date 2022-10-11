package com.sauceddemo.testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauceddemo.pomclass.HomepagePomclass;
import com.sauceddemo.pomclass.LoginPomclassmodel;

public class TC_06_verify_Product_Fillter_functionality {

	@Test
	public void verifyfillter()
	{

	 System.setProperty("webdriver.chrome.driver","D:\\rahul\\crombrowser\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");	
		
		
		LoginPomclassmodel a = new LoginPomclassmodel(driver);
		a.sendUsername();
		a.sendPassword();
		a.clickOnLoginButton();

		HomepagePomclass F = new HomepagePomclass(driver);
	
    F.clickDropDownFilter();
	
	
	
	
	
	
	
	
	
  //div[text()='7.99']
	
	
	
	
	
	
}	
}
