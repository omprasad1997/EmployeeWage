package com.blbz;

public class EmployeeWage {
	public static  final int  isPartTime = 1;
	public static  final int isFullTime = 2;
	public static  final int EMP_RATE_PER_HOUR=20;
	public static  final int No_Of_Working_Days=2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empHrs = 0;
		int empWage=0;
		int totalEmpWage =0;
		
		for(int day = 1 ; day<=No_Of_Working_Days;day++ )
		{
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
			empWage=  empHrs*EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.println("Emp Wage :"+ totalEmpWage);

	}
	}
}
