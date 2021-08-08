package employeeWage;

import java.util.Random;

//interface class
interface Company {
	// interface method
	public int employeeWage();
}

//subclass
class Company1 implements Company {

	public int wagePerHr;
	public int maxHrs;
	public int noOfWorkingDays;

	public Company1(int wagePerHr, int maxHrs, int noOfWorkingDays) {
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

//subclass
class Company2 implements Company {

	public int wagePerHr;
	public int maxHrs;
	public int noOfWorkingDays;

	public Company2(int wagePerHr, int maxHrs, int noOfWorkingDays) {
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

//subclass
class Company3 implements Company {

	public int wagePerHr;
	public int maxHrs;
	public int noOfWorkingDays;

	public Company3(int wagePerHr, int maxHrs, int noOfWorkingDays) {
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

class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation program");

		// objects of sub classes
		Company1 company1 = new Company1(20, 100, 20);
		Company2 company2 = new Company2(22, 110, 22);
		Company3 company3 = new Company3(18, 95, 18);

		System.out.println("Employee Wage of Company1 is : " + company1.employeeWage());
		System.out.println("Employee Wage of Company2 is : " + company2.employeeWage());
		System.out.println("Employee Wage of Company3 is : " + company3.employeeWage());

	}

}
