package com.AbstractDemos;

public class Squre extends Rectangle
{
	private int sd;

	public Squre(int length, int breadth, int sd) {
		super(length, breadth);
		this.sd = sd;
	}
	public void calculateArea()
	{
		int area = sd * sd;
		
		System.out.println("Area of Squre: " + area);
	}
	
}
