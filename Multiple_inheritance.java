package may_02;

/*
 * Here we are implementing multiple inheritance 
 * the aim is to show how we can bypass conflicts via interfaces
 */

public class Multiple_inheritance implements Int_B, int_A {


	public static void main(String[] args) {
		Multiple_inheritance m1 = new Multiple_inheritance();
		m1.sub();

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		System.out.println("sub method from int_B...");
		
	}

}
