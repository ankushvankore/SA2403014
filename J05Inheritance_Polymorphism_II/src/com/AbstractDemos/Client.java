package com.AbstractDemos;

public class Client {

	public static void main(String[] args) {
		Shape s1 = new Circle(5);
		s1.calculateArea();
		s1.sayHello();
		
		Rectangle r1 = new Rectangle(5, 6);
		r1.calculateArea();
		r1.sayHello();
		r1.print();
		
		Printable p1 = new Circle(5);
		
	}

}
