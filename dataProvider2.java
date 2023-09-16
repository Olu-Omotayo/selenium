package July_29;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class dataProvider2 {
	WebDriver driver;
	
	@BeforeMethod
	public void launch() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		}
	
//  @Test(dataProvider = "dp")
//  public void f(String n, String s) 
//  {
//	  Assert.assertEquals(driver.getTitle(), "Facebook - log in or sign up");
//	  driver.findElement(By.id("email")).sendKeys(n);
//	  driver.findElement(By.id("pass")).sendKeys(s);
//	  driver.findElement(By.name("login")).click();
//  }
//To make our script cleaner,, we can write the above @test method in a separate script (dp_script.java) and then call it here

  @Test(dataProvider = "dp")
  public void f(String n, String s) 
  {
	  Assert.assertEquals(driver.getTitle(), "Facebook - log in or sign up");
	  dp_script p = new dp_script(driver);
	  p.loginFun(n, s);
	  
	  }
	
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "aaa", "i" },
      new Object[] { "ser", "b" },
      new Object[] { "ccc", "s" }
    };
  }
  
  @AfterMethod
  public void close() {
	  driver.close();
  }
}
