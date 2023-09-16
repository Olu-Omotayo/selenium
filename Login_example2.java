package sele_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_example2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/selenium/newtours/");
		
		driver.findElement(By.name("userName")).sendKeys("user1");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("passsentence");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		

	}

}
