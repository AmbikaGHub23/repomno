package com.sauceBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SauceBaseClass {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String option) {
		try {
			if (option.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			} else if (option.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	public static void urlGo(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void clicks(WebElement ele) {
		try {
			ele.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sendkeyss(WebElement ele, String value) {
		try {
			ele.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void MouseOver(WebElement ele) 
	{
		try {
			Actions a= new Actions(driver);
			a.moveToElement(ele).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void PrintText(WebElement ele) 
	{
		try {
			System.out.println(ele.getText());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}


