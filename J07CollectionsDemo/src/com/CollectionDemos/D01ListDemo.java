package com.CollectionDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D01ListDemo {

	public static void main(String[] args) {
		List<String>students = new ArrayList<String>();

		students.add("Anu");
		//.add() will add elements in the list
		students.add("Kavita");
		students.add("Rajlakshmi");
		students.add("Rohini");
		students.add("Bunty");
		students.add("Tushar");
		
		System.out.println("Total students in list: " + students.size());
		students.add("Dhana");
		students.add("Ankush");
		
		System.out.println("Total students in list: " + students.size());
		//.size() will return total no of elements in the list
		
		System.out.println("4th Student: " + students.get(3));
		//.get() will return the element at specific index
		
		for(int i = 0; i < students.size(); i++)
			System.out.println(i+1 + ". " + students.get(i));
		
		Collections.sort(students);
		System.out.println("After Sorting...");
		
		/*for(String st : students)
			System.out.println(st);*/
		
		System.out.println(students);
		
		//Deleting element from the list
		//students.remove(0);
		students.remove("Ankush");
		
		System.out.println("After removing: " + students);
		
	}

}
