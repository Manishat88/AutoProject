package com.saucedemo.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BaseClass
{
	WebDriver driver;
	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkoutbutton;
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	WebElement continuebutton;
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	WebElement removeitembutton;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickcheckoutbutton()
	{
		checkoutbutton.click();
	}
	
	public void clickcontinuebutton()
	{
		continuebutton.click();
	}
	
	public void removebutton()
	{
		removeitembutton.click();
	}

}
