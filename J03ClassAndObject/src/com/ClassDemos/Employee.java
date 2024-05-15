package com.ClassDemos;

public class Employee {
	private int empId;
	private String empName;
	private double basicSalary;
	private String gender;
	
	public Employee()
	{
		empId = 100;
		empName = "Anu";
		basicSalary = 50000;
		gender = "Female";
		
		System.out.println("Constructor called!!!");
	}
	
	public void setEmpId(int id)		//Mutator Function
	{
		empId = id;
	}
	public int getEmpId()				//Accessor Function
	{
		return empId;
	}
	
	public void displayData()			//Facilitator Function
	{
		System.out.println("Employee Id  : " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Basic Salary : " + basicSalary);
		System.out.println("Gender       : " + gender);
	}
	public double calculateSalary()
	{
		double da, hra, pf, net;
		
		da = basicSalary * 0.50;
		hra = basicSalary * 0.20;
		pf = basicSalary * 0.05;
		net = da + hra - pf;
		
		return net;
	}
}
