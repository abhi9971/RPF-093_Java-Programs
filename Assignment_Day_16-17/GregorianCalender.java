public class GregorianCalendar {

	public static void main(String[] args) {
		
		Utility u = new Utility();
		
                System.out.println("Enter the date in in the format of dd:mm:yyyy:");
		
		System.out.println("Enter the Day:(Sunday, Monday...etc)");
		
		String d = u.inputString();
		
		
		int day = Integer.parseInt(u.day(d));
		
		System.out.println("Enter the Month:(January , February.....December)");
		
		String m = u.inputString();
		
		int month = Integer.parseInt(u.month(m));
		
		System.out.println("Enter the Year:(yyyy)");
		
		int y = u.inputInteger();
		
		System.out.println(u.dayOfWeek(day,month,y));
	}

}
