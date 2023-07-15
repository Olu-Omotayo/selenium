package sele_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_buttons {

	public Radio_buttons() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "/Users/oluswagger/Oluswagger Documents/_Cloud Learnings/Intellipaat/Java_Selenium_Eclipse/drivers/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
				
		// find "create new account" menu
		driver.findElement(By.linkText("Create new account")).click();
	    Thread.sleep(3000);    
		
		
//		Some radio buttons comes in Spans which have no unique locators. Thus we use xpath to create a custom locator/element as below: 
//		driver.findElement(By.xpath("//label[text()='Female']")).click();
//		System.out.println("Radio button successfully selected");

//		Alternatively, we can use a safer & More generic customization using "contains" keyword
		driver.findElement(By.xpath("//label[contains(text(), \"Female\")]")).click();
		System.out.println("Radio button successfully found via contains");
		
			
		Thread.sleep(4000);
		driver.quit();	
	}

}
