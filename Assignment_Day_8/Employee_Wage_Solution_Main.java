import java.util.Scanner;

public class Employee_Wage_Solution_Main {

	public static void main(String[] args) {
		Employee_Wage_Solution empWageBuilder = new Employee_Wage_Solution();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter wage per hour: ");
		int WagePerHr = sc.nextInt();
		System.out.print("Enter compny name: ");
		String name = sc.next();
		System.out.print("Enter total workin hr: ");
		int totalWorkingHr = sc.nextInt();
		System.out.print("Enter total working days: ");
		int totalDays = sc.nextInt();
		Employee_Wage_Solution.getMonthlyWageCompny(WagePerHr, name, totalWorkingHr, totalDays);
	}
}
