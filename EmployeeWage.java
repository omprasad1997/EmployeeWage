package com.blbz;

public class EmployeeWage {
	public static  final int  isPartTime = 1;
	public static  final int isFullTime = 2;
	
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
		computeEmpWage("Jio",10,2,10);
		computeEmpWage("dMart",10,4,20);
	}
}
