package sele_demo;


//import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

//import org.openqa.selenium.chrome.*;

public class Launch2 {

	public static void main(String[] args) 
	{
//		System.setProperty("webdriver.chrome.driver", "/Users/oluswagger/Oluswagger Documents/_Cloud Learnings/Intellipaat/Java_Selenium_Eclipse/drivers/chromedriver");
		
		System.setProperty("webdriver.gecko.driver", "/Users/oluswagger/Oluswagger Documents/_Cloud Learnings/Intellipaat/Java_Selenium_Eclipse/drivers/geckodriver");
		
//		WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		String url = driver.getCurrentUrl();
		System.out.println("This URL is "+url);
		
		String title =  driver.getTitle();
		System.out.println("Page Title: " + title);
		
		boolean s = title.matches("Facebook - log in or sign up");
		if(s) {
			System.out.println("Title matches");
		}
		
	}

}
