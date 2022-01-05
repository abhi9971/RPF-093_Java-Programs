public class FindNumber {
	
	public static String s,f,t,r;
	
	public static void main(String[] args) {
		
		int choice = 0;
		
		do {
			
			System.out.println("Enter the Range  (N) :");
			
			Utility u= new Utility();
			
			int num =u.inputInteger();
			
			u.find(0,num-1);
			
			System.out.println("press 1 to continue");
			
			choice = u.inputInteger();
		} 
		while(choice == 1);	
	}
}
