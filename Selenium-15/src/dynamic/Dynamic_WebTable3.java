package dynamic;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dynamic_WebTable3 {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
         driver.get("https://money.rediff.com/indices?src=moneyhome_bseindices_more");
         driver.manage().window().maximize();
         
         List<WebElement> ilist=driver.findElements(By.xpath("//*[@id=\"dataTable\"]/tbody/tr"));
         
         System.out.println("No of rows=="+ilist.size());
         
         List<WebElement> ilist2=driver.findElements(By.xpath("//*[@id=\"dataTable\"]/thead/tr/th"));
         
         System.out.println("No of columns=="+ilist2.size());
         
         for (int i=1;i<=ilist.size();i++)
         {
        	 
        	 for (int j=1;j<=ilist2.size();j++) {
        		 
        		// System.out.println(driver.findElement(By.xpath("//*[@id=\\\"dataTable\\\"]/thead/tr/th["+i+"]/td["+j+"]")).getText());
        		 
        		 System.out.print(driver.findElement(By.xpath("//*[@id=\"dataTable\"]/tbody/tr["+i+"]/td["+j+"]")).getText());
        		 System.out.print("     ");
        		 
        		 
        		 
        	 }
        	 System.out.println("");
         }
		
		
		
		

		
		
		
		
		
	}

}
