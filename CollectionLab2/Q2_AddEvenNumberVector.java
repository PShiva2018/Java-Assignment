package CollectionLab2;
	//Write a java program to add even numbers from 1 to 20 in vector 
import java.util.Scanner;
import java.util.Vector;

public class Q2_AddEvenNumberVector {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n = sc.nextInt();
		Vector<Integer> v = new Vector<Integer>(); 
		 for(int i = 1; i <= n; i++)
		 { 
		  if(i % 2 == 0)
		  { 
		    v.add(i); 
		    System.out.println(i); 
		   } 

	}
	}}
