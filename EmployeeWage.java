package employeeWage;

import java.util.Random;

public class EmployeeWage {

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
