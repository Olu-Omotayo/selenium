package testng_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

/*
* In this example, I want to call in a method from another class to run in this 
* testNG script 
*/

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import july_23rd.Drag_Demo;

public class TestCase2 {
	static WebDriver driver=null;
	static Actions action;
		
  @Test
  public void f() 
  {
	  WebDriverManager.firefoxdriver().setup();
	  driver.get("https://jqueryui.com/draggable/");
	  
	  action = new Actions(driver);
	  
//	  call method from another class
	  Drag_Demo obj = new Drag_Demo();
	  obj.drag();
	  
  }
}
