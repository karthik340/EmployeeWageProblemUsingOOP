import java.util.*; 
public class WagesTillAConditionIsReachedUC6 {
		public static final int isFullTime = 1;
		public static final int isPartTime = 2;
	public static void main(String[] args) {
		
		int wagePerHour = 20;
		int empHrs;
		int totalSalary=0;
		int numWorkingDays=20;
		int totalWorkingDays=0;
		int totalEmpHrs=0;
		int maxHrsInMonth=100;
		int empCheck;
		while(totalWorkingDays<=numWorkingDays && totalEmpHrs<=maxHrsInMonth)
		{
			totalWorkingDays++;
			empCheck = (int)Math.floor(Math.random() * 10)%3;         
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
		        totalEmpHrs+=empHrs;
			
		}
		totalSalary=wagePerHour * totalEmpHrs;
		System.out.println("total salary = "+totalSalary);
		}
}


