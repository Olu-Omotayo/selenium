package may_02;

/*
 * POLYMORPHISM
  */

public class Static_polymorph {

	public void login(String u, String p) 
	{
		System.out.println("Method is for users");
	}
	
	public void login(int x, String p) {
		System.out.println("Method is for Emps");
	}
	public void login(String p, int x) {
		System.out.println("Method is for admins");
		
	}



	public static void main(String[] args) {
		Static_polymorph u1 = new Static_polymorph();
		
//		Depending on the pattern of inputs you give here, the compiler finds the matching/correct method
		u1.login("Ade", "pwd");
		u1.login(7, "user");
		u1.login("deo",90);

		
	}

}
