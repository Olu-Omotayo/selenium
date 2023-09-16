package july_22nd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/* 
 * pop-ups and alert
 */

public class Web_Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//button[contains(text(), 'Search for Bus' )]")).click();
		Thread.sleep(2000);
		
//		Switch driver to pop up frame
		String txt = driver.switchTo().alert().getText();
		
//		Use validation of pop up message method
		if(txt.matches("Please select start place.")) {
			System.out.println("Valid Alert ...");
			Thread.sleep(3000);
			driver.switchTo().alert().accept();  //Click on OK
		}
		else {
			System.out.println("Invalid Alert ");
			driver.switchTo().alert().dismiss();  //cancel alert, if relevant
		}
		
		System.out.println("All actions done."+"\n"+ "Driver will close now");
		Thread.sleep(2000);
		driver.quit();

	}

}
