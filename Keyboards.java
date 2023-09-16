package july_23rd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Keyboards {
	static WebDriver driver;
	static Actions action;
		

	public void keyes() throws InterruptedException {
		WebElement unm = driver.findElement(By.id("email")); 
		unm.sendKeys("user1");
		Thread.sleep(2000);
		
		
		// select all + copy from username field to password field
		action.click(unm).keyDown(Keys.CONTROL) //hold down ctrl key
		.sendKeys("a")        //select All
		.sendKeys("c")        // copy     
		.keyUp(Keys.CONTROL)    // release ctrl key
		.click(driver.findElement(By.id("pass")))
		.keyDown(Keys.CONTROL).sendKeys("v")    //paste
		.keyUp(Keys.CONTROL).click(driver.findElement(By.name("login")))
		.build().perform(); 
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		
		action = new Actions(driver);
		Keyboards kb = new Keyboards();
		kb.keyes();
					
		
		Thread.sleep(4000);
//		driver.quit();
		System.out.println("Driver Quit/closed");

	}

}
