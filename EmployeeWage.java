package com.blbz;

public class EmployeeWage {
	public static final int isPartTime = 1;
	 public static final int isFullTime = 2;
	 
	 private CompanyEmployeeWage[] companyEmpWageArray;
	 
	 public EmployeeWage() {
		 companyEmpWageArray = new CompanyEmployeeWage[5];
	 }
	
	 public void addCompanyEmpWage(String company,int empRatePerHour,int numOfCompany,int numOfWorkingDays,int maxHoursPerMonth) {
		 companyEmpWageArray[numOfCompany] = new CompanyEmployeeWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
		 computeEmpWage(companyEmpWageArray[numOfCompany].company,companyEmpWageArray[numOfCompany].empRatePerHour,
				 companyEmpWageArray[numOfCompany].numOfWorkingDays,companyEmpWageArray[numOfCompany].maxHoursPerMonth);
		 numOfCompany++;
	 }
	 
	public static int computeEmpWage(String company,int empRate,int numOfDays,int maxHrs)
	{
		int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
		while(totalEmpHrs<=maxHrs && totalWorkingDays < numOfDays)
		{
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random()*10)%3;
			
			switch(empCheck)
			{
				case isFullTime:
					empHrs=8;
					break;
				case isPartTime:
					empHrs=4;
					break;
				default:
					empHrs=0;
					break;
			}
			totalEmpHrs += empHrs;
			System.out.println("Days#: " + totalWorkingDays + " Emp Hr: " + empHrs);
			
	    }
		int totalEmpWage = empHrs*empRate;
		System.out.println("Total Emp Wage : "+ totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
			EmployeeWage emp = new EmployeeWage();
			emp.addCompanyEmpWage("Dmart",10,0,30,40);
			emp.addCompanyEmpWage("jio",20,1,32,19);
			
	}

}