package com.ClassDemos;

public class Client {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		//Employee is class name or Data type & e1 is an object
		e1.setEmpId(101);
		
		e1.displayData();
		
		System.out.println("Emp id: " + e1.getEmpId());
		
		System.out.println("==================================");
		
		Employee e2 = new Employee();
		e2.displayData();
	}

}
