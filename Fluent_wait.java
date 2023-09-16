package july_22nd;

/*
 * Use FluentWait() to customise the polling time
 * A hardly used method
 */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluent_wait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		FluentWait w = new FluentWait(driver).withTimeout(Duration.ofSeconds(8))
				.pollingEvery(Duration.ofMillis(100));
		
		WebElement account = driver.findElement(By.linkText("Create new account"));
//		w.until(ExpectedConditions.numberOfElementsToBe(By.linkText("Create new account"), 3));
		account.click();
		
		
		w.until(ExpectedConditions.attributeToBe(By.name("firstname"), "name", "firstname"));
		
		WebElement fnm = driver.findElement(By.name("firstname"));
		//set conditions 
		w.until(ExpectedConditions.visibilityOf(fnm));
		fnm.sendKeys("kunle");
		
		Thread.sleep(5000);
		driver.quit();

	}

}
