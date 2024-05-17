package com.InheritanceDemos;

public class Manager extends Employee
{
	private double sales;
	private double rate;
	
	public Manager()
	{
		sales = 0;
		rate = 0;
	}
	
	public Manager(int id, String nm, double bs, String gn, double s, double r)
	{
		//super();		//Will call plain constructor of base class
		super(id, nm, bs, gn);	//Call parameterized constructor of base class
		sales = s;
		rate = r;
	}
	
	public double calculateInsentive()
	{
		return sales * rate;
	}
	
	public double calculateSalary()
	{
		return super.calculateSalary() + calculateInsentive();
	}
	
	public void displayData()
	{
		super.displayData();
		System.out.println("Total Sales  : " + sales);
		System.out.println("Rate of Comm : " + rate);
	}
	
	public String toString()
	{
		return super.toString() + "\nTotal Sales  : " + sales +
		"\nRate of Comm : " + rate;
	}
	
}
