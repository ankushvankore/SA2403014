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
			System.out.println("Error: Array index is out of bound");
		}
		catch(NullPointerException ex)
		{
			System.out.println(ex);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		catch(SecurityException ex)
		{
			System.out.println(ex);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			//finally block get executed irrespective of exception
			System.out.println("This is finally block");
		}
		
		
		System.out.println("Program ends");
	}

}
