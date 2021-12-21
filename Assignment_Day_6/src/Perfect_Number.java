import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        int n;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        for(int i=1; i<n;i++){
            if(n%i==0){
                sum=sum+i;
                System.out.println(sum);
            }
        }
        if(sum==n){
            System.out.println("enter no is perfect ");
        }
        else
            System.out.println("Enter no is not perfect");
    }
}
