package com.FileHandlingDemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class D01CreatingFile {

	public static void main(String[] args) throws IOException {
		File file = new File("Demo.txt");
		FileOutputStream fos = new FileOutputStream(file);
		// File is a class through which you can handle any kind of files

		System.out.println("File Created!!!");

		FileWriter writer = new FileWriter(file);
		writer.write("Files in Java are seriously good!!");
		writer.close();
		System.out.println("Successfully written.");
	}

}
