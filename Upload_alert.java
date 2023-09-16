package july_22nd;
/* 
 * Using selenium to upload files
 */

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_alert {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		
		Robot r = new Robot();
		
		driver.findElement(By.id("register_Layer")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(), 'Upload Resume')]")).click();
//		driver.findElement(By.id("Upload Resume")).click();
		
//		Stringselection is the placeholder for the filename to be uploaded
		StringSelection s = new StringSelection("/Users/oluswagger/Desktop/Greek Alphabelt.png");
		
//		retrieve the filename from the placeholder, S
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_CONTROL);    //VK = Virtual Key
		r.keyRelease(KeyEvent.VK_V);        //Ctrl+V
		Thread.sleep(2000);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
