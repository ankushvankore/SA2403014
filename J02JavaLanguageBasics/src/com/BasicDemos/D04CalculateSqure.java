package com.BasicDemos;

import java.util.Scanner;

public class D04CalculateSqure {

	public static void main(String[] args) {
		int no, sq;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		no = scn.nextInt();
		
		sq = no * no;
		System.out.println("Squre of " + no + " is: " + sq);
	}

}
