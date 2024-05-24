package com.ExceptionDemos;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class D04SetDemo {

	public static void main(String[] args) {
		Set<String> students = new HashSet<>();
		students.add("Kavita");
		students.add("Anu");
		students.add("Priya");
		students.add("Rohini");
		students.add("Kajal");
		students.add("Dhana");
		students.add("Priya");

		System.out.println("Total students: " + students.size());

		// System.out.println(students);

		for (String st : students)
			System.out.println(st);
		System.out.println("------------------------------------------");
		Iterator<String> itr = students.iterator();
		String st;
		/*st = itr.next();
		// .next() returns the value at the location of itr object
		// and moves to the next element
		System.out.println(st);
		st = itr.next();
		System.out.println(st);
		st = itr.next();
		System.out.println(st);
		st = itr.next();
		System.out.println(st);
		st = itr.next();
		System.out.println(st);
		st = itr.next();
		System.out.println(st);

		if (itr.hasNext()) {
			st = itr.next();
			System.out.println(st);
		}
		else
		{
			System.out.println("Reached at the end of Set");
		}*/
		
		System.out.println("----------------------------------------");
		
		/*for(int i = 1; i <= students.size(); i++)
		{
			st = itr.next();
			System.out.println(st);
		}*/
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
