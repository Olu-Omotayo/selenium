package July_15;

/*
 * using page coordinates on to locate or place a webelement
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CoordinatesDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
		Actions action = new Actions(driver);
		
		WebElement ele = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		int x =ele.getLocation().getX();
		int y =ele.getLocation().getY(); 			
		
		action.moveByOffset(x, y).contextClick().build().perform();

		System.out.println(x);
		System.out.println(y);
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
