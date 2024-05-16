package com.ClassDemos;

public class Client {

	public static void main(String[] args) {
		Employee.setCompany("Star Agile");
		
		Employee e1 = new Employee();
		//Employee is class name or Data type & e1 is an object
		e1.setEmpId(101);
		
		e1.displayData();
		
		System.out.println("Emp id: " + e1.getEmpId());
		
		System.out.println("==================================");
		
		Employee e2 = new Employee();
		e2.displayData();
		
		System.out.println("==================================");
		
		Employee e3 = new Employee(123, "Poonam", 50000, "Female");
		e3.displayData();
		
		e1.displayData();
		
		Employee e4 = new Employee(234, "Bunty", 50000);
		e4.displayData();
	}

}
;