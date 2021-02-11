package com.blbz;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IS_FULL_TIME = 1;
		double empCheck = Math.floor(Math.random()*10)%2;
		if(empCheck == IS_FULL_TIME)
			System.out.println("is present");
		else
			System.out.println("Not Present");

	}

}
