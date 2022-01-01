import java.util.Scanner;

public class Quotient_And_Reminder {
    
    public static void main(String[] args) {
        
        int num1,num2,quotient,remainder;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of num1 and num2");
        num1=sc.nextInt();
        num2= sc.nextInt();
        remainder=num1%num2;
        quotient=num1/num2;
        
        System.out.println("The quotient are:"+ quotient);
        System.out.println("The remainder are:"+ remainder);
    }
}
