package ssl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ssl_chrome {

	@Test
	public void ssl_test()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");

		DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome();      
				handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
				handlSSLErr.setCapability (CapabilityType.ACCEPT_INSECURE_CERTS, false);
		WebDriver driver= new ChromeDriver(handlSSLErr);
		driver.get("https://cacert.org");
		WebElement headingEle = driver.findElement(By.cssSelector(".story h3"));
		String expectedHeading = "Are you new to CAcert?";
		Assert.assertEquals(headingEle.getText(), expectedHeading);
		

	}

}
