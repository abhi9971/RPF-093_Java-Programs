public class InsertionSortString {
	
	public static void main(String[] args) {
		
		Utility u = new Utility();
		
		System.out.println("Enter the number of elements you want to insert:");
		
		int n = u.inputInteger();
		
		String arr[] = u.arrayString(n);
		
		int count = 0;
		
		System.out.println("Words Before sorting:");
		
		for(int i = 0; i < n ; i++) {
			
			System.out.println(arr[i]);
		}
		
		String sortedArray[] = u.sortSub(arr, arr.length);
		
		System.out.println();
		
		System.out.println("Words After sorting:");
		
		for(int i=0;i<sortedArray.length;i++) {
			
			System.out.println(sortedArray[i]);
		}
	}
}
