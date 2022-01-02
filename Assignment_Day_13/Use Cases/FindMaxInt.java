public class FindMaxInt {
    
    public int maxValue(int val1, int val2, int val3) {
        
        int max = val1;
        
        if (val2 > max) {
            
            max = val2;
            
        } 
        
        if (val3 > max) {
            
            max = val3;
            
        }
        
        return max;
    }

    public static void main(String[] args) {
        
        System.out.println("*******welcome to generics code tested By JUnit***** ");
        
        FindMaxInt generics = new FindMaxInt();
        
        int val1 = 2, val2 =3, val3 = 4;
        
        int result =  generics.maxValue(val1,val2,val3);
        
        System.out.println("the max vale of "+val1+" "+val2+" "+ val3+ " is :: "+ result);
    }
}


