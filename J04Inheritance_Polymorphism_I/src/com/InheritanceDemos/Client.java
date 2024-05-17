package com.InheritanceDemos;

public class Client {

	public static void main(String[] args) {
		Manager m1 = new Manager();
		//m1.displayData();
		System.out.println(m1);
		System.out.println("Net Salary   : " + m1.calculateSalary());
		
		//Constructor sequence will be like 
		//first base class then derived class
		//Employee -> Manager
		
		System.out.println("======================================");
		
		Manager m2 = new Manager(123, "Kavita", 50000, "Female", 50000, 0.5);
		//m2.displayData();
		System.out.println(m2);
		System.out.println("Net Salary   : " + m2.calculateSalary());
		
		System.out.println("======================================");
		
		Manager m3 = new Manager(111, "Manasa", 50000, "Female", 56000, 0.05);
		System.out.println(m3);
	}

}
