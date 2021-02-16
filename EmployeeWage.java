package com.blbz;

public class EmployeeWage {
	public static  final int  isPartTime = 1;
	public static  final int isFullTime = 2;
	
	
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;
	
	public EmployeeWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.numOfWorkingDays = numOfWorkingDays;
	}
	
	public void computeEmpWage()
	{
		int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
		while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
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
		totalEmpWage = totalEmpHrs*empRatePerHour;
	}
	
	public String toString() {
		return "Total Emp Wage for Company" + company + " is :" + totalEmpWage;
		}
	
	public static void main(String[] args) {
		EmployeeWage dMart = new EmployeeWage("DMart",20,2,10);
		EmployeeWage reliance = new EmployeeWage("Reliance",10,4,20);
		dMart.computeEmpWage();
		System.out.println(dMart);
		reliance.computeEmpWage();
		System.out.println(reliance);
		
	}
}
