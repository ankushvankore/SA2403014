package com.InheritanceDemos;

public class Demo {
	public static void main(String[] args) {
		String str = "Star Agile";
		String str1 = "", str2 = "";
		
		String s[] = str.split(" ");
		System.out.println(s[0]);
		System.out.println(s[1]);
		
		str = s[1] + " " + s[0];
		
		System.out.println(str);
		
	}
}
