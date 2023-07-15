package may_02;

/*ENCAPSULATION
 * the purpose of encaps is to ensure the security of your codes
 * Encaps allows the reuse of your code but hidden from the end users to avoid deliberate or careless modification
 * 
 * For encaps, we use the PRIVATE Access modifier
 */




public class encaps {
	
	public String username;
	private String password;  //This object has been encapsulated 
	
//	However, we can generate placeholders for hidden/encapsulated data using Source ==> getters & setters
//	It produces setters/getters methods as below
	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
