package CollectionLab2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

//Q4 Imagine that your class is going to be used in a help desk application that needs to prioritize outstanding issues that have to be resolved by help desk staff.  
//Create a class named Ticket that represents an issue.  
//The Ticket should have an ID number (a 5 digit number), a description of the problem, and a priority (a positive integer). 
class Ticket {
	String name;
	int idnum;
	int pirority;

	public Ticket(String name, int idnum, int pirority) {
		super();
		this.name = name;
		this.idnum = idnum;
		this.pirority = pirority;
	}

	@Override
	public String toString() {
		return "Ticket [name=" + name + ", idnum=" + idnum + ", pirority=" + pirority + "]";
	}
}

class TicCompare implements Comparator<Ticket> {
	@Override
	public int compare(Ticket o1, Ticket o2) {

		return o1.pirority - o2.pirority;
	}
}

public class Q4_helpPirotize {
	public static void main(String[] args) {
		TicCompare t = new TicCompare();
		PriorityQueue q = new PriorityQueue(t);
		q.add(new Ticket("Electricity", 12345, 2));
		q.add(new Ticket("Computer is not Start", 12546, 3));
		q.add(new Ticket("Internet Availability", 34567, 4));
		q.add(new Ticket("Fire Alarm", 44589, 1));
		q.add(new Ticket("AC Repair", 54598, 5));

//		System.out.println(q.poll());
//		System.out.println(q.poll());
//		System.out.println(q.poll());
//		System.out.println(q.poll());
//		System.out.println(q.poll());
		Iterator i = q.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		}
	}
