package July_29;

/*
 * The goal here is to use an annotation to describe the sequence of test functions 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions_and_testng {
	WebDriver driver;
	
//	@BeforeClass
	@BeforeMethod
	public void launch() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		  		
	}
  @Test(priority=2)
  public void fb_login() throws InterruptedException {
	  
	  driver.get("https://www.facebook.com/");
	  
	  Assert.assertEquals(driver.getTitle(), "Facebook - log in or sign up");
	  driver.findElement(By.id("email")).sendKeys("aaaa@bmail.com");
	  Thread.sleep(3000);
	  
  }
  
   @Test(priority=1)
  public void fb_create() throws InterruptedException {
	 driver.get("https://www.facebook.com/");
	  
	  Assert.assertEquals(driver.getTitle(), "Facebook - log in or sign up");
	  driver.findElement(By.linkText("Create new account")).click();
	  Thread.sleep(3000);
  }
   
//   @AfterClass 
   @AfterMethod
   public void teardown() {
	   
	   driver.quit();
	   
   }
  
  
  
}
