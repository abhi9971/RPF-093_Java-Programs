public class MaximumTest <T extends Comparable <T>> {

    T x, y, z;

    public MaximumTest(T x, T y, T z) {

        this.x = x;

        this.y = y;

        this.z = z;

    }

    public void printMax(){

        MaximumTest.printMax(x, y, z);
    }

    private static <T extends Comparable<T>> void printMax(T x, T y, T z) {

        if (x.compareTo(y) > 0 && x.compareTo(z) > 0) {

            System.out.println(x);

        } 
        
        else if (y.compareTo(x) > 0 && y.compareTo(z) > 0) {

            System.out.println(y);

        } 
        else {

            System.out.println(z);
            
        }

    }

    public static void main(String[] args) {

        Integer xInt  = 3, yInt =7, zInt =4;

        Float xFl = 3.3f, yFl = 4.4f, zFl =5.5f;

        String xStr = "Good", yStr = "Better", zStr = "Best";

        new MaximumTest(xInt, yInt, zInt).printMax();

        new MaximumTest(xFl, yFl, zFl).printMax();

        new MaximumTest(xStr, yStr, zStr).printMax();

    }
}
