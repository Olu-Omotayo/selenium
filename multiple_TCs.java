package july_23rd;

// USING PRIORITY TO SET SEQUENCE OF TEST

import org.testng.annotations.Test;

public class multiple_TCs {
	
  @Test (priority = 2)
  public void a() 
  {
	  System.out.println("upload ...");
  }
  
  @Test (priority = 3)
  public void m() {
	  System.out.println("logout ...");
  }
  
  @Test (priority = 1)
  public void c() {
  System.out.println("Login ...");
  }
}
