package js_basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class js_mousehover {
    
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        
        driver.get("http://net-comber.com/mouseovr.html");        
        Thread.sleep(4000);
                
            WebElement element = driver.findElement(By.xpath("//a"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].onmouseover()", element); 
        
    }    
}

