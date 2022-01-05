public class TakeMoreThanThreeParameter<T extends Comparable<T>> {
    
    public static <T extends  Comparable <T>>  T maximumValue( T val1 , T val2, T val3 ,T val4,T val5) {
        
        T max = val1;
        
        if (val2.compareTo(max) > 0 ) {
            
            max = val2;
            
        } 
        
        if (val3.compareTo(max) > 0) {
            
            max = val3;
            
        }
        
        if (val4.compareTo(max) > 0 ) {
            
            max = val4;
            
        }
        
        if (val5.compareTo(max) > 0) {
            
            max = val5;
            
        }
        
        return max;
    }

    public static void main(String[] args) {
        
        System.out.println("*******welcome to generics code tested By JUnit***** ");

        TakeMoreThanThreeParameter generics = new TakeMoreThanThreeParameter();
        
        System.out.println( "The maximum value is :: "+maximumValue(2.5f,3.5f,4.5f,5.5f,6.5f));

    }
}
