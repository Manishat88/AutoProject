package com.saucedemo.Testclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.saucedemo.POMclass.BaseClass;
import com.saucedemo.POMclass.CheckoutPage;
import com.saucedemo.POMclass.InformationPage;

public class TC08infofunctionality extends BaseClass
{
	WebDriver driver;
	@Test
	public void infofunctionality()
	{
		CheckoutPage cp = new CheckoutPage(driver);
		cp.clickcontinuebutton();
		
		InformationPage ip = new InformationPage(driver);
		ip.enterfirstname();
		ip.enterlastname();
		ip.enterzipcode();
		ip.clickcontinue();
		
	}

}
