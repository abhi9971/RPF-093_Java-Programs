public class FindMaxUsingGenericsUC5<T extends Comparable<T>> {

    T val1,val2,val3,val4,val5;

    public FindMaxUsingGenericsUC5(T val1, T val2, T val3, T val4, T val5) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
        this.val4 = val4;
        this.val5 = val5;
    }
    public T maximumValue(){
        return maximumValue(val1,val2,val3,val4,val5);

    }

    public static <T extends  Comparable <T>>  T maximumValue(T val1 , T val2, T val3 , T val4, T val5) {
        T max = val1;
        if (val2.compareTo(max) > 0 ) {
            max = val2;
        } if (val3.compareTo(max) > 0){
            max = val3;
        }if (val4.compareTo(max) > 0 ){
            max = val4;
        }if (val5.compareTo(max) > 0){
            max = val5;

        }
        printMax(val1,val2,val3,max);
        return max;
    }

    private static <T> void  printMax(T val1, T val2, T val3, T max) {
        System.out.println("the maximum of" +val1+","+val2+" & " + val3+ " is :: " + max );
    }

    public static void main(String[] args) {
        System.out.println("*******welcome to generics code tested By JUnit***** ");
        maximumValue(2,3,4,5,6);
        maximumValue(3.5f,4.7f,1.2f,6.8f,5.5f);
        new FindMaxUsingGenericsUC5<>(3,4,5,6,7).maximumValue();

    }
}