package july_22nd;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Windows alert that are independent of webdriver controls i.e., webdrivr cannot control window alerts
 * You can use java class methods (e.g. Robots) to interact with the OS-based window
 * https://www.geeksforgeeks.org/robot-class-java-awt/
 */

public class Windows_alert {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.selenium.dev/downloads/");
		
		Robot r = new Robot();
		
//		To prevent a peculiar scroll view error (on this page) convert class into  javascript executor i.e. type casting
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll(0,+800)");
			
		r.delay(3000);
		driver.findElement(By.xpath("//p[contains(text(), 'Latest stable version')]")).click();
		
//		Use keyboard/mouse actions via press/release actions
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.delay(1000);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
