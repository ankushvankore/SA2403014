package com.AbstractDemos;

public class MethodsDemo {

	//Accept 2 nos, pass to function and calculate sum in function
	//display the output in function
	public static void calculateAddition(int n1, int n2)
	{
		int sum = n1 + n2;
		
		System.out.println("Addition: " + sum);
	}
	
	//Accept radius, pass to function, calculate area in function
	//display the result in calling function (main)
	public static double calArea(int rd)
	{
		return 3.142 * rd * rd;
	}
	
	public static void main(String[] args) {
		calculateAddition(22, 33);
		
		//double area = calArea(5);
		//System.out.println("Area: " + area);
		
		System.out.println("Area of Circle: " + calArea(4));
	}

}
