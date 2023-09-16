package July_29;

/*
 * Using dataprovider method to supply oibjects in TestNg
 */

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProvider_demo 
{
//  @Test(dataProvider = "dp")
	@Test(dataProvider = "info")
  public void f(Integer n, String s) 
  {
	  System.out.println(n+ " "+s);
  }

  
  //The data provider below is what dictates what the test acts on
  
//  @DataProvider
//  public Object[][] dp() 
//  {
//    return new Object[][] 
//    		{
//    	
//      new Object[] { 1, "a" },
//      new Object[] { 2, "b" }
//     };
//  }
    		
 @DataProvider
  public Object[][] info() 
  {
    return new Object[][] 
    		{
      new Object[] { 6, "mmm"},
      new Object[] { 2, "bat" },
    		};
  }
}
