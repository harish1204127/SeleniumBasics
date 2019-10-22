package ObjectRepositry;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


	
	public class ObjectMap {
		  
		  //property file and provide the locator information to the test.
		  Properties properties;
		  
		  public ObjectMap(String mapFile)
		  {
		      properties = new Properties();
		      try {
		      FileInputStream Master = new FileInputStream(mapFile);
		      properties.load(Master);
		      Master.close();
		          }catch (IOException e) {
		            System.out.println(e.getMessage());
		         }
		      }


		   public WebElement getWebElement(WebDriver driver, String ElementName) throws Exception {
		         //Read value using the logical name as Key
		         String locator = properties.getProperty(ElementName);
		         System.out.println("ElementName"+ElementName);
		         System.out.println("locator"+locator);
		         //Split the value which contains locator type and locator value
		         String locatorType = locator.split(":")[0];
		         String locatorValue = locator.split(":")[1];
		         System.out.println("locatorType"+locatorType);
		         System.out.println("locatorValue"+locatorValue);
		         //Return a instance of By class based on type of locator
		           if(locatorType.toLowerCase().equals("id"))
		        	   return driver.findElement(By.id(locatorValue));
		           else if(locatorType.toLowerCase().equals("name"))
		        	   return driver.findElement(By.name(locatorValue));
		           else if((locatorType.toLowerCase().equals("classname")) || (locatorType.toLowerCase().equals("class")))
		                 return driver.findElement(By.className(locatorValue));
		           else if((locatorType.toLowerCase().equals("tagname")) || (locatorType.toLowerCase().equals("tag")))
		                 return driver.findElement(By.className(locatorValue));
		           else if((locatorType.toLowerCase().equals("linktext")) || (locatorType.toLowerCase().equals("link")))
		                 return driver.findElement(By.linkText(locatorValue));
		           else if(locatorType.toLowerCase().equals("partiallinktext"))
		                 return driver.findElement(By.partialLinkText(locatorValue));
		           else if((locatorType.toLowerCase().equals("cssselector")) || (locatorType.toLowerCase().equals("css")))
		                 return driver.findElement(By.cssSelector(locatorValue));
		           else if(locatorType.toLowerCase().equals("xpath"))
		                 return driver.findElement(By.xpath(locatorValue));
		           else
		                   throw new Exception("Locator type '" + locatorType + "' not defined!!");
		         }
		}


