package com.FunctionDemos;

public class D06FunctionOverloading {
	public static void calAddition(int n1, int n2)
	{
		int add = n1 + n2;
		System.out.println("Addition: " + add);
	}
	public static void calAddition(int n1, int n2, int n3)
	{
		int add = n1 + n2 + n3;
		System.out.println("Addition: " + add);
	}
	public static void calAddition(double n1, double n2)
	{
		double add = n1 + n2;
		System.out.println("Addition: " + add);
	}
	public static void calAddition(int n1, double n2)
	{
		double add = n1 + n2;
		System.out.println("Addition: " + add);
	}
	public static void calAddition(double n1, int n2)
	{
		double add = n1 + n2;
		System.out.println("Addition: " + add);
	}
	
	public static void main(String[] args) {
		calAddition(10, 20);
		
		calAddition(5.5,6.6);
	}

}
