import java.util.*; 
public class PartTimeEmployeeWageUC3 {

	public static void main(String[] args) {
		int isFullTime = 1;
		int isPartTime = 2;
		int wagePerHour = 20;
		int empHrs;
		int salary;
		double empCheck = Math.floor(Math.random() * 10)%3;         
		if (empCheck == isFullTime)
			empHrs = 8;		
		else if (empCheck == isPartTime)
			empHrs = 4;
		else
			empHrs=0;
		salary = wagePerHour * empHrs;
		System.out.println("salary"+salary);		
}
}

