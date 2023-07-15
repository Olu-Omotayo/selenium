package july_8th;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_demo {

	public static void main(String[] args) {
		 // to specify that only strings should be input i.e. generic
		LinkedList<String> ar = new LinkedList(); 		
		boolean status = ar.isEmpty();  ///check if class object is empty
		System.out.println("Empty class?  "+status);
		
//		manually add each item to the linkedlist class
		ar.add("7");
		ar.add("asa");
		ar.add("null");
		ar.add("olu");
		System.out.println("ArrayList consists of: " +ar);
		
		ar.add(2,"33");	//insert this value 33 at this index	 2
						
//		read the objects 1by1, use iterator. remember linkedlist can go both ways
		ListIterator i =ar.listIterator();
		while(i.hasNext()) 
		{
			System.out.print(i.next()+ "...");
		}
		System.out.println("\n \n--========---");
		while(i.hasPrevious()) {
			System.out.print(i.previous()+ "...");
		}
	}
}
