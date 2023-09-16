package July_15;
/*
 * Use navigate() method to move between pages or frames
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.id("APjFqb"));
		
		//Keyboard Actions: Use keyboard's ENTER since the page doesn't have a icon to click.
//		search.sendKeys("Java examples");
//		search.sendKeys(Keys.ENTER); 
		
		//Or use a shortcut 
		search.sendKeys("java example", Keys.ENTER);
//		search.sendKeys("xxx v", Keys.chord(Keys.CONTROL,Keys.ALT));
		System.out.println("String entered ...");
		Thread.sleep(2000);
		
		//Navigation Methods
		driver.navigate().back();
		System.out.println("Navigation back...");
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println("Naviagtion forward ...");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		System.out.println("Page refreshed ...");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com/");
		System.out.println("Navigate to facebook..");
		Thread.sleep(4000);
		
		driver.quit();
		System.out.println("Driver Closed ...");
	
	}

}
