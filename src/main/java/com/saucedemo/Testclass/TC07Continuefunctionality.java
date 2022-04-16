package com.saucedemo.Testclass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMclass.AddToCart;
import com.saucedemo.POMclass.BaseClass;
import com.saucedemo.POMclass.CheckoutPage;

public class TC07Continuefunctionality extends BaseClass
{
	WebDriver driver;
	@Test
	public void continuefunctionality()
	{
		AddToCart ad = new AddToCart(driver);
		ad.clickaddbutton();
		ad.clickcart();
		CheckoutPage cp = new CheckoutPage(driver);
		cp.clickcontinuebutton();
		String expectedURL = "https://www.saucedemo.com/inventory.html";
		String actualURL = driver.getCurrentUrl();
		
		Assert.assertEquals(actualURL, expectedURL);
	}
	
	

}
