package employeeWage;

import java.util.Random;

public class EmployeeWage {

	public static void calculatingWage() {
		int empHrs = 0;
		int totalWorkingDays = 0;
		int workingHr = 0;
		int empWage = 0;
		int wagePerHr = 20;
		int maxHrs = 100;
		int noOfWorkingDays = 100;

		while (empHrs <= maxHrs && totalWorkingDays <= noOfWorkingDays) {
			Random r = new Random();
			int empCheck = r.nextInt(3);
			switch (empCheck) {
			case 0: {

				workingHr = 8;
				break;
			}
			case 1: {
				workingHr = 4;
				break;
			}
			case 2: {
				workingHr = 0;
				break;
			}
			}
			empHrs += workingHr;
			empWage = empWage + (workingHr * wagePerHr);
		}
		System.out.println("Employee Wage is : " + empWage);

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation program");
		calculatingWage();

	}

}
