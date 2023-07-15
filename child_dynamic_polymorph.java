package may_02;

public class child_dynamic_polymorph extends Dynamic_polymorph {
	
	public void dynamic() {        // similar method name as parent's
		
		System.out.println("child account created");
	}

	public static void main(String[] args) {
		child_dynamic_polymorph v1 = new child_dynamic_polymorph();
		
//		Override: instead of printing parent's, this prints child
		v1.dynamic();
		
	}

}
