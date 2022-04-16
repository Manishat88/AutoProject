package com.saucedemo.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddMultipleitems extends BaseClass
{
	WebDriver driver;
	@FindBy(xpath="//body//div//div//button")
	WebElement addtocartbutton;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cart;
	
	public AddMultipleitems(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickaddtocartbutton()
	{
		addtocartbutton.click();
	}
	
	public void clickcart()
	{
		cart.click();
	}

}
