package Collection_FIleLab;
//Q 4 Write a java code to count evene numbers from given array 

public class Q4_countEvenNumber {
	public static void main(String[] args) {
		int arr[] = {2,5,6,7,8,9,10,12,13,81,47};
		int odd = 0;
		int even =0;
		
		for(int i =0; i< arr.length;i++) {
			if(arr[i]%2 == 0) {					
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Count of Even number ="+even);
		System.out.println("Count of Odd number = " + odd);
		
		
	}

}
