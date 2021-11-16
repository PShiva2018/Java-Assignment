package StringAssignment;

import java.util.Scanner;

public class Q3_CompareTwoStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size to stored the string");
		int s = sc.nextInt();
		String n[] = new String[s];
		
		for(int i = 0; i<s; i++) {
			System.out.println("Enter the string");
			n[i] = sc.next();
		}
		for(int i = 0; i< n.length-1;++i) {
			for(int j =i+1; j<s;++j) {
				if(n[i].compareTo(n[j])>0) {
					String temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
			}
		}
		System.out.println("After perfofrming Lexicographical order");
		for(int i =0;i<s;i++) {
			System.out.println(n[i]);
		}
		
		
	}
}
