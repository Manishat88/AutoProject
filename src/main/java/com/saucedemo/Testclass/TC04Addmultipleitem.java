package com.saucedemo.Testclass;

import org.testng.annotations.Test;

import com.saucedemo.POMclass.AddMultipleitems;
import com.saucedemo.POMclass.BaseClass;

public class TC04Addmultipleitem extends BaseClass
{
	@Test
	public void addmultipleitem()
	{
	AddMultipleitems adm = new AddMultipleitems(driver);
	adm.clickaddtocartbutton();
	System.out.println("6 items are added to cart");
	adm.clickcart();
	System.out.println("cart tab is clicked");
	
	
	}

}
