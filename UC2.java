package com.brizlabs;

import java.util.Scanner;

public class UC2 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x1=20;
		System.out.println("1st co-ordinate is "+x1);
		
		 System.out.println("Enter the value of x2 co-ordinate");
			int x2 = sc.nextInt();
			  
			int y1=20;
			System.out.println("2nd co-ordinate is "+y1);
		
			 System.out.println("Enter the value of x2 co-ordinate");
				int y2 = sc.nextInt();
				
				if(x2==y2)
				{
					System.out.println("******length of linre is same****");
				}
				else
				{
					System.out.println("!!!!!length of line is not same!!!!!!!!");
				}
	}

}
