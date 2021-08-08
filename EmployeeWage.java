package employeeWage;

import java.util.Random;

public class EmployeeWage {
	public static void calculatingDailyWage() {
		int workingHr = 0;

		int wagePerHr = 20;
		Random r = new Random();
		int empCheck = r.nextInt(2);
		switch (empCheck) {
		case 0: {
			System.out.println("Employee is present");
			workingHr = 8;
			break;
		}

		case 1: {
			System.out.println("Employee is absent");
			workingHr = 0;
			break;
		}
		}
		int empWage = (workingHr * wagePerHr);
		System.out.println("Employee wage is : " + empWage);

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation program");
		calculatingDailyWage();

	}

}
