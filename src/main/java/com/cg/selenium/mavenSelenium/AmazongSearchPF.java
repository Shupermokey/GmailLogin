package com.cg.selenium.mavenSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

import com.cg.selenium.AmazonObj.AmazonObject;



public class AmazongSearchPF {
	
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asobiera\\Downloads\\chromedriver.exe");
		org.openqa.selenium.WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.com");
		AmazonObject rd=new AmazonObject(driver);
		rd.Search().click();
		rd.Search().sendKeys("java");
		rd.Button().click();
		rd.Image().click();
	
	}
	
}
