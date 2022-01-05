public class PrimeNumber {

	public static void main(String[] args) {
		
		Utility u = new Utility();
		
		System.out.println("Enter the number:");
		
	    int x = u.inputInteger();
		
	    System.out.println(u.primeNumber(x));
		
	}
}
