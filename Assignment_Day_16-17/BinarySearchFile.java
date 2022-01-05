public class BinarySearchFile {

	public static void main(String[] args) throws Exception {
		
		Utility u=new Utility();
		
		System.out.println("Enter the number of words yo want to insert: ");
		
		int arraySize1=u.inputInteger();
		
		String b[]=u.arrayString(arraySize1);
		
		u.sortSub(b, arraySize1);					//sorting the array
		
		System.out.println();	
		
		System.out.println("The Sorted Order is: ");
		
		String str  = u.print1DStringArray(b);						//printing the sorted array
		
		System.out.println();
		
		u.wordsArrayFromStatement(str);
		
		System.out.println("Enter the file name:");
		
		String file = u.inputString();
		
		u.writeToFile(str,file);
		
		System.out.println("Enter Key: ");
		
		String key = u.inputString();
		
		int p=u.binarySearchString1(b,key);

		if(p==-1) {
			
			System.out.println();
			
			System.out.println("Not Found");
		}
		
		else {
			
			System.out.println();
			
			System.out.println("Element Found ");
		}	
	}
}
