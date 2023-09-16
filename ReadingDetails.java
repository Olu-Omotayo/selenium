package july_30th;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReadingDetails {

	public String getPropertyDetails(String key)
	{
		FileInputStream fis;
		Properties p;
		String elementKey = null;
		try{
			fis = new FileInputStream("./src/july_30th/locators.properties");
			p = new Properties();
			p.load(fis);
			elementKey = p.getProperty(key);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}	
		return elementKey;
	}
	
	public WebElement getWebElementRef(String key1, WebDriver driver)
	{
		WebElement ele = null;
		ReadingDetails r = new ReadingDetails();
		String element = r.getPropertyDetails(key1); // id:email
		
		// split result from above into two locators
		String[] loc = element.split(":");    // loc[0]=id, loc[1]=email
		
		switch (loc[0]) {
		case "id":
			ele = driver.findElement(By.id(loc[1]));
			break;
			
		case "name":
			ele = driver.findElement(By.name(loc[1]));
			break;
			
		case "xpath":
			ele = driver.findElement(By.xpath(loc[1]));
			break;
			
		case "linkText":
			ele = driver.findElement(By.linkText(loc[1]));
			break;
			
		case "p_linkTest":
			ele = driver.findElement(By.partialLinkText((loc[1])));
			break;
			
		case "tagnames":
			ele = driver.findElement(By.tagName((loc[1])));
			break;
			
		default:
			System.out.println("invalid locator found...");
		}
		
		return ele;
		
	}
	
}
