package StringAssignment;

import java.util.Scanner;

public class Q8_ExpectedOutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the strings");
		String name =sc.nextLine();
		String words[] = name.split("\\s");
		String newString="";
		StringBuilder b =new StringBuilder();
		
		for(String w:words) {
		String str1 = w.substring(0, 1);
		String rem =w.substring(1);
		newString += str1.toUpperCase()+ rem+ " ";
	
		}
		System.out.println(newString.trim());
	}

}
