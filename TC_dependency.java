package testng_cases;
/*
 * Introducing the concept of Test cases dependencies.
 * Test cases can be made to depend on one another in sequential manner. 
 */

import org.testng.Assert;

/* 
 * Typically, Test cases are independent of each other, i.e., if one fails, it doesn't stop the execution of other cases.
 * 
 * However, we can make TCs dependent on each other (for validation skae for ex) so that the failure of one step, 
 * makes the following ones to be skipped. 
 * For this we used the dependsOnMethods{} method
 */

import org.testng.annotations.Test;

public class TC_dependency {
 
  @Test(priority = 1)
  public void c() {
	  System.out.println("I go first");
	  Assert.assertEquals("aa", "aa");
  }
  
  @Test(priority = 3, dependsOnMethods = {"c"}) //this particular case will fail becos it is dependent on a step whose assertion is not TRUE
  public void m() {
	  System.out.println("I come last");
  }
  
  
  @Test(priority = 2)
  public void a() {
	  System.out.println("and I go second"); //this  case will NOT fail becos it is NOT dependent on another cases
	  Assert.assertEquals("bb", "aa");
  }
  
  //We can set a OR condition in which if one of either dependenonmethods passes, the test case should run
  
  @Test(priority=4, dependsOnMethods = {"a", "c"}, alwaysRun=true)
  public void z() {
	  System.out.println("Alwaysrun makes me happen");
	  Assert.assertEquals("nunu", "nunu");
	  
  }
  
  
}
