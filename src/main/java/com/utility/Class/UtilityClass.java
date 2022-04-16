package com.utility.Class;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	private static WebDriver driver;
	public static void screenshot(WebDriver driver) throws IOException
	{
		Date date=new Date();
		DateFormat d= new SimpleDateFormat("HH-mm-ss & dd-MM-yy");
		String newDate = d.format(date);
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File destFile =new File("D:\\snapshots\\screenshot\\"+newDate+".jpg");
		FileHandler.copy(sourcefile, destFile);
		
	}

}
