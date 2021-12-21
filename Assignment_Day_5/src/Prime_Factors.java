import java.util.Scanner;

public class Prime_Factors {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        number = sc.nextInt();

        for(int i = 2; i< number; i++) {
            while(number%i == 0) {
                System.out.println(i+" ");
                number = number/i;
            }
        }
      if(number >1) {
           System.out.println(number);
        }
    }
}

//oce we come out of the for loop if my no is not equal to 1
//then we have to enter the value of n