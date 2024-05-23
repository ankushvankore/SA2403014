package com.AbstractDemos;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Shape s1 = new Circle(5);
		s1.calculateArea();
		s1.sayHello();
		((Circle) s1).print();

		Rectangle r1 = new Rectangle(5, 6);
		r1.calculateArea();
		r1.sayHello();
		r1.print();

		Printable p1 = new Circle(5);
		p1.print();

		Squre sq1 = new Squre(0, 0, 5);
		sq1.calculateArea();

		char ch;
		String rstr = " ";
		Scanner scn = new Scanner(System.in);
		System.out.println("enter  any String :");
		String str = scn.nextLine();

		// System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			rstr = ch + rstr;
		}

		System.out.println("reverse of string: " + rstr);

	}

}
