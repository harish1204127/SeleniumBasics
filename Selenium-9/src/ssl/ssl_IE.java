package ssl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class ssl_IE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "F:\\Selenium\\drivers\\IEDriverServer.exe");
		//DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
		//cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, false);
		//WebDriver driver=new InternetExplorerDriver(cap);
		WebDriver driver=new InternetExplorerDriver();

		driver.navigate().to("https://cacert.org");
		Thread.sleep(4000);
		driver.navigate ().to ("javascript:document.getElementById('overridelink').click()");
		Thread.sleep(2000);

		driver.navigate ().to ("javascript:document.getElementById('overridelink').click()");


		
		
	}

}
