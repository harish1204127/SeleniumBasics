package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpage {
	 
	 WebDriver driver;
	 
	        public loginpage(WebDriver driver){ 
	                this.driver=driver; 
	        }
	 
	 @FindBy(how=How.ID, using="login1") WebElement username;
	 @FindBy(how=How.ID, using="password") WebElement password;
	 @FindBy(how=How.NAME, using="proceed") WebElement submit;
	 @FindBy(how=How.XPATH, using="//a[text()='Home']") WebElement Home;
	 @FindBy(how=How.XPATH, using="//div[@class='login-form']/div[3]/div[2]/a") WebElement forgotPassword;
	 @FindBy(how=How.XPATH, using="//a[text()='Create a new account']") WebElement signup;

	 
	        
	
	 public void login_rediff(String User, String Pass){
	 username.sendKeys(User);
	 password.sendKeys(Pass);
	 submit.click();
	 }
	 public void goto_Home(){
Home.click();
}
	 public void goto_forgotPassword(){
		 forgotPassword.click();
	 
	 }
	 public void goto_signup(){
		 signup.click();
		 }
	 
	}
