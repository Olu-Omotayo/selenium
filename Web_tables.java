package july_22nd;

/* 
 * Dealing with web tables (e.g. calendars) 
 */

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Web_tables {
	static WebDriver driver;
	
	
	public void date_pick() throws InterruptedException {
		// use loop method that click through all active (today + future) dates 
		List<WebElement> ele = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		System.out.println("Count of active dates in this month: "+ele.size());
		System.out.print("These are: ");
		
		//use a loop
		for(int e =0; e<ele.size(); e++) {
			driver.findElement(By.name("txtJourneyDate")).click();
			List<WebElement> dts = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
			System.out.print(dts.get(e).getText()+ ", ");
			Thread.sleep(1000);
			dts.get(e).click();
	}
	
}

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.name("txtJourneyDate")).click();
		Thread.sleep(1000);
		WebElement date= driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[5]/td[3]/a"));
		date.click();
		System.out.println("Today's date clicked");
		
		//if we need to click through all the remaining dates in this month
//		Web_tables wb = new Web_tables();
//		wb.date_pick();
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
