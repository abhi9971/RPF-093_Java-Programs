public class MonthlyPayment {

	public static void main(String[] args) {
		Utility  u = new Utility();
		System.out.println("Want to Know your monthly Payment Details?");
		System.out.println("Follow the below instructions:");
		System.out.println("Enter the Year:");
		int Y = u.inputInteger();
		System.out.println("Enter the Principal Loan Amount:");
		double P = u.inputDouble();
		System.out.println("Enter the Monthly Cent Interest:"); 
		double R = u.inputDouble();
		double res = u.monthlyPayment(Y,P,R);
		System.out.println("Your Monthly Payment with year: "+Y+" Principal Loan Amount: "+P+" Interest "+R+" ");
		System.out.println("Total Amount: "+res);
	}
}
