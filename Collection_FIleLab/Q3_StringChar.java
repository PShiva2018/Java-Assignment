package Collection_FIleLab;
//Q 3 write a program to print string character by character in each line
import java.util.Scanner;

public class Q3_StringChar {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		String  s  = sc.nextLine();
		
	for(int i = 0; i<s.length();i++) {
			System.out.println(s.charAt(i));
	}
		
	}

}
