package com.Loops;

import java.util.Scanner;

public class D11PrimeNo {

	public static void main(String[] args) {
		int no, i;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter No: ");
		no = scn.nextInt();
		
		for(i = 2; i <= no; i++)
		{
			if(no % i == 0)
			{
				break;
			}
		}
		if(no == i)
		{
			System.out.println("Number is PRIME");
		}
		else
		{
			System.out.println("Number is NOT PRIME");
		}
	}

}
