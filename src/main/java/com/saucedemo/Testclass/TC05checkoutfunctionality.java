package com.saucedemo.Testclass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMclass.AddToCart;
import com.saucedemo.POMclass.BaseClass;
import com.saucedemo.POMclass.CheckoutPage;

public class TC05checkoutfunctionality extends BaseClass
{ 
	WebDriver driver;
	@Test
	public void checkoutfunctionality()
	{
		
		AddToCart ad = new AddToCart(driver);
		ad.clickaddbutton();
		ad.clickcart();
		
//		CheckoutPage cp = new CheckoutPage(driver);
//		cp.clickcheckoutbutton();
//		Thread.sleep(3000);
//		
//		String expectedURL = "https://www.saucedemo.com/checkout-step-one.html";
//		String actualURL = driver.getCurrentUrl();
//		
//		Assert.assertEquals(actualURL, expectedURL);
	}

}
