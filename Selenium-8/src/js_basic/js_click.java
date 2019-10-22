package js_basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class js_click {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement button= driver.findElement(By.name("proceed"));
		JavascriptExecutor js= (JavascriptExecutor)driver;

        js.executeScript("arguments[0].click();", button);



		
		
		
		
		

		
		
		
		
		
	}

}
