public class BinarySearchString {
	
	public static void main(String[] args) {
		
	    Utility utility = new Utility();
		
	    System.out.print("Enter the number of words you want to insert ::");
		
	    int number = utility.inputInteger();
		
	    String listOfWords[] = utility.arrayString(number);
		
	    System.out.println("Enter the Key element:");
		
	    String stringToFind = utility.inputString();
		
	    int lowestIndex = 0;
		
	    int highestIndex = listOfWords.length-1;
		
	    int middleIndex = 0;
		
	    utility.binarySearchString(lowestIndex,highestIndex,middleIndex,listOfWords,stringToFind);
	}
}
