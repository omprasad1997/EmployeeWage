package com.blbz;

public class EmployeeWage {
	public static  final int  isPartTime = 1;
	public static  final int isFullTime = 2;
	public static  final int EMP_RATE_PER_HOUR=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empHrs = 0;
		int empWage=0;
		double empCheck = Math.floor(Math.random()*10)%3;
		
		if(empCheck==isFullTime)
				empHrs = 8;
		else
			empHrs = 4;
		empWage = empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage : " + empWage);

	}

}
