package july_30th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemo {


	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		ReadingDetails r = new ReadingDetails();
		r.getWebElementRef("Email", driver).sendKeys("aaa");
		r.getWebElementRef("Password", driver).sendKeys("mypass");
		r.getWebElementRef("Log", driver).click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
