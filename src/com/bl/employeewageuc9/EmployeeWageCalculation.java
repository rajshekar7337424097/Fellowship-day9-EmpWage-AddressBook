package com.bl.Employeewageuc9.Practise.problems;

public class EmployeeWageCalculation {
	public static void main(String[] args) {
		Employee dmartEmp = new Employee("Dmart", "John", 8, 20, 20, 60);
		System.out.println(dmartEmp);

		System.out.println("------------------------");

		Employee tcsEmp = new Employee("TCS", "raj", 9, 25, 25, 80);
		System.out.println(tcsEmp);

		System.out.println("------------------------");

		Employee infosysEmp = new Employee("InfoSys", "shekar", 10, 30, 30, 100);
		System.out.println(infosysEmp);
	}
}
