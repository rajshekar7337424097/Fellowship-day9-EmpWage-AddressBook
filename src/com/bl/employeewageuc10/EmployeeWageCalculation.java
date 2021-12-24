package com.bl.Employeewageucq10.Practise;

public class EmployeeWageCalculation {
	public static void main(String[] args) {
		EmployeeWageBuild empWageBuild = new EmployeeWageBuild("John");
		empWageBuild.addCompany(new Company("Dmart",8, 20, 20, 60));
		empWageBuild.addCompany(new Company("RIL",8, 20, 20, 100));
		empWageBuild.addCompany(new Company("INFOSYS",8, 40, 20, 100));
		empWageBuild.addCompany(new Company("DELL",8, 40, 20, 100));
		empWageBuild.addCompany(new Company("TCS",8, 40, 25, 100));
		
		empWageBuild.calculateAllCompaniesEmpWage();
	}

}
