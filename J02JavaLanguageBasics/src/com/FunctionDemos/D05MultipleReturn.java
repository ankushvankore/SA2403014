package com.FunctionDemos;

public class D05MultipleReturn {

	public static int findMax(int n1, int n2)
	{
		if(n1 > n2)
		{
			return n1;
		}
		else
		{
			return n2;
		}
	}
	
	public static void main(String[] args) {
		int no1 = 62, no2 = 8;
		int max = findMax(no1, no2);
		
		System.out.println("Maximum: " + max);
	}

}
