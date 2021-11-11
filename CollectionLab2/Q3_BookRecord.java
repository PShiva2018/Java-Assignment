package CollectionLab2;

import java.util.ArrayList;
import java.util.Iterator;

//	Q 3 Write program for maintaining book record of library .
//	use ArrayList Class to hold an multiple book record and display all book record using iterator .
//	b) traverse arraylist and store each book record in class object and display book name 
class bookrecord{
	String name;
	int price;
	public bookrecord(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "bookrecord [name=" + name + ", price=" + price + "]";
	}
	
}
public class Q3_BookRecord {
	public static void main(String[] args) {
		
		bookrecord b1= new bookrecord("Electrical Circuit Network",400);
		bookrecord b2= new bookrecord("Measurement",300);
		bookrecord b3= new bookrecord("Power Management",600);
		bookrecord b4= new bookrecord("High Voltage",400);
		bookrecord b5= new bookrecord("Traction",200);
		bookrecord b6= new bookrecord("Transmission and Distribution",500);
		
		
		ArrayList l = new ArrayList();
		l.add(b1);
		l.add(b2);
		l.add(b3);
		l.add(b4);
		l.add(b5);
		l.add(b6);
		
		Iterator i= l.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
