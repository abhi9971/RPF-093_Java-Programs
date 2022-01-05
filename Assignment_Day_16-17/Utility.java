import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class Utility {
	public static BufferedReader bufferedReader;
	StringTokenizer st;
	public static Scanner scan = new Scanner(System.in);

	public  Utility() {
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//Scanner scan = new Scanner(System.in);
	}
	public static void primePalindrome(int arr[], int n) {
		int flag = 0; 
		  
        // Loop till array size n/2. 
        for (int i = 0; i <= n / 2 && n != 0; i++) { 
  
            // Check if first and last element are different 
            // Then set flag to 1. 
            if (arr[i] != arr[n - i - 1]) { 
                flag = 1; 
                break; 
            } 
        } 
        if (flag == 1) 
            System.out.println("Not Palindrome"); 
        else
            System.out.println("Palindrome"); ;
	}
	
	public static ArrayList<Integer> primeNumber(int x) {
//		int n = num;
//	    int i = 0;
//	    String primeNumbers = "";
//	    if( (n >= 0) && (n <= 1000))
//	    {
//		    for (i = 1; i <= n; i++)
//      		    {
//			  int counter=0;
//			  for(num =i; num>=1; num--)
//			  {
//			     if(i%num==0)
//			     {
//		 		counter = counter + 1;
//			     }
//			  }
//			  if (counter == 2)
//			  {
//			     //Appended the Prime number to the String
//			     //primeNumbers = primeNumbers + i + " ";
//			  }
//       		    }
//	       return primeNumbers[i]);
//	    }
		
		ArrayList<Integer> alist = new ArrayList<Integer>();

        for (int i = 2; i<=x; i++){

            alist.add(i);
        }
        //System.out.println(alist);

	for(int i = 2; i<=alist.size()-1; i++){
                    if (!isPrime(alist.get(i))){
                        alist.remove(alist.get(i));
                        i--;
                    }
                }
       // System.out.println(alist);
        return alist;
    }

    public static boolean isPrime(int x){
        boolean itIs = true;
        for (int i = 2; i < x-1; i++){
            if(x%(i) == 0){
                itIs = false;  
            }
        }
        return itIs;
    }
	
	
	public static void anagram(String str1, String str2) {
		int len, len1, len2, i, j, found=0, not_found=0;
		len1 = str1.length(); 
		len2 = str2.length();
		if(len1 == len2) {
            len = len1;
            for(i=0; i<len; i++) {
                found = 0;
                for(j=0; j<len; j++) {
                    if(str1.charAt(i) == str2.charAt(j)) {
                        found = 1;
                        break;
                    }
                }
                if(found == 0) {
                    not_found = 1;
                    break;
                }
            }
            if(not_found == 1) {
                System.out.println(str1 +" and "+ str2 +" are not Anagram");
            } else {
                System.out.println(str1 +" and "+ str2 +" are Anagram");
            }
        } else {
            System.out.println("Both "+str1 +" and "+ str2 +" Must have the same number of Character to be an Anagram");
        }
	}
	
	public static void anagramPalindrome(String str1, String str2) {

        int n = str1.length();

        for(int i = n - 1; i >= 0; i--) {

            str2 = str2 + str1.charAt(i);

        }
		int len1, len2;
		len1 = str1.length(); 
		len2 = str2.length();
		if(len1 == len2) {
	        if(str1.equalsIgnoreCase(str2)) {
	            System.out.println("The string is palindrome.");
	        } else {
	            System.out.println("The string is not palindrome.");
	        }
        } else { System.out.println("Both "+str1 +" and "+ str2 +" Must have the same number of Character to be an Anagram");
        }
		elapsedTime();
	}
	
	public static void binarySearchInteger(int arr[], int first, int last, int key) {
		   int mid = (first + last)/2;  
		   while( first <= last ) {
			   if ( arr[mid] < key ) {
				first = mid + 1;     
			   }
			   else if ( arr[mid] == key ) {
				System.out.println("Element is found at index: " + mid);  
				break;  
			  }
			  else {
				 last = mid - 1;  
			  }  
			      mid = (first + last)/2;  
		  }  
		  if ( first > last ) {
		      System.out.println("Element is not found!");  
		  }
		  elapsedTime();
	 } 
	
	public static void binarySearchString(int lowestIndex,int highestIndex,int middleIndex,String listOfWords[],String stringToFind) {
		while(lowestIndex<=highestIndex) {
			middleIndex = (lowestIndex+highestIndex)/2;

			if(stringToFind.compareTo(listOfWords[middleIndex]) > 0) {
			    lowestIndex = middleIndex+1;
			}
			else if(stringToFind.compareTo(listOfWords[middleIndex]) < 0) {
			    highestIndex = middleIndex - 1;
			}
			else {
			    break;
			}
	    }

	    if(lowestIndex > highestIndex) {
		System.out.println("Word\t'"+ stringToFind +"'not found in the array!!!");
	    }
	    else {
		System.out.println("Word\t'"+ stringToFind +"' found at " + middleIndex);
	    }
	    elapsedTime();
	}
	
	public static String inputString(){
		try{
			return bufferedReader.readLine();
		} catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		return "";
	}
	
	public static void insertionSortInteger(int arr[]) {
		int n = arr.length;  
		
		for (int i = 1; i < n; i++) {
		  //  System.out.println("Sort Pass Number "+(i));
		    int key = arr[i];  
		    int j = i-1;  
		    
		    while ( (j > -1) && ( arr [j] > key ) ) 
		    {  
		    //	System.out.println("Comparing "+ key  + " and " + arr [j]); 
		        arr [j+1] = arr [j];  
		        j--;  
		    }  
		    arr[j+1] = key; 
		    //System.out.println("Swapping Elements: New Array After Swap");
		    //printArray(arr);
        }
		elapsedTime();
	}
	
	public static void printStringArray(String[] array) {
	    for(int i=0; i < array.length; i++) {
			System.out.println(array[i] + " ");  
		} 
	    System.out.println();
	    
	}
	
	public static void printArray(int[] array) {
	    for(int i=0; i < array.length; i++) {
			System.out.println(array[i] + " ");  
		} 
	    System.out.println();
	}
	
	public static String[] sortSub(String array[], int f) {
		String temp="";
		for(int i = 0;i < f;i++) {
			for(int j=i+1;j<f;j++) {
				if(array[i].compareToIgnoreCase(array[j])>0) {
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		elapsedTime();
		return array;
		
	}
	
	public String[] insertionSortString(String words[]){
		String temp;
		for(int i=1;i<words.length;i++){
			for(int j=i;j>0;j--){
				if(words[j].compareTo(words[j-1])<0){
					temp=words[j];
					words[j]=words[j-1];
					words[j-1]=temp;
				}
				else
					break;
			}
		}
		return words;
	}
	
	 public static void bubbleSortInteger(int[] arr) {
		 int n = arr.length;
		 int temp = 0;
		 for(int i=0; i < n; i++) {
			 for(int j=1; j < (n-i); j++) {
				 if(arr[j-1] > arr[j]) {
					 //swap elements
					 temp = arr[j-1];
					 arr[j-1] = arr[j];
					 arr[j] = temp;
				 }

			 }
		 }
		 elapsedTime();
	  }
	 
	 public static void bubbleSortString(String[] str) {
		// long s = startTime();
		 String temp;
			System.out.println("Words After Sorting:");
			for (int j = 0; j < str.length; j++) {
		   	   for (int i = j + 1; i < str.length; i++) {
				   if (str[i].compareTo(str[j]) < 0) {
					   temp = str[j];
					   str[j] = str[i];
					   str[i] = temp;
				   }
		   	   }
			 System.out.println(str[j]); 
			}
			elapsedTime();
	 }
	
	 public static void find(int low,int up) {
		 if(low==up) {
			 System.out.println("Your number is : "+low);
			 System.out.println("Intermediary numbers is "+(low-1)+" and "+(low+1));
			 return;
		 }
		 //Finding middle value between range low and up
		 int mid=(low+up)/2;
		 int ch;
		 System.out.println("Press 1 : "+low+" - "+mid);
		 System.out.println("Press 2 : "+(mid+1)+" - "+up);
		 ch=inputInteger();
		 //Number is in first half
		 if(ch==1) {
			 find(low,mid);
		 }
		 //Number is in second half
		 else {

			 find(mid+1,up);
		 }
	 }
	 
	public static  int inputInteger(){
		try{
			try{	
				return Integer.parseInt(bufferedReader.readLine());
			} catch(NumberFormatException nfe){
				System.out.println(nfe.getMessage());	
			}
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		return 0;
	}

	public static void elapsedTime() {
		long start, end;
		start = System.currentTimeMillis(); // get starting time
//		    for (int i = 0; i < 9999999; i++) ;
		end = System.currentTimeMillis(); // get ending time
		System.out.println();
		System.out.println("Elapsed time: " + (end - start) +" Milli Sec");
	}
	public static double inputDouble(){
		try{
			try{	
				return Double.parseDouble(bufferedReader.readLine());
			}
			catch(NumberFormatException nfe){
				System.out.println(nfe.getMessage());	
			}
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		return 0.0;
	}
	
//	public static long  startTime()
//	{
//		long startTime = System.currentTimeNano();
//		return startTime;
//	}
	
//	public static long endTime()
//	{
//		long endTime = System.currentTimeMillis();
//		return endTime;
//	}
	
//	public static long elapsedTime(long startTime,long endTime)
//	{	
//		startTime = startTime();
//		endTime = endTime();
//		long timeElapsed = endTime -startTime;
//		//System.out.println("Time elapsed from Start to Stop is: " + (timeElapsed/1000) + " Sec");
//		return timeElapsed;
//	}
	public static int binarySearchString1(String[] names, String key) {
    	int first = 0;
    	int last  = names.length;
 
    	while (first < last) {
        	int mid = (first + last) / 2;
        	if (key.compareTo(names[mid]) < 0) {
           			last = mid;
        	} else if (key.compareTo(names[mid]) > 0) {
            		first = mid + 1;
        	} else {
            		return mid;
        	}
    	}		
    	return -1;
	}
	
	public static String[] mergeSort(String[] list) {
		String [] sorted = new String[list.length];
		if (list.length == 1) {
		    sorted = list;
		} 
		else {
		    int mid = list.length/2;
		    String[] left = null; 
		    String[] right = null;
		    if ((list.length % 2) == 0) {
		        left = new String[list.length/2];
		        right = new String[list.length/2];
		    } 
		    else {
		        left = new String[list.length/2];
		        right = new String[(list.length/2)+1];
		    }
		    int x=0;
		    int y=0;
		    for ( ; x < mid; x++) {
		        left[x] = list[x];
		    }
		    for ( ; x < list.length; x++) {
		        right[y++] = list[x];
		    }
		    left = mergeSort(left);
		    right = mergeSort(right);
		    sorted = mergeArray(left,right);
		}

		return sorted;
	}
	
	private static String[] mergeArray(String[] left, String[] right) {
		String[] merged = new String[left.length+right.length];
		int lIndex = 0;
		int rIndex = 0;
		int mIndex = 0;
		int comp = 0;
		while (lIndex < left.length || rIndex < right.length) {
		    if (lIndex == left.length) {
		        merged[mIndex++] = right[rIndex++];
		    } 
		    else if (rIndex == right.length) {
		        merged[mIndex++] = left[lIndex++];
		    } 
		    else {
		        comp = left[lIndex].compareTo(right[rIndex]);
		        if (comp > 0) {
		            merged[mIndex++] = right[rIndex++];
		        } 
			else if (comp < 0) {
		            merged[mIndex++] = left[lIndex++];
		        } 
			else {
		            merged[mIndex++] = left[lIndex++];
		        }
		    }   
		}
		return merged;
	}
	
	public static int[][] arrayInt(int m,int n) {
		int a[][]=new int[m][n]; 
		System.out.println();
		System.out.println("Integer Array");

		for(int i = 0; i<m; i++) {
			for (int j = 0; j<n; j++) {
				a[i][j] = inputInteger();
			}   
		}
		return a;
	}

	public static double[][] arrayDouble(int m,int n) {
		double b[][]=new double[m][n];
		System.out.println();
		System.out.println("Double Array");

		for(int i = 0; i<m; i++) {
			for (int j = 0; j<n; j++) {
				b[i][j] = inputDouble();
			}   
		}
		return b;
	 }

	public static String[][] arrayBoolean(int m,int n) {
		String c[][]=new String[m][n];
		//Utility u=new Utility();    
		System.out.println();
		System.out.println("Boolean Array");

		for(int i = 0; i<m; i++) {
			for (int j = 0; j<n; j++) {
				c[i][j] = inputString();
			}   
		}
		return c;
	}
	
	public static String[] arrayString(int number) {
		String c [] = new String[number];
		//Utility u=new Utility();    
		//System.out.println();
		//System.out.println("Boolean Array");
		System.out.println("Enter the Words:");
		for(int i = 0; i<number; i++) {
			c[i] = inputString(); 
		}
		return c;
	}
	
	public static int[] arrayInt(int n) {
		int a[] =  new int[n];
		System.out.println("Enter the elements:");
		for(int i = 0; i < n ; i++)
			a[i] = scan.nextInt();
		return a;
	}
	
	
	public String getFileText(String fileName) {
		try {
			bufferedReader =new BufferedReader(new FileReader(fileName));
			StringBuilder sb=new StringBuilder();
			String line= bufferedReader.readLine();
			while(line!=null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line= bufferedReader.readLine();
			}
			return sb.toString();
		} catch(Exception e) {
			return null;
		} finally {
			try {
				bufferedReader.close();
			}
			catch(IOException ioe) {
			}	
		}
	}
	
	//this function take two parameter 
	// 1 what data to write.
	// 2 file name
	public void writeToFile(String data,String fileName)throws Exception {
		File file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter writer = new FileWriter(file); 
		// Writes the content to the file
		writer.write(data); 
		writer.flush();
		writer.close();
	}
	
	public String[] wordsArrayFromStatement(String statement){	
		st=new StringTokenizer(statement," ");
		String words[]=new String[st.countTokens()];
		int i=0;
		while(st.hasMoreTokens()){
			words[i]=st.nextToken();
			i++;
		}
		return words;
	}
	
	public void print1DArray(int array[]) {
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	
	//print 1D array String
	public String print1DStringArray(String array[]) {
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
		String str = Arrays.toString(array);
        str = str.substring(1, str.length()-1);
        //System.out.println(str);
		return str;
	}
	
	
	static int i=0;
	public static int total=0;

	//Initialization of New Array
	static int[] notes = { 1000,500,100,50,10,5,2,1};
	static int money;

	// Function for Calculating the notes
	public static  int calculate(int money,int[]notes, int i) {
		
		int rem;
		if(money==0) {
			return -1 ;
		}
		else {
			if(money>=notes[i]) {
				// logic for Calculating The notes
				int calNotes = money/notes[i];
				rem = money%notes[i];
				money = rem;
				total += calNotes;
				System.out.println(notes[i]  +" Notes =\t" +calNotes );
			}
			i++;

			return calculate(money, notes, i);

		}
	}
	
	public static String day(String d) {
		switch(d) {
			case "Sunday": System.out.println("0");
				d = "0" ;
				break;
			case "Monday":
				d = "1" ;System.out.println("1");
				break;
			case "Tuesday":
				d = "2" ;System.out.println("2");
				break;
			case "Wednesday":
				d = "3" ;System.out.println("3");
				break;
			case "Thursday": System.out.println("4");
				d = "4";
				break;
			case "Friday": System.out.println("5");
				d = "5";
				break;
			case "Saturday": System.out.println("6");
				d = "6";
				break;
			default : System.out.println("Enter the Day of the week in a Valid Manner:('ex' Sun, Mon ...");
		}
		return String.valueOf(d);
	}

	public static String month(String m) {
		switch(m) {
			case "January":  System.out.println("0");
				m = "0";
				break;

			case "February":  System.out.println("1");
				m = "1";
				break;

			case "March":  System.out.println("2");
				m = "2";
				break;

			case "April":  System.out.println("3");
				m = "3";
				break;

			case "May":  System.out.println("4");
				m = "4";
				break;

			case "June":  System.out.println("5");
				m = "5";
				break;

			case "July":  System.out.println("6");
				m = "6";
				break;

			case "August":  m = "7";
				System.out.println("07");
				break;

			case "September":  System.out.println("08");
				m = "8";
				break;

			case "October":  System.out.println("09");
				m = "9";
				break;

			case "November":  System.out.println("10");
				m = "10";
				break;

			case "December":  System.out.println("11");
				m = "11";
				break;

			default : System.out.println("Enter the Day of the week in a Valid Manner:('ex' Sunday, Monday ...");
		}
		return String.valueOf(m);
	}

	public static int dayOfWeek(int y,int m,int d) {
		int y0 = y-(14-m )/12;
		System.out.println(y0);
		int x = y0+(y0/4)-(y0/100)+(y0/400);
		System.out.println(x);
		int m0 = m+12*((14-m)/12)-2;
		System.out.println(m0);
		int d0 = (d+x+31*m0/12)%7;
		System.out.println(d0);
		return d0;
	}

	public static void temperatureConvertor(double Answer2,boolean in,int storage,boolean errorCheck) {
		if(storage == 1) {
			Answer2 -= 32;
			Answer2 *= 5/9.0;
			System.out.println("It is " + Answer2 + " Degrees in Celcius.");
		}

		if(storage == 2) {
			Answer2 *= 9.0/5;
			Answer2 += 32;
			System.out.println("It is " + Answer2 + " Degrees in Fahrenheit.");
		}

		System.out.println("Would you like to convert another temperature?");

		while(true) {
			String retry = inputString().trim().toLowerCase();
			if (retry.equals("y")) {
				errorCheck = true;
				break;
			}
			else if (retry.equals("n")) {
				in = false;
				break;
			}
			else {
				System.out.println("Please answer y/n");
			}
		}
	}

	public static double monthlyPayment(int Y,double P,double R) {
		double n;
		n = 12*Y;
		double r = (R/(12*100));
		double denominator = (1 - (Math.pow((1+r), (-n))));
		double numerator = P * r;
		double payment = (numerator / denominator);
		return payment;
	}

	public static void squareRoot(double c,double epsilon ) {
		double t = c;

		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}
		System.out.println();

		System.out.println("Square Root of the number:' "+ c +" ' with Newton's Formula is ' "+t+" '");
	}

}
