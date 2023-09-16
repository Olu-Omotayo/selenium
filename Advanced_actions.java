package july_22nd;

/*
 * Perform actions like you would using your keyboard, mouse or other interfacing mechanism
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Advanced_actions {

	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "/Users/oluswagger/Oluswagger Documents/_Cloud Learnings/Intellipaat/Java_Selenium_Eclipse/drivers/geckodriver");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		
		//create action object
		Actions  action = new Actions(driver);
		WebElement ele1 = driver.findElement(By.xpath("//div[@class='nav-line-1-container']/span[text() = 'Hello, sign in']"));
//		WebElement ele2 = driver.findElement(By.xpath("//a[@class='nav-link nav-item']/span[contains(text(),'Create a Wish List')]"));
		WebElement ele2 = driver.findElement(By.xpath("//span[contains(text(),'Create a Wish List')]"));
		
		// do a double click
//		action.moveToElement(ele1).moveToElement(ele2).doubleClick().build().perform();
		
		//right click
//		action.moveToElement(ele1).moveToElement(ele2).contextClick().build().perform();
		
		//OR		
		action.moveToElement(ele1).click(ele2).build().perform();
	}

}
