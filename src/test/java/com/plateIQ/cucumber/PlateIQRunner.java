package com.plateIQ.cucumber;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.plateIQ.utility.BrowserInteraction;
//import com.honeywell.utility.Utility;
import com.plateIQ.utility.Utility;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features="./Resources",
        glue= {"com.plateIQ.stepdefinition"},
        tags = {"@UI_ABC"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:./target/output/report.html"}
)
public class PlateIQRunner {

    @BeforeClass
    public static void setUp()
    {
        String screenShotFolderPath = Utility.screenshotFolderPath;
        File file = new File(screenShotFolderPath);
        if(file.isDirectory())
        {
            try {
                FileUtils.cleanDirectory(file);
            } catch (IOException e) {

            }
        }
        else
        {
            file.mkdir();
        }

    }

    @AfterClass
    public static void setupReport() {
    	//BrowserInteraction.userClosesBrowser();
        Reporter.loadXMLConfig(new File(".\\Resources\\extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows 10");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }

    


}