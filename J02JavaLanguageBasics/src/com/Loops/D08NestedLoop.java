package com.Loops;

public class D08NestedLoop {

	public static void main(String[] args) {
		int i, j;
		
		for(i = 1; i <= 5; i++)			//Outer loop
		{
			for(j = 1; j <= 5; j++)		//Inner loop
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//For every single iteration of outer loop, inner loop get executed for its complete scope
	}

}
