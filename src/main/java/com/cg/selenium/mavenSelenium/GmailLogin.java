package com.cg.selenium.mavenSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLogin {
	
	WebDriver driver;
	public GmailLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className="h-c-header__nav-li-link ")
	WebElement signIn;
	
	@FindBy(id="identifierId")
	WebElement emailId;
	
	@FindBy(id="identifierNext")
	WebElement next;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="passwordNext")
	WebElement passNext;


	public WebElement SignIn()
	   {
		   return signIn;
	   }
	
	public WebElement Credentials()
	   {
		   return emailId;
	   }
	public WebElement Next()
	{
		return next;
	}
	public WebElement Pass()
	{
		return password;
	}
	public WebElement passNext()
	{
		return passNext;
	}

}


 
