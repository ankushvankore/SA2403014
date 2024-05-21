package com.InheritanceDemos;

public class PolymorphismDemo {

	public static void main(String[] args) {
		Employee emp;		//Reference of Base class
		Manager m1 = new Manager(123, "Kavita", 50000, "Female", 50000, 0.5);	//Object of derived class
		
		emp = m1;
		emp.calculateSalary();
		//Generic Reference
		//Reference of base class can hold object of derived class
		
		System.out.println(emp);
		
		Employee e1 = new Employee(222, "Tushar", 50000, "Male");
		emp = e1;
		System.out.println(emp);
		
		final double pi = 3.142;
		//pi = 88;
		
		
	}

}
