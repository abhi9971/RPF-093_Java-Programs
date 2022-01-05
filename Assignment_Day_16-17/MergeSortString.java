public class MergeSortString {

	public static void main(String[] args) 
	{
		Utility u=new Utility();
		
		try {
			
		      do {
			      
			   System.out.println();
			      
			   System.out.println("Enter the number of words yo want to insert: ");
			      
			   int n = u.inputInteger();
			      
			   if(n >= 2) {
				   
			       String array[] =  u.arrayString(n);
					    
			       System.out.println("Words Before sorting:");
				   
			       System.out.println();
				   
			       u.print1DStringArray(array);
				   
			       System.out.println();
				   
	            	       System.out.println("Words After Sorting:");
				   
		               System.out.println();
				   
			       String[] sortedArray = u.mergeSort(array);
				   
			       u.print1DStringArray(sortedArray);
			   }
			      
			   else if(n == 1) {
						
				System.out.println("Enter the Word:");
				   
				String str = u.inputString();
				   
				System.out.println("'"+str+"' is already in Sorted Order");
				   
			   }
			      
			   else {
				   System.out.println("Nothing is Inserted!!");
			   }
			      
			}
			
			while(true);
			
		}
		
		catch(Exception e) {
			
			System.out.println("Invalid input "+e);
			
		}
	}
}

