package dynamic;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dynamic_WebTable2 {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");
		List<WebElement>  col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " +col.size()); 
        //No.of rows 
        List<WebElement>  rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr")); 
        System.out.println("No of rows are : " + rows.size());
        
      //*[@id="dataTable"]/tbody/tr[1]/td[2]
		


		
		
		
		
		

		
		
		
		
		
	}

}
