package july_23rd;

// Before Suite --> Test --> class --> Method in the decreasing order
// After Method --> Class --> test --> Suite in the increasing order

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testng_annotations {
 

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }
	  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite...");
	  }

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest");
  }
 
  @Test
  public void f() {
	  System.out.println("test here ");  
  }
  
  
  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest...");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod...");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass...");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite");
  }
 
}
