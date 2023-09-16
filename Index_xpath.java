package July_15;

/*
 * Open amazon.in
 * type "phones" and click search
 * select the OnePlus phone filter
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Index_xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);	
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
//		driver.findElement(By.xpath("//span[text()='OnePlus']")).click();
//		The above can be gotten by using this index locator
		driver.findElement(By.xpath("//div[@id='brandsRefinements']/ul/span[3]//span[text()=\"OnePlus\"]")).click();
		System.out.println("OnePlus phone sidefilter clicked");
		
	
		Thread.sleep(2000);
//		driver.quit();

	}

}
