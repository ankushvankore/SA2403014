package com.FileHandlingDemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D02ReadFromFile {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Demo.txt");
		Scanner scn = new Scanner(file);

		while (scn.hasNext())
			System.out.println(scn.nextLine());

		scn.close();
		
		for(int i = 1; i <= 10; i++)
			System.out.println("Dhana"+i);
	
	}
}
