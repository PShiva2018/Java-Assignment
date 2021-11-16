package StringAssignment;

import java.util.Scanner;

public class Q4_compare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1 = sc.next();
		
		System.out.println("Enter the second String");
		String s2= sc.next();

		int l = s1.compareTo(s2);
		
		if(l < 0) {
			System.out.println("String 1 is greater");
		}
		else if (l > 0) {
			System.out.println("String 2 is greater");
		}
		else {
			System.out.println("String 1  and String 2 is equal");
			
		}
		
	}
}
