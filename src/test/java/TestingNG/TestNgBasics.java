package TestingNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics
{
   //Preconditions annotations - starting with @Before
    @BeforeSuite
    public void setUp()
    {
        System.out.println("setup system property for chorme");
    }

    @BeforeTest
    public void launchBrowser()
    {
       System.out.println("launch chrome browser");
    }
    
    @BeforeClass
    public void login()
    {
       System.out.println("login to app");
    }


    @BeforeMethod
    public void enterURL()
    {
       System.out.println("enter URL"); 
    }

    
    //test cases - starting with @Test
    @Test
    public void googleTitleTest()
    {
       System.out.println("Google Title Test");
    }
   
    //post conditions - starting with @After
    @AfterMethod
    public void logOut()
    {
       System.out.println("logout from app");
    }

    @AfterTest
    public void deleteAllCookies()
    {
       System.out.println("delete all cookies");
    }

    @AfterClass
    public void closeBrowser()
    {
       System.out.println("Close browser");
    }


    @AfterSuite
    public void generateTestReport()
    {
       System.out.println("generate test report");
    }
} 

