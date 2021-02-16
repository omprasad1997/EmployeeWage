package com.blbz;

public class EmployeeWage {
	public static  final int  isPartTime = 1;
	public static  final int isFullTime = 2;
	public static  final int EMP_RATE_PER_HOUR=20;
	public static  final int No_Of_Working_Days=20;
	public static  final int max_Hrs_In_Month = 100;
	
	public static void main(String[] args) {
		int empHrs = 0;
		int totalHrs=0,totalWorkingDays=0,totalEmpWage =0;
		
		while(totalHrs<=max_Hrs_In_Month && totalWorkingDays <= No_Of_Working_Days)
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
			totalHrs += empHrs;
			int empWage=  empHrs*EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.println("Emp Wage :"+ empWage);
	}
		System.out.println("Total Emp Wage :"+ totalEmpWage);
	}
}
