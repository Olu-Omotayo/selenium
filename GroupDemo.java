package July_29;

/*
 * we'd create a group x,l out of this to specify running only regressional testing over functional testing
 */

import org.testng.annotations.Test;

public class GroupDemo {
  @Test(groups = {"Fun"})
  public void A() {
	  System.out.println("A is done...");
  }
  
  @Test(groups = {"Reg"})
  public void B() {
	  System.out.println("B is done...");
  }
  
  @Test(groups = {"Fun","Reg"})
  public void C() {
	  System.out.println("C is done...");
  }
  
  
  @Test(groups = {"Fun"})
  public void D() {
	  System.out.println("D is done...");
  }
  
  @Test(groups = {"Reg"})
  public void E() {
	  System.out.println("E is done...");
  }
  

}
