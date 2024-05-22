package com.ExceptionDemos;

import java.util.Scanner;

public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {
		int[]arr = new int[] {1, 2, 3, 4, 5};
		int n;
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter Index: ");
		n = scn.nextInt();

		try
		{
			System.out.println(arr[n]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Error: Index is out of bounds!!!");
		}
		
		System.out.println("Program ends");
	}

}
