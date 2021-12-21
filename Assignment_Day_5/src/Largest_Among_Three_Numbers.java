import java.util.Scanner;

public class Largest_Among_Three_Numbers {
    public static void main(String[] args) {
        int a,b,c,largest,temp;
        System.out.println("Enter the value of all three no:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        //comparing the value of a and b and store that value in temp variable
        temp=a>b?a:b;
        //compare the temp value with c and store the value in largest variable
        largest=c>temp?c:temp;
        System.out.println("The largest no is:"+largest);
    }
}
//variable_name = (expression) ? value if true:value if false