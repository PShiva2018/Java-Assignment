package CollectionLab2;
 // Q }  write a program to create vector of string and add elements to vector 
//		 check vector class main functions like 
//		 1)adding elements in vector
//		 2)traversing all vector elements 
//		 3)print vector object hashcode
// 		 4)get particular element value usin get function
//		 5)print size and capacity of vector
//		 6)add null data in vector
//		 7)print index valueof null elements 
// 		 hint v.indexOf(null)
// 		 8)add element at particular postition
//       hint 
//		 v.insertElementAt("",5);
//       9)remove particular element from vector

import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public class Q1Element {
	public static void main(String[] args) {
		Vector v = new Vector();
		int size = v.size();
		System.out.println("Size of the vector "+ size);
		 
		// Adding Elements in Vector
		v.add("Toyota");
		v.add("Honda");
		v.add("Tesla");
		v.add("BMW");
		v.add("Ford");
		v.add("Toyota");
		System.out.println("Elements "+ v);
		 
		
		// Check size and capacity
		int vectorsize = v.size();
		System.out.println("Default size ="+ vectorsize);
		int Vectorcapacity = v.capacity();
		System.out.println("Default Capacity ="+ v.capacity());
		
		//  new Adding elements null data
		v.add(5, "Hero");
		v.addElement(null);
		
		//traversing all vector elements 
		Iterator i= v.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println(v);
		int newsize = v.size();
		int newcapacity = v.capacity();
		//vector object hashcode
		System.out.println("Hash Code vector ="+v.hashCode());
		
		//get particular element value using get function 
		System.out.println("Element value 5 is "+v.get(5));
		
		// print index value of elements
		System.out.println("Index valye of null elements"+v.indexOf(null));
		System.out.println("Newsize ="+ v.size()+ "\n"+"Newcapacity ="+ v.capacity());
		
	
		
		
		
	}

}
