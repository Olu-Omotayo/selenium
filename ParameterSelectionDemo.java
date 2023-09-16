package July_29;

/* 
 * in this test, we are using the @Parameter option of passing parameters to TestNG scripts
 * The parameters to be used in running this script will be abstracted from its xml source (para_select_demo.xml)
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterSelectionDemo 
{
	@Parameters({"browser", "App"})
	@Test 

  public void launch(String browser, String App) 
  {
	  WebDriver driver;
	  
	  switch(browser) 
	  {
	  case "chrome": 	
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();	
		  break;
	  
	  case "firefox": 	
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		  break;
		  
	  case "safari": 	
		  WebDriverManager.safaridriver().setup();
		  driver = new SafariDriver();
		  break;
		  
	  case "edge": 	
		  WebDriverManager.edgedriver().setup();
		  driver = new EdgeDriver();
		  break;
		  
	default:
		System.out.println("Unknown browser passed ...");
	  }
	  driver.get(App);
//	  driver.get("https://www.facebook.com/");
  }
}
