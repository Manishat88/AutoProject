package com.saucedemo.Testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMclass.BaseClass;
import com.saucedemo.POMclass.LogoutPage;

public class TC03Logoutfunctionality extends BaseClass
{
	@Test
	public void logoutfunctionality()
	{
		LogoutPage lp = new LogoutPage(driver);
		lp.clickopenmenu();
		System.out.println("open menu button is clicked");
		lp.clicklogout();
		System.out.println("logout button is clicked");
		
		String expectedURL = "https://www.saucedemo.com/";
		String actualURL =driver.getCurrentUrl();
		
		Assert.assertEquals(actualURL, expectedURL);
		
	}

}
