package com.saucedemo.Testclass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMclass.BaseClass;

public class TC01loginfunctionality extends BaseClass
{
	
	@Test
	public void loginfunctionality()
	{
		String expectedtitle ="Swag Labs";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
				
	}

}
