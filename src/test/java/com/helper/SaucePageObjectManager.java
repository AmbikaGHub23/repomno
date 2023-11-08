package com.helper;

import org.openqa.selenium.WebDriver;

import com.saucePom.SauceHomePageElements;
import com.sauceRunner.SauceRunner;

public class SaucePageObjectManager {
public WebDriver driver = SauceRunner.driver;

	
	public SaucePageObjectManager(WebDriver driver1)
	{
		this.driver = driver1;
	}

	private SauceHomePageElements sfpe;
	public SauceHomePageElements getFpe() {
		sfpe = new SauceHomePageElements(driver);
		return sfpe;
	}
}
