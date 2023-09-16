package sele_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Using_Xpaths {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		 WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		

	}

}
