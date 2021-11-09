package Collection_FIleLab;

import java.util.HashMap;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

//Write a java code that store student name and rollno and check if particular rollno is their in hash map or not .If it is avaialbel print found else not found 
//Hint sample code in ppt 
	public class q8Store {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Chetan",25);
		hm.put("Tushar",26);
		hm.put("Pratik",27);
		hm.put("Vivek",28);
		hm.put("Syam",29);
		hm.put("amit",30);
	
		if(hm.containsKey("Roshani")) {
			System.out.println("found name  and roll no is "+hm.get("amit"));
		}
		else {
			System.out.println("Not found the name");
			
		}
		
		
	
		
	
	}
}
