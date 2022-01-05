public class Generics<T extends Comparable<T>> {

    public static <T extends Comparable<T>> T maximumValue(T val1, T val2, T val3) {

        T max = val1;

        if (val2.compareTo(max) > 0) {

            max = val2;

        }
        if (val3.compareTo(max) > 0) {

            max = val3;

        }

        System.out.println("maximum value is " + max);

        return max;

    }

    public static void main(String[] args) {

        System.out.println("*******welcome to generics code tested By JUnit***** ");

        Generics generics = new Generics();

        generics.maximumValue(4.5f, 5.6f, 7.2f);
    }
}
