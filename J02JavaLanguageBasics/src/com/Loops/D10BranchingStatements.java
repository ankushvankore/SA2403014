package com.Loops;

public class D10BranchingStatements {

	public static void main(String[] args) {

		int i;
		
		for(i = 1; i <= 20; i++)
		{
			if(i % 5 == 0)
			{
				break;
			}
			else
			{
				System.out.println(i);
			}
		}

	}

}
