package sele_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		// find "create new account" menu
		driver.findElement(By.linkText("Create new account")).click();
		
		//sometimes, the action is not instant, hence selenium may outpace the natural speed of browser actions. Hence, we use sleep to slow down selenium
		Thread.sleep(3000);    
		
		driver.findElement(By.name("firstname")).sendKeys("Olu");
		
		Thread.sleep(10000);
		driver.close();	

	}

}
