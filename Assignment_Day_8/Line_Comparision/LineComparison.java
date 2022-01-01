import java.util.Scanner;
public class LineComparison {

    public static void main(String[] args) {
        GetInput input = new GetInput();
        input.getInput();
        CalculateLength cal = new CalculateLength();
        cal.calLength();
        CompareLength compare = new CompareLength();
        compare.checkEquality();
    }
}

class GetInput{
    public static int x1,x2,y1,y2,x3,x4,y3,y4;
    public  void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("For given line");
        System.out.println("Enter co-ordinates of x1 and y1");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter co-ordinates of x2 and y2");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.println("For second line");
        System.out.println("Enter co-ordinates of x3 and y3");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        System.out.println("Enter co-ordinates of x4 and y4");
        x4 = sc.nextInt();
        y4 = sc.nextInt();
    }
}

class CalculateLength{
    static Double length1,length2;
    public void calLength() {
        length1 = Math.sqrt((GetInput.x2 - GetInput.x1) * (GetInput.x2 - GetInput.x1) + (GetInput.y2 - GetInput.y1) * (GetInput.y2 - GetInput.y1));
        System.out.println("Length of first line = "+length1+" units");
        length2 = Math.sqrt((GetInput.x4 - GetInput.x3) * (GetInput.x4 - GetInput.x3) + (GetInput.y4 - GetInput.y3) * (GetInput.y4 - GetInput.y3));
        System.out.println("Length of second line = "+length2+" units");
    }
}

class CompareLength{
    public  void checkEquality() {
        if(CalculateLength.length1.compareTo(CalculateLength.length2) == 1) {
            System.out.println("Line1 is greater than line2 in length");
        }

        else if (CalculateLength.length1.compareTo(CalculateLength.length2) == -1) {
            System.out.println("Line1 is less than line2 in length");
        }

        else {
            System.out.println("Both lines are EQUAL in length");
        }
    }
}