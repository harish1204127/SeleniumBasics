package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.loginpage;

import com.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class loginTestCase extends TestBase{
	 
	 @Test
	 public void login(){
	 
		 loginpage loginpage = PageFactory.initElements(driver, loginpage.class);
		 String title= loginpage.login_rediff("username1","Password1");
		 logger = extent.startTest("passTest");
		 Assert.assertTrue(true);
		 //To generate the log when the test case is passed
		 logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	 }
	 @Test
	 public void forgotpassword(){
	 
		 loginpage loginpage = PageFactory.initElements(driver, loginpage.class);
		 loginpage.goto_forgotPassword();
		 logger = extent.startTest("errorTest");
		 Assert.assertTrue(true);
		 //To generate the log when the test case is passed
		 logger.log(LogStatus.INFO, "Test Case is info");
	 }
	 
	 @Test
	 public void signup(){
	 
		 loginpage loginpage = PageFactory.initElements(driver, loginpage.class);
		 loginpage.goto_signup();
		 logger = extent.startTest("failTest");
		 Assert.assertTrue(false);
		 //To generate the log when the test case is passed
		 logger.log(LogStatus.FAIL, "Test Case is failed");
	 }
	 @Test
	 public void Home(){
	 
		 loginpage loginpage = PageFactory.initElements(driver, loginpage.class);
		 loginpage.goto_Home();
		 logger = extent.startTest("passTest");
		 Assert.assertTrue(true);
		 //To generate the log when the test case is passed
		 logger.log(LogStatus.PASS, "Test Case is Passed");
	 }
	 
	 
	 
	}