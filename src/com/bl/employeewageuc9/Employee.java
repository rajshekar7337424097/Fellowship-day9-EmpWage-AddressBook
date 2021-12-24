package com.bl.Employeewageuc9.Practise.problems;

public class Employee {
	String empName;
	String companyName;
	int workingHour;
	int wagePerHour;
	int maxWorkingDay;
	int maxWorkingHour;

	public Employee(String empName, String companyName, int workingHour, int wagePerHour, int maxWorkingDay, int maxWorkingHour) {
		this.empName = empName;
		this.companyName = companyName;
		this.workingHour = workingHour;
		this.wagePerHour = wagePerHour;
		this.maxWorkingDay = maxWorkingDay;
		this.maxWorkingHour = maxWorkingHour;
	}
	static final int IS_PRESENT = 1;
	static final int IS_PART_TIME = 2;

	public int isEmpPresent() {
		return (int)(Math.floor(Math.random() * 10) % 3);
	}
	public int getWorkingHour(int empCheck) {
		int empHr = 0;
		switch(empCheck) {
		case 1:
			empHr = workingHour;
			break;
		case 2:
			empHr = (workingHour/2);
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
			int workingHour = getWorkingHour(isEmpPresent());
			totalWorkingHour += workingHour;
		}
		int totalSalary = totalWorkingHour * wagePerHour;
		return totalSalary;
	}
	@Override
	public String toString() {
		return "Company name : " + companyName + "\nEmployee name : " + empName + "" + "\nMonthly Wage : "
				+ calculateEmpWage() + " $";
	}

}


