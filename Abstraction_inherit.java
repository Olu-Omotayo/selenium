package may_02;

/* INHERITANCE
 
 */


public abstract class Abstraction_inherit {

	public void account() {
		System.out.println("account method successfuly created ...");
	}
	
	public void loans() {
		System.out.println("Loan method successfuly created ...");
	}
	
	// Here we create an abstract method that can be abstracted by any other class. 
//	creating an abstract method automatically turns the Abstraction_inherit above to an abstract class. 
	public abstract void interest();
	

}
