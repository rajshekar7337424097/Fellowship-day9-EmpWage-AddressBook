package com.bl.Employeewageucq8.Practise;

public class Employee {
	String empName;
	String companyName;
	int workingHour;
	int wagePerHour;
	int maxWorkingDay;
	int maxWorkingHour;

	public Employee(String companyName, String empName, int workingHour, int wagePerHour, int maxWorkingDay,
			int maxWorkingHour) {
		this.empName = empName;
		this.companyName = companyName;
		this.workingHour = workingHour;
		this.wagePerHour = wagePerHour;
		this.maxWorkingDay = maxWorkingDay;
		this.maxWorkingHour = maxWorkingHour;
	}

	static final int IS_PRESENT = 1;
	static final int IS_PART_TIME = 2;

	private int isEmpPresent() {
		return (int) (Math.floor(Math.random() * 10) % 3);
	}

	private int getWorkignHour(int attendanceCheck) {
		int empHr;
		switch (attendanceCheck) {
		case IS_PRESENT:
			empHr = workingHour;
			break;

		case IS_PART_TIME:
			empHr = (workingHour / 2);
			break;

		default:
			empHr = 0;
			break;
		}
		return empHr;
	}

	public int calculateEmpWage() {
		int day = 0;
		int totalWorkingHour = 0;
		while (day < maxWorkingDay && (totalWorkingHour + workingHour) <= maxWorkingHour) {
			day++;
			int workingHour = getWorkignHour(isEmpPresent());
			totalWorkingHour += workingHour;
		}
		int totalSalary = totalWorkingHour * wagePerHour;
//		System.out.println(emp.empName + "'s monthly wage : " + totalSalary);
//		System.out.println(emp.empName + "'s total working hour : " + totalWorkingHour);
		return totalSalary;
	}

}
