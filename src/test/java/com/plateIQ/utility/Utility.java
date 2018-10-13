package com.plateIQ.utility;


import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;



public class Utility {
	
	public static String screenshotFolderPath= Utility.getBaseDir()+ "\\Screenshots\\";

	public static String getCurrentDateTimeMS() {
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyMMddhhmmssMs");
		String datetime = ft.format(dNow);
		return datetime;
	}

	public static String getBaseDir() {
		return System.getProperty("user.dir");
	}

	public static String getDateFormat(String format) 
	{
		SimpleDateFormat sdf=null;
		Date date = new Date();
		if(format.equalsIgnoreCase("mmddyyyy")) 
		{
			sdf = new SimpleDateFormat("MM/dd/yyyy");
			return sdf.format(date);
		}
		else if(format.equalsIgnoreCase("ddmmyyyy"))
		{
			sdf = new SimpleDateFormat("dd/MM/yyyy");
			return sdf.format(date);
		}
		return null;
	}
	
	public static String appendTimeStamp(String str) 
	{
		return str + (new Timestamp(System.currentTimeMillis())).getTime(); 
	}
	
	public static void captureScreenShot(WebDriver driver,Scenario scenario) 
	{
		String screenShotPath = screenshotFolderPath+ scenario.getName();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        screenShotPath =  appendTimeStamp(screenShotPath);
        screenShotPath = screenShotPath.replaceAll("\\s", "_") + ".JPG";
		try {
			FileUtils.copyFile(scrFile, new File(screenShotPath));
			Reporter.addScreenCaptureFromPath(screenShotPath, "Failure_Image");
		} catch (IOException e) {
			System.out.println("============ISUUE IN CAPTURING SCREENSHOT====================");
			e.printStackTrace();
		}
		
	}
	
	public static void closeBrowser(WebDriver driver) 
	{
		driver.close();
		driver.quit();
	}
}
