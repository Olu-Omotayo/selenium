package may_02;

/* here we see examples of how an encapsulated data has been hidden from end users
 * this class uses an encapsulated method from another class
 */

public class Encaps_reader {


	public static void main(String[] args) {
		encaps e1 = new encaps();
		
		e1.username = "john_bull";
		System.out.println("username: " + e1.username);
		
		
//		the password parameter can now be accessed once it has be given a get/set methods
		
		System.out.println(e1.getPassword());
		e1.setPassword("test_pwd");
		
//		confirm you can a placehiolder password
		System.out.println(e1.getPassword());
		
	}

}
