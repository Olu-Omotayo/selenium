package sele_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Using_Xpaths {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/oluswagger/Oluswagger Documents/_Cloud Learnings/Intellipaat/Java_Selenium_Eclipse/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		

	}

}
