package com.saucedemo.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart extends BaseClass
{    
	protected WebDriver driver;
	@FindBy (xpath="(//button[text()='Add to cart'])[1]")
	WebElement addbutton;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cart;
	
	public AddToCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickaddbutton()
	{
		addbutton.click();
	}
	
	public void clickcart()
	{
		cart.click();
	}
	

}
