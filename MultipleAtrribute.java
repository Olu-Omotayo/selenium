package July_15;


import org.openqa.selenium.By;

/* 
 * use multiple tagnames ...AND or OR
 */

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleAtrribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		//AND
//		driver.findElement(By.xpath("//input[@id='email'][@name='email']")).sendKeys("multipletags@xpath.com");
		
		//OR
		driver.findElement(By.xpath("//input[@id='email' or @name='email']")).sendKeys("multipletags@xpath.com");
		System.out.println("email attributes used ...");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
