package StringAssignment;

import java.util.Scanner;

public class Q5_Containssame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first String");
		String s1 = sc.next();
		
		System.out.println("Enter the second String");
		String s2= sc.next();
		
		if(s1.contains(s2)) {
			System.out.println("Both Contain same data");
		}
		else {
			System.out.println("Different COntain Data");
		}
		
	}

}
