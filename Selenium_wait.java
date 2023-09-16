package july_22nd;
/*
 * default wait = 0
 * 
 * Implicit wait: 
 * 		-- a common wait to entire script
 * 		--applies to all transitions between actions
 * 		-- once set, can't be changed in between actions
 * 
 * Explicit wait: 
 * 		-- applies to only current action
 * 		--Apply wait time on certain conditions e.g. once a page fully loads
 */


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Selenium_wait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//Set implicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   //set 5 secs wait for all actions
		//OR
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Apply explicit wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));  //create obj for webdriverwait
		
		WebElement acc = driver.findElement(By.linkText("Create new account"));
		acc.click();
		w.until(ExpectedConditions.attributeToBe(By.name("firstname"), "name", "firstname"));
		
		WebElement fnm = driver.findElement(By.name("firstname"));
		//set conditions 
		w.until(ExpectedConditions.visibilityOf(fnm));
		fnm.sendKeys("kunle");
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
