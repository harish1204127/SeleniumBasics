package ObjectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ObjectMapLoginTest {

	public  WebDriver driver;
	  public ObjectMap objmap;
	  
	  @BeforeTest
	  public void setUp() throws Exception {
		  System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  Thread.sleep(3000);
	  }
	  
	  @Test
	  public void login() throws Exception{
	    
	 
	     objmap = new ObjectMap("F:\\Selenium\\workspace2\\Selenium-11\\src\\ObjectRepositry\\ObjectRepo.properties");
	    objmap.getWebElement(driver,"Username").sendKeys("Username");
	    objmap.getWebElement(driver,"Password").sendKeys("Password");
	    objmap.getWebElement(driver,"Submit").click();

	     
	  }
	  
}
