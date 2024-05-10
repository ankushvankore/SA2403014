package com.Loops;
import java.util.Scanner;

public class D05PrintNos {

	public static void main(String[] args) {
		int i, no;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter No: ");
		no = scn.nextInt();
		
		for(i = 1; i < no; i++)
		{
			System.out.println(i);
		}
	}

}
