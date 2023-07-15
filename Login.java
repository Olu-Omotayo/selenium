package sele_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "/Users/oluswagger/Oluswagger Documents/_Cloud Learnings/Intellipaat/Java_Selenium_Eclipse/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//login functionality
		//find Unm
		WebElement unm = driver.findElement(By.id("email"));
		unm.sendKeys("userme_name");
		
//		find password
		driver.findElement(By.id("pass")).sendKeys("my passwords");
		
//		find submit button ..it'snot ideal to use id for finding submit buttons ..it changes
		WebElement log = driver.findElement(By.name("login"));
		log.click();	
		
		Thread.sleep(3000);
		driver.close();

	}

}
