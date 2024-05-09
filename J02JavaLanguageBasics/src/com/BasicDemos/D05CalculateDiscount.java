package com.BasicDemos;

import java.util.Scanner;

public class D05CalculateDiscount {

	public static void main(String[] args) {
		int amt;
		double dis, net;
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Amount: ");
		amt = scn.nextInt();
		
		dis = amt * 0.10;
		net = amt - dis;
		
		System.out.println("Discount: " + dis);
		System.out.println("Net Amount: " + net);
	}

}
