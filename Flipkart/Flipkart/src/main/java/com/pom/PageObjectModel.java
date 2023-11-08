package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {

	public PageObjectModel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//heloo
	@FindBy(xpath="//span[.='✕']")
	private WebElement CloseButton;
	
	@FindBy(xpath = "//div[@id='product-0']")
	private WebElement Banner;
	
	@FindBy(xpath = "//span[@class='_2I9KP_']")
	private WebElement Electronics;
		
	@FindBy(xpath = "//div[@class='_1fwVde']")
	private WebElement Text;
	
	public void closePopup() {
		CloseButton.click();
	}
	public void clickBanner() {
		Banner.click();
	}
	public void hoverElectronics(WebDriver driver) {
		Actions a= new Actions(driver);
		a.moveToElement(Electronics).perform();
	}
	public void printText() {
		System.out.println(Text.getText());
	}

}
