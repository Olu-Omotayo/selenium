package July_15;
/* 
 * css selectors
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class css_tags {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver drv = new FirefoxDriver();
		drv.get("https://www.facebook.com/");
		
		
		// css selector by ID
//		drv.findElement(By.cssSelector("input#email")).sendKeys("hahaha");
		
		// css selector by class
//		boolean k = drv.findElement(By.cssSelector("img.fb_logo._8ilh.img")).isDisplayed();
//		System.out.println("Is image enabled?"+k);
		
		// css selector by attribute
//		String att = drv.findElement(By.cssSelector("div[id=reg_pages_msg]")).getText();
//		System.out.println(att);
		
		
		// css selector by substring: starts with
		drv.findElement(By.cssSelector("input[type^=hidd][name^=jaz]"));

		
		// css selector by substring: ends with
//		drv.findElement(By.cssSelector("input[type$=dden]"));
		
		
		// css selector by substring: contains
		drv.findElement(By.cssSelector("input[name*=il]"));
		
		Thread.sleep(2000);	
		drv.quit();	

	}

}
