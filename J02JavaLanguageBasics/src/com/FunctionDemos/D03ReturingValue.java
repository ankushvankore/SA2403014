package com.FunctionDemos;

public class D03ReturingValue {

	public static double calAreaOfCircle(int rd)
	{
		double ar = 3.142 * rd * rd;
		return ar;
	}
	
	/*
	 * Points to be noted about return statement
	 * 1. return statement returns value to calling function
	 * 2. return statement is used to break/terminate the function
	 * 3. return statement can return single value at a time but function 
	 * 		may have multiple return statements.
	 */
	
	public static void main(String[] args) {
		//double area = calAreaOfCircle(5);
		//System.out.println("Area of Circle: " + area);
		
		//double area;
		//area = calAreaOfCircle(5);
		//System.out.println("Area of Circle: " + area);
		
		System.out.println("Area of Circle: " + calAreaOfCircle(5));
	}

}
