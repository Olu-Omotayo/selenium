package may_02;

/*  Abstraction
 * 
 * 
 */

public class Inherit_Abstraction extends Abstraction_inherit {
	

	@Override
//	override simply means that whatever logic you add here overrides the one in the abstracted class
	public void interest() {
		System.out.println("\nWe offer flexible loans...");
		
	}

	public static void main(String[] args) {
		Inherit_Abstraction c1 = new Inherit_Abstraction();
		
//		the new object c1 can automatically take up the properties of the parents class
		c1.account();
		c1.loans();
		c1.interest();
	}


}
