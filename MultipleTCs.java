package testng_cases;

/*
 * multiple test cases, if order not specified, TESTng runs TCs in alphabetical order
 * However the developer can specify a particular order using priority definitions.  
 */


import org.testng.annotations.Test;

public class MultipleTCs {
  @Test(priority = 1)
  public void c() {
	  System.out.println("I go first");
  }
  
  @Test(priority = 3)
  public void m() {
	  System.out.println("I come last");
  }
  
  
  @Test(priority = 2)
  public void a() {
	  System.out.println("and I go second");
  }
  
  
  
}
