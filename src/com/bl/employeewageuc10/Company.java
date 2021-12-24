package com.bl.Employeewageucq10.Practise;

public class Company {
	static final int IS_PRESENT = 1;
	static final int IS_PART_TIME = 2;
	
	String companyName;
	int workingHour;
	int wagePerHour;
	int maxWorkingDay;
	int maxWorkingHour;
	int totalEmpWage;
	
	public Company(String companyName, int workingHour,int wagePerHour, int maxWorkingDay, int maxWorkingHour) {
		this.companyName = companyName;
		this.workingHour = workingHour;
		this.wagePerHour = wagePerHour;
		this.maxWorkingDay = maxWorkingDay;
		this.maxWorkingHour = maxWorkingHour;
		}
	public int isEmpPrasent() {
		return (int)(Math.floor(Math.random() * 10) % 3);
	}
	
	public int getWorkingHour(int empCheck) {
		int empHr;
		switch(empCheck) {
		case IS_PRESENT:
			empHr = workingHour;
			break;
		case IS_PART_TIME:
			empHr = (workingHour/2);
			break;
		default:
			empHr = 0;
			break;
		}
		return empHr;
	}
	public void calculateEmpWage() {
		int day = 0;
		int totalWorkingHour = 0;
		while (day < maxWorkingDay && (totalWorkingHour + workingHour) <= maxWorkingHour) {
			day++;
			int workingHour = getWorkingHour(isEmpPrasent());
			totalWorkingHour += workingHour;
		}
		totalEmpWage = totalWorkingHour * wagePerHour;
	}
	@Override
	public String toString() {
		return "Company name :" +companyName+ "\nEmployee Wage :" +totalEmpWage;
	}

}
