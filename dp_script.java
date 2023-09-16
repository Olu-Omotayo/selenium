package July_29;

/*
 * we will use this script in the dataProvider.java testNG class
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dp_script {
	WebDriver drv;
	
	public dp_script(WebDriver driver) {
		this.drv = driver;
	}
  
  public void loginFun(String n, String s) {
	  
		  Assert.assertEquals(drv.getTitle(), "Facebook - log in or sign up");
		  drv.findElement(By.id("email")).sendKeys(n);
		  drv.findElement(By.id("pass")).sendKeys(s);
		  drv.findElement(By.name("login")).click();
	  
  }
}
