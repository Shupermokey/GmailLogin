package com.cg.selenium.AmazonObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AmazonObject {
	
	WebDriver driver;
	public AmazonObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@org.openqa.selenium.support.FindBy(name="field-keywords")
	WebElement search_field;
	
	@org.openqa.selenium.support.FindBy(className="s-image")
	WebElement image;

	@org.openqa.selenium.support.FindBy(className="nav-input")
	WebElement button;

	public WebElement Image() {
		return image;
	}

	public WebElement Search()
	   {
		   return search_field;
	   }
	
	public WebElement Button()
	   {
		   return button;
	   }
	         
	
}