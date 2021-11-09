package Collection_FIleLab;

import java.util.Scanner;

public class Q2_Armstrongnumber {
	public static void main(String[] args) {
		int sum =0 ;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int temp = n;
		while(n>0) {
			int r = n%10;
			sum = sum + (r *r *r);
			 n = n/10;	
		}
		if(sum == temp) {
			System.out.println("This is an armstrong number");
			
		}
		else {
			System.out.println("This is not an armstrong number");
		}
		
	}

}
