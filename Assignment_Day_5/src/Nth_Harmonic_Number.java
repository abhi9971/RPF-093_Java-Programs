import java.util.Scanner;

public class Nth_Harmonic_Number {
    public double Nth_Harmonic_Number(double n) {
        double i, sum = 0;
        for (i = 1; i <= n; i++) {
            sum += 1 / i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        double num=sc.nextDouble();
        Nth_Harmonic_Number obj=new Nth_Harmonic_Number();
        System.out.println(obj.Nth_Harmonic_Number(num));
    }}














