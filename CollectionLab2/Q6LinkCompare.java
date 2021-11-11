package CollectionLab2;

import java.util.LinkedList;
import java.util.List;

public class Q6LinkCompare {
public static void main(String[] args) {
	List<String> l = new LinkedList();
	l.add("Rohan");
	l.add("Chetan");
	l.add("Rohit");
	l.add("Rahul");
	l.add("Yogi");
	
	List<String> l1 = new LinkedList();
	l1.add("Annu");
	l1.add("chaya");
	l1.add("Sarita");
	l1.add("Puja");
	l1.add("Priyanka");
	
	LinkedList<String> c = new LinkedList<String>();
	for(String e :l)
	c.add(l1.contains(e)?"Yes":"NO");
	System.out.println(c);
	}

	
}
