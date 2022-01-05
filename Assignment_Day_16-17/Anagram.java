public class Anagram {
	
	public static void main(String[] args) {
		
		Utility u = new Utility();
		
		//String str1 = "heart";
		
		//String str2 = "earth";
		
		//Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String 1:");
		
		String str1 = u.inputString();
		
		//String str1 = scan.nextLine();
		
		System.out.println("Enter the String 2:");
		
		String str2 = u.inputString();
		
		//String str2 = scan.nextLine();
		
		u.anagram(str1,str2);
	}

}
