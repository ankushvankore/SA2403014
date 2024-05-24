package com.ExceptionDemos;

import java.util.HashMap;
import java.util.Map;

public class D05MapDemo1 {

	public static void main(String[] args) {
		//Map is collection of Key-Value pair
		//Where Key cannot be duplicate but value can be
		
		Map<Integer, String>students = new HashMap<>();
		students.put(1, "Poonam");
		students.put(2, "Kavita");
		students.put(3, "Rohini");
		
		System.out.println(students);
		
		students.put(2, "Anu");
		
		System.out.println(students);
		
		if(students.containsKey(4))
			System.out.println("Roll no already exists");
		else
			students.put(4, "Dhana");
		
		if(students.containsValue("Manasa"))
			System.out.println("Name already present");
		else
			students.put(5, "Manasa");
		
		System.out.println(students);
		
		if(students.containsKey(4))
			System.out.println("Roll no already exists");
		else
			students.put(4, "Dhana");
		
		if(students.containsValue("Manasa"))
			System.out.println("Name already present");
		else
			students.put(5, "Manasa");
		
		students.put(6, "Poonam");
		System.out.println(students);
		
		System.out.println("Roll No 5: " + students.get(5));
		
		for(Map.Entry<Integer, String> s : students.entrySet())
		{
			System.out.println(s);
		}
	}

}
