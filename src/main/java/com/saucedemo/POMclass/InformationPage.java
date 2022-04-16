package com.saucedemo.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InformationPage extends BaseClass
{
	WebDriver driver;
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstname;
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastname;
	@FindBy(xpath="//input[@name='postalCode']")
	WebElement zipcode;
	
	@FindBy(xpath="//input[@name='continue']")
	WebElement continuebutton;
	
	public InformationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterfirstname()
	{
		firstname.sendKeys("abc");
	}
	public void enterlastname()
	{
		lastname.sendKeys("xyz");
	}
	public void enterzipcode()
	{
		zipcode.sendKeys("123");
	}
	public void clickcontinue()
	{
		continuebutton.click();
	}

}
