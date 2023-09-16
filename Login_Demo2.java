package july_30th;

/* 
 * we create a testng version of calling facebook getWebElementRef method
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Demo2 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launch()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	
  @Test(priority = 1)
  public void fbLogin() throws InterruptedException 
  {
	  driver.get("https://www.facebook.com/");
	  Assert.assertEquals(driver.getTitle(), "Facebook - log in or sign up");
	  
	  // call method
	  ReadingDetails r = new ReadingDetails();
	  r.getWebElementRef("Email", driver).sendKeys("aaasa");
	  r.getWebElementRef("Password", driver).sendKeys("mipasasa");
	  r.getWebElementRef("Log", driver).click();
	  
	  Thread.sleep(3000);
	  driver.close();
  }
  
  	
}
