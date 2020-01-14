package stepdefinitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cg.selenium.AmazonObj.AmazonObject;
import java.util.ArrayList;
import com.cg.selenium.mavenSelenium.GmailLogin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	
	
	WebDriver wd;
	GmailLogin gm;
	
    @Given("^User is on gmail.com$")
    public void user_is_on_home_page() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\asobiera\\Downloads\\chromedriver.exe");
    	System.out.println("Gmail.com webpage");
    	wd = new ChromeDriver();
    	gm = new GmailLogin(wd);
    	wd.get("https://accounts.google.com/AccountChooser?service=mail&continue=https://mail.google.com/mail/");
        
    }

	/*
	 * @When("^User clicks on sign in$") public void user_navigate_to_login_page()
	 * throws Throwable { System.out.println("User Clicked Sign In");
	 * System.out.println(gm.SignIn().toString()); gm.SignIn().click(); String
	 * oldTab = wd.getWindowHandle();
	 * wd.findElement(By.xpath("//*[@id=\"identifierId\"]")).click();
	 * ArrayList<String> newTab = new ArrayList<String>(wd.getWindowHandles());
	 * newTab.remove(oldTab); wd.switchTo().window(newTab.get(0)); }
	 */
    
    @Then("^User signs in successfully$")
    public void user_fills_in_form_credentials() throws Throwable {
    	
       gm.Credentials().sendKeys("a.e.sobieraj@gmail.com");
       Thread.sleep(4000);
       gm.Next().click();
       Thread.sleep(2000);
       gm.Pass().sendKeys("up7tp5r49rg");
       Thread.sleep(5000);
       gm.passNext().click();
        }
    
    

}
