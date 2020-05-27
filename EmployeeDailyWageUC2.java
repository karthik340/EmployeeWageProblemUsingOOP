import java.util.*; 
public class EmployeeDailyWageUC2 {

	public static void main(String[] args) {
		int isPresent = 1;
		int wagePerHour = 20;
		int empHrs=8;
		int salary;
		double empCheck = Math.floor(Math.random() * 10)%2;         
		if (empCheck == isPresent)
			salary = wagePerHour * empHrs;
		else
			salary = 0;
		System.out.println("Salary="+salary);
		}
}


