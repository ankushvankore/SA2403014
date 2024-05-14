package com.FunctionDemos;

public class D01SimpleFunction {

	public static void sayHello()			//Called function
	{
		//Body of Function
		System.out.println("Welcome to Function!!!");
	}
	/*
	 * Return Type => Type of the value which is supposed to return by the function
	 * Paramater/Argument => The value which needs to be passed to the function for processing
	 */
	
	public static void main(String[] args) //Calling Function
	{
		sayHello();
		System.out.println("Something new");
		sayHello();
	}

}
