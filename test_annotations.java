package testng_cases;

/*
 * ORDER OF Testng runs
 * 
 * @Before:  suite --> test ---> class ---> method 
*   @After works in same way, but in reverse order. 
 */

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class test_annotations {
	
	
	@BeforeClass
	  public void beforeClass() {
		System.out.println("beforeClass");
	  }
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
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
	  System.out.println("Test itself.... ");
  }
  
  @Test
  public void f2() {
	  System.out.println("Test again.... ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite");
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }

}
