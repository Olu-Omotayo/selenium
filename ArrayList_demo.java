package july_8th;

import java.util.ArrayList;
import org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator;

public class ArrayList_demo {

	public static void main(String[] args) 
	{
//		ArrayList<String> ar = new ArrayList();  // to specify that only strings shouls be input i.e. generic
		ArrayList ar = new ArrayList();
		boolean status = ar.isEmpty();  ///check if class object is empty
		System.out.println("Empty class?  "+status);
		
//		manually add each item to the arraylist class
		ar.add(22);
		ar.add(7);
		ar.add("asa");
		ar.add("null");
		ar.add(100);
		System.out.println("ArrayList consists of: " +ar);
		
		ar.add(2,33);	//insert this value 33 at this index	 2
		System.out.println(ar);
		
		ar.remove("asa"); // remove the particular object
		System.out.println(ar);
		
		ar.remove(2);       ///remove the obj at this index
		System.out.println(ar + " .... 33 removed");
		
		System.out.println("Size of the arraylist class is: "+ar.size());
		
		
//		read the objects 1by1, use iterator
		java.util.Iterator i =ar.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+ "...");
		}
		
//		we also can use enhanced for loop 
		for(Object e :ar) {
			System.out.print(e +"\n");
		}
	}
}
