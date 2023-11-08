package com.saucePom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceHomePageElements {
	public static WebDriver driver;
	
	public SauceHomePageElements(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(id = "user-name")
	WebElement user;
	
	@FindBy(name = "password")
	WebElement pass;
	
	@FindBy(css = "input.submit-button.btn_action")
	WebElement login;
	
	@FindBy(xpath = "//img[@alt='Sauce Labs Backpack']")
	WebElement product;
		

}
