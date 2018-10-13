package com.plateIQ.utility;
import org.junit.Assert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserInteraction {

	public static WebDriver driver;
	public static String browserName = FileConfig.getProperty("BrowserName");
	public static String dimensionURL = FileConfig.getProperty("DimensionURL");

	public static void launchBrowser() {
		 String browserName = "Chrome";
		//String browserName = "Chrome";
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}

	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static void launchUrl() 
	{
		String urlToLaunch = FileConfig.getProperty("RFUI");
				try{
			driver.get(urlToLaunch);	
		}
		catch(TimeoutException e) 
		{
			
		}
	}

	public static void userClosesBrowser() {
		driver.close();
		driver.quit();
	}

	public static void userLaunchesUrl(String dimensionURL) {
		try 
		{
			driver.get(dimensionURL);
			System.out.println("Url launched");
		}
		catch(Exception e) 
		{
			Assert.assertTrue("Exception while launching the url::"+ dimensionURL, false);
		}
		
		
	}

}
