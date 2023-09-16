package july_23rd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBAssertDemo {
  @Test
  public void f() {
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://facebook.com/");
	  
	  //verify title of page
	  Assert.assertEquals(driver.getTitle(), "Facebook - log in or sign up");
	  
	  //if assertion is true, then proceed to find username and password
	  driver.findElement(By.id("email")).sendKeys("username");
	  
	  // is password field provided on the page
	  WebElement pwd = driver.findElement(By.id("pass"));
	  
	  //only sendkeys if pwd.isdispalyed == True
	  Assert.assertTrue(pwd.isDisplayed());
	  pwd.sendKeys("paswordss");
	  
	  
	  
  }
}
