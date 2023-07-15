package july_8th;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet_demo {

	public static void main(String[] args) 
	{
		TreeSet <Integer> ar = new TreeSet(); 
		
		///check if class object is empty
		boolean status = ar.isEmpty();  
		System.out.println("Empty class?  "+status);
		
//		manually add each item to the linkedlist class
		ar.add(7);
		ar.add(23);
		ar.add(54);
//		ar.add(null); //doesn't accept null
		ar.add(73);
		System.out.println("ArrayList consists of: " +ar);
							
//		read the objects 1by1, use iterator. remember linkedlist can go both ways
		for (Object e :ar) 
		{
			System.out.println(e);

		}
	}

}
