package employeeWage;



class Company {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation program");

		EmployeeWage company1 = new EmployeeWage(20, 100, 20);
		EmployeeWage company2 = new EmployeeWage(22, 110, 22);
		EmployeeWage company3 = new EmployeeWage(18, 95, 18);

		System.out.println();
		System.out.println("Total Employee Wage of Company1 is : " + company1.employeeWage());

		System.out.println("Total Employee Wage of Company2 is : " + company2.employeeWage());

		System.out.println("Total Employee Wagee of Company3 is : " + company3.employeeWage());

	}

}
