package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.loginpage;

import com.TestBase;

public class loginTestCase extends TestBase{
	 
	 @Test
	 public void login(){
	 
		 loginpage loginpage = PageFactory.initElements(driver, loginpage.class);
		 loginpage.login_rediff("username1","Password1");
	 }
	 @Test
	 public void forgotpassword(){
	 
		 loginpage loginpage = PageFactory.initElements(driver, loginpage.class);
		 loginpage.goto_forgotPassword();
	 }
	 
	 @Test
	 public void signup(){
	 
		 loginpage loginpage = PageFactory.initElements(driver, loginpage.class);
		 loginpage.goto_signup();
	 }
	 @Test
	 public void Home(){
	 
		 loginpage loginpage = PageFactory.initElements(driver, loginpage.class);
		 loginpage.goto_Home();
	 }
	 
	 
	 
	}