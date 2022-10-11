package com.sauceddemo.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut_POMClass
{
	WebDriver driver;
	
	
	public CheckOut_POMClass(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//span[text()='1']")
	WebElement addtocartButton;
	public void clickonaddtocartButton()
	{
		addtocartButton.click();
	}
	
	
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement Checkout;
	public void clickoncheckout()
	{
		Checkout.click();
	}
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement firstname;
	public void sendfirstname()
	{
		firstname.sendKeys("RAHUL");
	}
	
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement lastname;
	public void sendlastname()
	{
		lastname.sendKeys("BARAPATRE");
	}
	
	
	@FindBy(xpath="//input[@id='postal-code']")
	WebElement postalcode;
	public void sendpostalcode()
	{
		postalcode.sendKeys("480108");
	}
	
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continuebutton;
	public void clickoncontinuebutton()
	{
		continuebutton.click();
	}
	
	@FindBy(xpath="//button[@id='finish']")
	WebElement finishbutton;
	public void clickonfinishbutton()
	{
		finishbutton.click();
	}
	
	
	
//	for validationm--//button[@id='back-to-products']
	

}
