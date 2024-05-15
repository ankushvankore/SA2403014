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
		
		System.out.println("Character at 5 index: " + name.charAt(5));
		System.out.println("Index of A: " + name.indexOf("A"));
		
		name = name.replace("A", "a");
		System.out.println("After replacement: " + name);
		
		name = name.replace("a", "A");
		System.out.println("After replacement: " + name);
		
		name = name.toUpperCase();
		System.out.println("After Upper: " + name);
		
		name = name.toLowerCase();
		System.out.println("After Lower: " + name);
		
		String str1 = "tushar", str2 = "Tushar Pawar";
		
		if(str1.equals(str2))
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		
		System.out.println(str2.contains("Tus"));
		System.out.println(str2.contains(str1));
		
	}

}
