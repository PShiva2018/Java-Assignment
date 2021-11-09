package Collection_FIleLab;


public class Q6_Add {
	void add(int ...y) {
		 int sum =0;
		 for(int u :y) {
			 sum += u;
			 System.out.println(sum);
		 }
	}
		 void add2(String ...y){
			 for(String  u:y) {
				 System.out.println(u.charAt(0));
			 }
	}
		 public static void main(String[] args) {
			 Q6_Add  a = new Q6_Add();
			 a.add(25);
			 a.add2("priya", "riya");
			 a.add();
			 
		}

}
