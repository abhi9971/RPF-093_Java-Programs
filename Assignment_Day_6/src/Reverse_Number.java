import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        int n;
        int rem=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number");
        n=sc.nextInt();
        while(n!=0){
            rem=rem*10;
            rem=rem+n%10;
            n=n/10;
        }
        System.out.println(rem);
    }
}
