
import java.util.*; 
public class CheckEmployeePresenceUC1 {

	public static void main(String[] args) {
		int isPresent = 1;
		double empCheck = Math.floor(Math.random() * 10)%2;         
		if (empCheck == isPresent)
			System.out.println("employee is present");
		else
			System.out.println("employee is absent");
		}
}
