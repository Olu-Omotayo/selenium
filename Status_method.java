package sele_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Status_method {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		 driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		WebElement img = driver.findElement(By.className("lnXdpd"));
		boolean status = img.isDisplayed();
		System.out.println("Is image displasyed: ... " + status);
		
		System.out.println("Image enabled? ... "+ img.isEnabled());
		System.out.println("Image is slected? ... " + img.isSelected());
		
		driver.findElement(By.className("gLFyf")).sendKeys("All statuses checked ...... BYE!");
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
