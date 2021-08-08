package employeeWage;

import java.util.Random;

class EmployeeWage {

	public int wagePerHr;
	public int maxHrs;
	public int noOfWorkingDays;

	public EmployeeWage(int wagePerHr, int maxHrs, int noOfWorkingDays) {
		this.wagePerHr = wagePerHr;
		this.maxHrs = maxHrs;
		this.noOfWorkingDays = noOfWorkingDays;
	}

	public int employeeWage() {
		int empHrs = 0;
		int totalWorkingDays = 0;
		int workingHr = 0;
		int empWage = 0;

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
			totalWorkingDays++;
		}
		return empWage;

	}
}

class Company {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation program");

		EmployeeWage company1 = new EmployeeWage(20, 100, 20);
		EmployeeWage company2 = new EmployeeWage(22, 110, 22);
		EmployeeWage company3 = new EmployeeWage(18, 95, 18);

		// Putting all the employee wages of multiple companies in array
		int[] array = new int[3];
		array[0] = company1.employeeWage();
		array[1] = company2.employeeWage();
		array[2] = company3.employeeWage();
		System.out.println("EmployeeWage of Companies is");
		for (int i = 0; i < 3; i++) {
			System.out.print(array[i] + " ");

		}

	}

}
