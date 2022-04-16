package com.saucedemo.Testclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMclass.AddToCart;
import com.saucedemo.POMclass.BaseClass;
import com.saucedemo.POMclass.CheckoutPage;

public class TC06Removeitemfunctionality extends BaseClass
{
	WebDriver driver;
	@Test
	public void removeitemfunctionality()
	{
		AddToCart ad = new AddToCart(driver);
		ad.clickaddbutton();
		ad.clickcart();
		CheckoutPage cp = new CheckoutPage(driver);
		cp.removebutton();
		driver.navigate().back();
		WebElement addtocart = driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]"));
		String expectedtext = "ADD TO CART";
		String actualtext = addtocart.getText();
		
		Assert.assertEquals(actualtext, expectedtext);
	}

}
