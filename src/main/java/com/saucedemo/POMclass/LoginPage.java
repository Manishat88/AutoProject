package com.saucedemo.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass
{
	WebDriver driver;
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginbutton;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void sendusername()
	{
		username.sendKeys("standard_user");
	}
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	public void clickloginbutton()
	{
		loginbutton.click();
	}
	

}
