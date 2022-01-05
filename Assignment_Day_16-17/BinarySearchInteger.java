public class BinarySearchInteger {

	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("Enter the number of elements Do you want insert?:");
		int n = u.inputInteger();
		int a[] = u.arrayInt(n);
		System.out.println("Enter the Key element you want to Search:");
		int key = u.inputInteger();
		int last = a.length-1;  
		u.binarySearchInteger(a,0,last,key); 
	}
}
