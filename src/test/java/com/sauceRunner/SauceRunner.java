package com.sauceRunner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/com/featurefile/login.feature"},
		glue = {"com.sauceStepDef"},
		plugin = //{"pretty"},
				"html:target/target-output/Sauce.html",
		publish =true,
		monochrome =true,
		dryRun =!true,
		stepNotifications = true
		)
public class SauceRunner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void launch() throws IOException {
		//String browser = FileReaderManager.getInstance().getCrInstance().getBrowser();
		//driver = BaseClass.browserLaunch(browser);
	}
	
	@AfterClass
	public static void tearDown(){
		driver.quit();
	}
}
