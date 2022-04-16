package com.saucedemo.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends BaseClass
{
	WebDriver driver;
	@FindBy(xpath="//button[text()='Open Menu']")
	WebElement openmenubutton;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutbutton;
	
	public LogoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickopenmenu()
	{
		openmenubutton.click();
	}
	
	public void clicklogout()
	{
		logoutbutton.click();
	}

}
