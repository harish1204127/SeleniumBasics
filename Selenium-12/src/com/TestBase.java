package com;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class TestBase {
	 
	 public static WebDriver driver = null;
	 
	 @BeforeMethod
		@Parameters("browser")

	 public void initialize(String browser) throws IOException{
		 if(browser.equalsIgnoreCase("firefox")){
			 System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
			 driver = new FirefoxDriver();
				}
				else if(browser.equalsIgnoreCase("chrome")){
					System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");
					 driver= new ChromeDriver();
				}
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	 
	 }
	 
	 @AfterMethod
	 public void TeardownTest()
	    {
	        TestBase.driver.quit();
	    }
	 
	}
