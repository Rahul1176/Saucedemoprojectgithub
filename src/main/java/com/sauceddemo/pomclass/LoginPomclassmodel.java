package com.sauceddemo.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomclassmodel 
{

    //POM Class steps
	//1.WebDriver driver declare
	//2.ele find by @FindBy Annotation
	//3.created a method to perform a action on element
	//4.Constructor create

	//1.driver declared
		WebDriver driver;
		
		//2.element find
		@FindBy(xpath = "//input[@id='user-name']")
		WebElement username;
		
		//3.create a method as per action on ele
		//and add action in that method
		
		public void sendUsername()
		{
			username.sendKeys("standard_user");
			System.out.println("username enter");
		}
		
		//2.
		@FindBy(xpath = "//input[@id='password']")
		WebElement password;
		
		//3
		public void sendPassword()
		{
			password.sendKeys("secret_sauce");
			System.out.println("password enter");
		}
		
		//2.
		@FindBy(xpath = "//input[@id='login-button']")
		WebElement loginButton;
		
		//3.
		public void clickOnLoginButton()
		{
			loginButton.click();
			System.out.println("log in successfully");
		}
		
		//4.create a constructor
		public LoginPomclassmodel(WebDriver driver)
		{
			//global       local
			this.driver = driver;
			
			//sele class
			PageFactory.initElements(driver, this);
			
		}
		
}	
		
		
		
	//---------------	
//		int a;   //a var declare
	//	
//		//4.create a constructor
//		public LoginPOMClass(int a)
//		{
////			a = x;         //possible
////			this.a = a;    //possible
//			
//		}
	//-----------------



