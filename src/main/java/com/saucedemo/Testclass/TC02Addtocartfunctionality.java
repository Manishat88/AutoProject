package com.saucedemo.Testclass;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMclass.AddToCart;
import com.saucedemo.POMclass.BaseClass;
import com.utility.Class.UtilityClass;

public class TC02Addtocartfunctionality extends BaseClass
{
	@Test
	public void addtocart() throws IOException
	{
		AddToCart ad = new AddToCart(driver);
		ad.clickaddbutton();
		System.out.println("item is added to cart");
		UtilityClass.screenshot(driver);
		System.out.println("screenshot of addtocart");
		
		String expectedtext = "REMOVE";
		WebElement addbutton=driver.findElement(By.xpath("//button[text()='Remove']"));
		String actualtext = addbutton.getText();
		
		Assert.assertEquals(actualtext, expectedtext);
		
	}

}
