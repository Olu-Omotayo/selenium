package july_23rd;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

/*
 * instead of using IF-Else statements, TestNG employs assert statements to provision conditions 
 * 
 */

import org.testng.annotations.Test;

public class assert_ {
  @Test
  public void assertion() 
  {
	  String s1 = "Java";
	  String s2 = "java";
	  
	  //Is s1 = s2? 
	 
	  //Assertion will return error, whihc is the correct outcome in this case
//	  Assert.assertEquals(s1, s2);
	  
	  //Throw error if both values are the same
//	  Assert.assertNotEquals(s1,s2, "Values not simialr");
	  
	  Assert.assertTrue(10 == 1000, "Check input" + "\n");
	  
	  System.out.println("Done ...");
  }
}
