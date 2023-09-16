package testng_cases;
// introducing the "assert" method 
/*
 * in place of IF-ELSE conditions, TestNG's ASSERTion can be be used to verify if conditions are fulfilled
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class assert_sample {
  @Test
  public void tc1() {
//	  String s1 = "Java";
//	  String s2 = "java";
	  
	  // Assert.assertEquals(s1, s2);
//	  Assert.assertEquals(s1, s2,"check values");
//	  System.out.println("done...");
	  
	  //driver.getTitle()
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver drv = new FirefoxDriver();
	  drv.get("https://www.facebook.com/");
	  Assert.assertEquals(drv.getTitle(), "Facebook - log in or sign up", "Title Correct ...");
	  
	  drv.findElement(By.id("email")).sendKeys("aaa");
	  WebElement pwd =drv.findElement(By.id("pass"));
	  
	  //verify that password residual word is displayed
	  Assert.assertTrue(pwd.isDisplayed());
	  pwd.sendKeys("passwwr");
	  
	  		  
  }
}
