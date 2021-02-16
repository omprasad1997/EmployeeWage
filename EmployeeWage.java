package com.blbz;

public class EmployeeWage {
	public static void main(String[] args) {
		Employee dMart = new Employee();
        
        dMart.welcome();
        dMart.checkAttendce();
        dMart.fullDayHour = 8;
        dMart.wagePerHour = 20;
        dMart.EMP_RATE_PER_HOUR = 20;
        dMart.empHrs = 8;
        dMart.No_Of_Working_Days = 20;
        dMart.max_Hrs_In_Month  = 100;
        dMart.getEmpWage( dMart.fullDayHour , dMart.wagePerHour);
        dMart.getPartTimeEmpWage(dMart.EMP_RATE_PER_HOUR,dMart.empHrs);
        dMart.getTotalEmpWage(dMart.No_Of_Working_Days ,dMart.max_Hrs_In_Month);

	}

}

class Employee{
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;
    
    public int wagePerHour ;
    public int fullDayHour ;
    public int EMP_RATE_PER_HOUR;
    public int empHrs;
    public int No_Of_Working_Days;
    public int max_Hrs_In_Month;
    public float dailyWage;
    public float totalEmpWage;

void welcome()
{
    System.out.println("Welcome ");
}

void checkAttendce()
{
    int check = (int)Math.floor(Math.random()*10)%2;
    if(check==1)
        System.out.println("Present");
    else
        System.out.println("Absent");
}


public float getEmpWage(int wagePerHour , int fullDayHour)
{
    dailyWage = wagePerHour*fullDayHour;
    System.out.println(dailyWage);
    return dailyWage;
}

public int getPartTimeEmpWage(int empHrs , int EMP_RATE_PER_HOUR ){
    
   int empWage =  empHrs*EMP_RATE_PER_HOUR;
   System.out.println(empWage);
   return empWage;
}

public float getTotalEmpWage(int No_Of_Working_Days,int max_Hrs_In_Month){
    int totalWorkingDays = 1;
    int totalHrs = 0;

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
    	}
		System.out.println("Total Emp Wage : "+ totalEmpWage);
		return totalEmpWage;
	}
}
