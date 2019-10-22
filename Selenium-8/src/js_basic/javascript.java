package js_basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javascript {

	public static void main(String[] args) throws InterruptedException {
		
		
		//js-- scroll
		//js- open browser
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.location='https://edition.cnn.com/?refresh=1'");
		String state= (String)js.executeScript("return document.readyState");
		System.out.println(state);
		Thread.sleep(6000);
		js.executeScript("window.scrollTo(0,1800)");
		

	}

}