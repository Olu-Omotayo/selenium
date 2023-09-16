package july_23rd;
/*
 *  @Test cases are independent of others, but if you want one to be pre-requisite 
 * for the other, you can use the "depend_on" arg
 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class depends_on {
	
	@Test (priority = 4)       ///this testcase will run bcos it is independent 
	  public void logout() {
		  System.out.println("logout ...");
	  }
	  
	  @Test (priority = 1)
	  public void login() {
	  System.out.println("Login ...");
	  Assert.assertEquals("aa","bb");
	  }
	  
	  @Test (priority = 2, dependsOnMethods = {"login"}) //if login fails, upload is skipped
	  public void upload() 
	  {
		  System.out.println("upload ...");
	  }
	  
	  @Test (priority=3, dependsOnMethods = {"login","upload"}) //both c & a must work
	  //to override dependence, use arg "alwaysRun=True"
	  public void download()
	  {
		  System.out.println("download ...");
	  }
	  
}
