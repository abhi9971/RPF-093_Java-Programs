import utility.utility;

import java.io.IOException;
import java.util.Scanner;

public class StockAccount {

    public static void main(String[] args) throws IOException {
        utility utility = new utility();
        Scanner sc = new Scanner(System.in);
        System.out.println("*********  welcome to stock accounts   *******");
        System.out.println("chose from below :");
        System.out.println("1-add account details\n2-buy share\n3-sell share (if you already have)\n4-check account.");

        System.out.print("Enter what you want to do :: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 :
                utility.addPerson();
                break;
            case 4 :
                utility.fileReader();
                break;
            case 2:
                utility.buyShare();
                break;
            case 3 :
                utility.sellShare();
                break;
            default:
                System.out.println("please select as per instructions ::: ");
        }

    }
}
