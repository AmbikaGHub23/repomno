package com.sauceStepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceStepDef {
	public static WebDriver driver = new ChromeDriver();
	
	
	@Given("launch the Application")
	public void launch_the_application() {
	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/");	
	}
	@When("enter the {string} in email field")
	public void enter_the_in_email_field(String UserName) {
		driver.findElement(By.id("user-name")).sendKeys(UserName);
	    
	}

	@When("enter the {string} in password field")
	public void enter_the_in_password_field(String PassWord) {
	    driver.findElement(By.name("password")).sendKeys(PassWord);
	}

	@Then("user click login button")
	public void user_click_login_button() {
		driver.findElement(By.id("login-button")).click();
	}
}
