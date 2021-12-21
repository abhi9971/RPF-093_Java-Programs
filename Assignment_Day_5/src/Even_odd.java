import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter an integer number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num % 2==0)
            System.out.println("No is even");
        else
            System.out.println("No is odd");
    }
}
