package com.brizlabs;

public class Geometry {
	
	static int x1=5,x2=10,y1=7,y2=15;
	
	static int length;
	
	public static void main(String[] args) {
		
		length=((((x2-x1)^2)+((y2-y1)^2))^2);
		
		System.out.println("length of the line:"+length+"cm");
	
		
	}
	
	
	
	

}
