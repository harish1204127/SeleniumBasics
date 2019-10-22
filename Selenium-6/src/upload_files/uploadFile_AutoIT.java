package upload_files;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class uploadFile_AutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

//open File upload window
        Actions act= new Actions(driver);
        
        act.click(uploadElement).build().perform();
        Thread.sleep(5000);
        String autoitscriptpath ="F:\\Selenium\\workspace2\\Selenium-6\\src\\upload_files\\test.au3";
        Runtime.getRuntime().exec("cmd.exe /c Start AutoIt3.exe " + autoitscriptpath + " \""+""+ "\"");
        
        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        }

	}


