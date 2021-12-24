package com.bl.Employeewageucq8.Practise;

public class EmployeeWageCalculation {
	public static void main(String[] args) {
		Employee dmartEmp = new Employee("DMart", "John", 8, 20, 20, 60);
		int dmartEmpWage = dmartEmp.calculateEmpWage();

		System.out.println(dmartEmp.empName + " is working with " + dmartEmp.companyName + ", and he is earning "
				+ dmartEmpWage + "$ monthly");

		Employee rILEmp = new Employee("Reliance", "Tony", 9, 15, 25, 80);
		int rILEmpWage = rILEmp.calculateEmpWage();
		System.out.println(rILEmp.empName + " is working with " + rILEmp.companyName + ", and he is earning "
				+ rILEmpWage + "$ monthly");
	}

}
