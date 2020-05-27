import java.util.*; 
public class SwitchStatementUC4 {

	        public static final int isFullTime = 1;
                public static final int isPartTime = 2;

	public static void main(String[] args) {
		int wagePerHour = 20;
		int empHrs;
		int salary;
		int empCheck = (int)Math.floor(Math.random() * 10)%3;         
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
		System.out.println("salary"+salary);
		}
}

