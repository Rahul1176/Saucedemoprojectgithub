package com.sauceddemo.pomclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomepagePomclass 
{

    //POM Class steps
	//1.WebDriver driver declare
	//2.ele find by @FindBy Annotation
	//3.created a method to perform a action on element
	//4.Constructor create

//1.
WebDriver driver;
private Select s;
//logout
//2.
@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
WebElement menuButton;

//3.
public void clickMenuButton()
{
	menuButton.click();
	System.out.println("click on menu button");
}

//2.
@FindBy(xpath = "//a[@id='logout_sidebar_link']")
WebElement logOutButton;

//3. 
public void clickLogOutButton()
{
	logOutButton.click();
	System.out.println("logout successfully");
}


//single products selected
//4. 
@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
WebElement bagButton;


public void clickbagButton()
{
	bagButton.click();
	System.out.println("bag product selected");
}


@FindBy(xpath = "//span[text()='1']")
WebElement addtocartButton;

//5. 
public String addtocartgettext()
{
String Totalproduct =	addtocartButton.getText();
return Totalproduct;


}


// multiple peoduct selected

@FindBy(xpath = "//button[text()='Add to cart']")
private  List<WebElement> AllProduct;


public void clickAllProduct()
{
	for(WebElement i:AllProduct) {
		i.click();
		System.out.println("All product selected");
	}
}

@FindBy(xpath = "//span[text()='6']")
WebElement AlladdtocartButton;

//5. 
public String Alladdtocartgettext()
{
String Totalproduct =	AlladdtocartButton.getText();
return Totalproduct;

}



//6
public HomepagePomclass(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	s = new Select(dropDown);
}


//Product Fillter
	
	@FindBy(xpath = "//select[@class='product_sort_container']")
	private WebElement dropDown;
	
	public void clickDropDownFilter()
	{
		dropDown.click();
//         s = new Select(dropDown);
		s.selectByValue("lohi");	
	}

}
