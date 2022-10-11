package com.sauceddemo.testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceddemo.pomclass.CheckOut_POMClass;
import com.sauceddemo.pomclass.HomepagePomclass;
import com.sauceddemo.pomclass.LoginPomclassmodel;

public class TC_05_Verify_ChekOut_Functionality
{
	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","D:\\rahul\\crombrowser\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
		
		LoginPomclassmodel a = new LoginPomclassmodel(driver);
		
		a.sendUsername();		
		System.out.println("username input");
		
		
		a.sendPassword();	
		System.out.println("password input");
		
		
		a.clickOnLoginButton();
		System.out.println("click on loginbutton");	
		
		HomepagePomclass hp = new HomepagePomclass(driver);
		
		hp.clickbagButton();
		System.out.println("products selected");
		
		
		CheckOut_POMClass ch = new CheckOut_POMClass(driver);
		ch.clickonaddtocartButton();
		ch.clickoncheckout();
		ch.sendfirstname();
		ch.sendlastname();
		ch.sendpostalcode();
		ch.clickoncontinuebutton();
		ch.clickonfinishbutton();
		
		
		System.out.println("tc pass");
		
	}
	

}
