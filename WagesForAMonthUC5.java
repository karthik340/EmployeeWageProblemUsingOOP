import java.util.*; 
public class WagesForAMonthUC5 {
		public static final int isFullTime = 1;
		public static final int isPartTime = 2;
	public static void main(String[] args) {
		
		int wagePerHour = 20;
		int empHrs;
		int salary;
		int totalSalary=0;
		int numWorkingDays=20;
		int empCheck;
		for(int day=1;day<=numWorkingDays;day++)
		{
			empCheck =(int) Math.floor(Math.random() * 10)%3;         
			switch(empCheck)
		        {
		        	case isFullTime:
					empHrs=8;
					break;
				case isPartTime:
					empHrs=4;
					break;
				default:
					empHrs=0;
					break;
		        }
			salary = wagePerHour * empHrs;
			totalSalary+=salary;
		}
			System.out.println("salary"+totalSalary);
		}
}
