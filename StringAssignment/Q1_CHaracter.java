package StringAssignment;

import java.util.Scanner;

public class Q1_CHaracter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String n = sc.next();
		
		
		System.out.println(n.indexOf(0));
		System.out.println("Which character");
		String c = sc.next();
		System.out.println(n.indexOf(c));
		System.out.println("Enter the replace String old and new");
		String r = sc.next();
		String c1 = sc.next();
		System.out.println(n.replace(r, c1));

	}

}
