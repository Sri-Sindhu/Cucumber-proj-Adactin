package org.runner;

import org.base.adactin.Base_Class;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {".//FeatureFiles"},
		glue = "com.stepdefi",
		plugin = {"json:Repots/repotsadactin.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				    "html:Reports/reportadactin.html"},
	
		monochrome = true,
		dryRun = false,
		publish = true)
public class Runner_Class {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() {
		driver=Base_Class.browser_Launch("chrome");
		Base_Class.get_Url("http://www.adactinhotelapp.com/");
	}
	
	@AfterClass
	public static void tear_Down() {
		driver.close();
		
	}

}
