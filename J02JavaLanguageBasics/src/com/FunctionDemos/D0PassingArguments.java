package com.FunctionDemos;

public class D0PassingArguments {

	public static void calculateAddition(int no1, int no2)
	{
		int sum = no1 + no2;
		System.out.println("Addition: " + sum);
	}
	
	public static void main(String[] args) {
		int no1 = 9, no2 = 7;
		calculateAddition(33, 44);
		calculateAddition(no1, no2);
	}

}
