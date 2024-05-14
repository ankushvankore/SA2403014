package com.ArrayDemos;

public class D04StringDemo {

	public static void main(String[] args) {
		/*
		 * String => Collection of characters
		 * 1D Array of characters
		 * First class object in Java
		 */
		
		//String name = new String("Manasa");
		String name = "Manasa";
		
		System.out.println("Total characters: " + name.length());
		
		/*for(int i = 0; i < name.length(); i++)
		{
			System.out.println(name.charAt(i));
		}*/
		System.out.println("Name: " + name);
		
		name = "Manasa StarAgile";
		System.out.println(name);
	}

}
