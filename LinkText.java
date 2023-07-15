package sele_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "/Users/oluswagger/Oluswagger Documents/_Cloud Learnings/Intellipaat/Java_Selenium_Eclipse/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
//		find "recover password" link (linktext and partialLinkTest)
		//LinkText
		WebElement ltext = driver.findElement(By.linkText("Forgot password?"));
		ltext.click();
		
		// partialLinkTest ...
//		WebElement plt = driver.findElement(By.linkText("password?"));
//		plt.click();
		
		driver.findElement(By.id("identify_email")).sendKeys("drooluus@icloud.com");
		driver.findElement(By.name("did_submit")).click();
		
		
		Thread.sleep(10000);
		driver.close();
		
		
		
		

	}

}
