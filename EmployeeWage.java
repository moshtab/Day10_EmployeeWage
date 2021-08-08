package employeeWage;

import java.util.Random;

public class EmployeeWage {
	public static void calculatingDailyWage() {
		int workingHr = 0;
		int empWage = 0;
		int wagePerHr = 20;
		for (int i = 0; i < 20; i++) {
			Random r = new Random();
			int empCheck = r.nextInt(3);
			switch (empCheck) {
			case 0: {
				workingHr = 8;
				break;
			}

			case 1: {
				workingHr = 0;
				break;
			}
			case 2: {
				workingHr = 4;
				break;
			}
			}
			empWage = empWage + (workingHr * wagePerHr);
		}
		System.out.println("Employee wage is : " + empWage);

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation program");
		calculatingDailyWage();

	}

}
