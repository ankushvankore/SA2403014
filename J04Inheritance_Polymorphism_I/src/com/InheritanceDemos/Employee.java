package com.InheritanceDemos;

public class Employee {
	private int empId;
	private String empName;
	protected double basicSalary;
	private String gender;
	
	public Employee()				//Plain / Default / No Parameter Constructor
	{
		empId = 100;
		empName = "Anu";
		basicSalary = 50000;
		gender = "Female";
		
		System.out.println("Default Constructor called!!!");
	}
	public Employee(int id, String nm, double bs, String gn)	//Parameterized Constructor
	{
		empId = id;
		empName = nm;
		basicSalary = bs;
		gender = gn;
		System.out.println("Parameterized Constructor Called!!!");
	}
	public Employee(int id, String nm, double bs)
	{
		empId = id;
		empName = nm;
		basicSalary = bs;
		gender = "Male";
		System.out.println("Second Parameterized Constructor Called!!!");
	}
	
	public void setEmpId(int id)		//Mutator Function
	{
		this.empId = id;
	}
	public int getEmpId()				//Accessor Function
	{
		return empId;
	}
	
	public void displayData()			//Facilitator Function
	{
		System.out.println("Employee Id  : " + empId);
		System.out.println("Employee Name: " + this.empName);
		System.out.println("Basic Salary : " + this.basicSalary);
		System.out.println("Gender       : " + this.gender);
	}
	public double calculateSalary()
	{
		double da, hra, pf, net;
		
		da = basicSalary * 0.50;
		hra = basicSalary * 0.20;
		pf = basicSalary * 0.05;
		net = basicSalary + da + hra - pf;
		
		return net;
	}
	public String toString()
	{
		return "Employee Id  : " + empId +
		"\nEmployee Name: " + this.empName +
		"\nBasic Salary : " + this.basicSalary +
		"\nGender       : " + this.gender;
	}
	
}
