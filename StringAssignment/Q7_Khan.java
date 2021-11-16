package StringAssignment;

import java.util.Scanner;

public class Q7_Khan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String name = sc.nextLine();
		//String name = "my name is khan";
		
		StringBuilder s = new StringBuilder();
		String str[] = name.split("\\s");
		
	for(int i = str.length-1; i>=0;i--) {
		s.append(str[i]);
		s.append(" ");
	}
	System.out.println(s);
	}

}
