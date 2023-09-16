package july_23rd;

/*
 * Here we call a Method from a pre-exisitng class to test here
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng_Demo2 {
	
	static WebDriver drv=null;
	static Actions action;
	
  @Test
  public void f() {
	  System.out.println("TC called");
	  
	  // call a method from another class here
	  WebDriverManager.firefoxdriver().setup();
	  drv = new FirefoxDriver();
	  drv.get("https://jqueryui.com/droppable/");
	
	  action = new Actions(drv);
	  Drag_Demo  obj = new Drag_Demo();
	  obj.drag(drv);
	  System.out.println("Method successfuly called...");
  }
}
