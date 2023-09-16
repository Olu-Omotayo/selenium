package July_15;
/*
 * using dropdown locators
 */

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dropdown_demo {
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
						
		// find "create new account" menu
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		//Scenario 1
		// Picking just one value in a Keyboards down
		WebElement day = driver.findElement(By.id("day"));
		

		Select s = new Select(day);
//		s.selectByIndex(2); //OR
//		s.selectByValue("3"); //OR
//		s.selectByVisibleText("3");
		
		//Scenario 2
		// looping through all values in a dropdown
		List<WebElement> allOpt = s.getOptions();  
		int cnt = allOpt.size();
		System.out.println("Count is: " + cnt);
		
		for(int e=0; e<cnt; e++) 
		{
			allOpt.get(e).getText();
			System.out.println(allOpt.get(e).getText());
			allOpt.get(e).click();
			Thread.sleep(1000);
		}
		System.out.println("All values accounted for ... ");
		
		//Scenario 3
		// Pick a value if it matches a specific one.
//		for(WebElement g : allOpt) 
//		{
//			String txt = g.getText();
//			if(txt.matches("6"))
//			{
//				System.out.println(g.getText()+" is chosen");
//				g.click();
//				Thread.sleep(2000);
//				break;
//			}
//		}
		
		
		
		
		Thread.sleep(6000);
		driver.quit();
		System.out.println("Driver closed ...");
		
	}

}
