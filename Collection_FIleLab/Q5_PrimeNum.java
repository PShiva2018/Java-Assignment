package Collection_FIleLab;

import java.util.Scanner;

public class Q5_PrimeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n; 
		System.out.println("Enter the num");
		n = sc.nextInt();
		int flag = 0;
		for(int i = 2;i<n;i++) {
			if(n%i ==0) {
				flag =1;
				break;
			}
		}
		if(flag == 1) {
			System.out.println("Not prime number");
		}
		else {
			System.out.println("prime number");
		}
	}

}
