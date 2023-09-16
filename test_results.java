package July_29;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_results {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launch()
	{
		System.out.println("Tc starts....");
	}
	
  @Test
  public void tc1() 
  {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	  Assert.assertEquals("AAA", "AAA");
  }
  
  @Test
  public void tc2() 
  {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Assert.assertEquals("AAA", "BBB");
  }
  
  @AfterMethod
  public void teardown(ITestResult r) throws IOException
  {
	  //show me the screenshot of the failure (google url)
	  int actual  = r.getStatus();
	 int expect =  ITestResult.FAILURE;
	 if(actual == expect) 
	 {
		File x= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		File y = new File("./src/July_29/screen_img.png");
		FileUtils.copyFile(x, y);
	 }
	 else
	 {
		 driver.close();
	 }
  }
}
