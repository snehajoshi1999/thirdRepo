package com.brizlabs;

class Daily_sal
{
	void Daily()
	{
		 int sal_parttime_hour=4;
		 int workinghour_day=8;
		int Sal_per_hour=20;
		int Total;
		int Total_parttime;
		Total= (Sal_per_hour)*8;
		Total_parttime=(sal_parttime_hour)*(Sal_per_hour);
		int Total_sal_formonth=(Total)*30;
		int Total_workinghours_inmonth=(workinghour_day)*30;
		System.out.println("Total Day salary="+Total);
		System.out.println(" Half_Day salary="+Total_parttime);
		System.out.println(" Total salaty of month="+Total_sal_formonth);
		System.out.println(" Working hours in a  month="+Total_workinghours_inmonth);
	
	}
}

public class Emp_attendance {
	
	
	public static void main(String[] args) {
		
		System.out.println("!!!!!!!!welcome employee!!!!!!!");
		
		
		
		Daily_sal d1=new Daily_sal();
		d1.Daily();
		
		double a=5.6;
		double b=6.1;
		
		//System.out.println(Math.floor(a));
	//System.out.println(Math.floor(b));
	
	int IS_FULL_TIME=1;
	double empCheck =Math.floor(Math.random()*10)%2;
	
	if(empCheck==IS_FULL_TIME)
		 System.out.println("Employee is present");
	else 
		System.out.println("Employee is absent");
	}
	
	
	
	
//	
//System.out.println(".");
}
