package com.brizlabs;

import java.util.Scanner;

public class Eqality {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("value of x1 co-ordinate:");
		int x1=sc.nextInt();
		System.out.println("value of y1 co-ordinate:");
		int y1=sc.nextInt();
		
	    System.out.println("Enter the value of x2 co-ordinate");
		int x2 = sc.nextInt();
		  
		System.out.println("Enter the value of x2 co-ordinate");
		int  y2 = sc.nextInt();
		int lenth_of_line1 = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println("Length of the line is: "+lenth_of_line1);
	}
}