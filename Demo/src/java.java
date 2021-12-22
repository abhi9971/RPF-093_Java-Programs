import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter all  values of p,num");
        int num=sc.nextInt();
        for(int i=num;i<=10;i++){
            int sum=num*i;
            System.out.println(sum);
        }



    }
}