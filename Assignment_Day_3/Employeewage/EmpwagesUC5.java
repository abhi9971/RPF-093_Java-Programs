public class EmpwagesUC5 {
//constants
     public static final int IS_PART_TIME =1;
     public static final int IS_FULL_TIME = 2;
     public static final int EMP_RATE_PER_HOUR = 20;
     public static final int NO_OF_WORKING_DAYS = 2;
	
    public static void main(String[] args) {
        int empHrs = 0;
        int totalempwage = 0;
	int eWage = 0;
	for (int day = 0; day < NO_OF_WORKING_DAYS; days++) {
	    double empcheck= Math.floor(Math.random() *10) % 3;
            switch ((int)empcheck){
                case IS_FULL_TIME:
                        empHrs=8;
                        break;
                case IS_PART_TIME:
                        empHrs=4;
                        break;
                default:
                        empHrs=0;

            }
        eWage = empHrs * EMP_RATE_PER_HOUR;
	totalempwage =totalempwage+ eWage;
        System.out.println("Emp WAge: " + eWage);
    }
	System.out.println("Total Emp WAge: " + totalempwage);
}
}

