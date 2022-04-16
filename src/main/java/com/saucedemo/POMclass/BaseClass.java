package com.saucedemo.POMclass;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import com.utility.Class.UtilityClass;

public class BaseClass 
{ 
	protected WebDriver driver;
	Logger log;

	@BeforeMethod
	public void setupMethod(String browsername) throws IOException
	{ 
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		log = Logger.getLogger("MPP");
		PropertyConfigurator.configure("log4j.properties");
		
		driver.get("https://www.saucedemo.com/");
		log.info("URL is opened");
		driver.manage().window().maximize();
		log.info("window is maximized");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		LoginPage lp = new LoginPage(driver);
		lp.sendusername();
		log.info("username is entered");
		lp.sendpassword();
		log.info("password is entered");
		lp.clickloginbutton();
		log.info("loginbutton is clicked");
		UtilityClass.screenshot(driver);
		log.info("home page screenshot is taken");
		
		
	}
	
	@AfterMethod
	public void teardownMethod()
	{
		driver.quit();
	   log.info("end of program");
	}
	
	
	
	

}
