package com.FunctionDemos;

import java.util.Scanner;

public class D04NotPassingAndReturning {

	public static int findSqure()
	{
		int no;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter No: ");
		
		no = scn.nextInt();
		
		//int ans = no * no;
		//return ans;
		
		return no * no;
	}
	
	public static void main(String[] args) {
		int sq = findSqure();
		System.out.println("Squre: " + sq);
	}

}
