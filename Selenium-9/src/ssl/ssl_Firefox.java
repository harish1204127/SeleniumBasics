package ssl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.Assert;

public class ssl_Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "F:\\firefox.log");
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true); 
		profile.setAssumeUntrustedCertificateIssuer(false);
		FirefoxOptions options=new FirefoxOptions();
		options.setProfile(profile);



WebDriver driver= new FirefoxDriver(options);
driver.get("https://cacert.org");
WebElement headingEle = driver.findElement(By.cssSelector(".story h3"));
String expectedHeading = "Are you new to CAcert?";
Assert.assertEquals(headingEle.getText(), expectedHeading);
		
		
	}

}
