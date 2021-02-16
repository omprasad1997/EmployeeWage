package com.blbz;

public class EmployeeWage {
	public static  final int  isPartTime = 1;
	public static  final int isFullTime = 2;
	public static  final int EMP_RATE_PER_HOUR=20;
	public static  final int No_Of_Working_Days=20;
	public static  final int max_Hrs_In_Month = 100;
	
	public static int computeEmpWage()
	{
		int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
		while(totalEmpHrs<=max_Hrs_In_Month && totalWorkingDays < No_Of_Working_Days)
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
		int totalEmpWage = empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Total Emp Wage : "+ totalEmpWage);
		return totalEmpWage;
	}
	
	public static void main(String[] args) {
		computeEmpWage();
	}
}
