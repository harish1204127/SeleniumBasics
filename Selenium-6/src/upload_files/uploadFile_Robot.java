package upload_files;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class uploadFile_Robot {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		
		//Robot Basic- https://chercher.tech/java/robot-class-selenium-webdriver
		//Robot Basic- https://www.guru99.com/using-robot-api-selenium.html
		// Robot drawback- https://chercher.tech/java/robot-class-selenium-webdriver#drawbacks
		
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        Actions act= new Actions(driver);
        act.click(uploadElement).build().perform();
        Thread.sleep(3000);
        StringSelection strSel = new StringSelection("F:\\screenshot\\select.html");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSel, null);
		
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        }

	}


