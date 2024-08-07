package com.ArrayDemos;

import java.util.Arrays;

public class D02Initilization2 {
	public static void main(String[] args) {
		//int[]marks = new int[] {37, 54, 35, 65, 76, 45, 87, 88, 51, 60};
		int[]marks = {37, 54, 35, 65, 76, 45, 87, 88, 51, 60};
		
		//marks.length => will give total no of elements in array
		for(int i = 0; i < marks.length; i++)
		{
			System.out.println(marks[i]);
		}
		
		int temp;
		for(int i = 0; i < marks.length; i++)
		{
			for(int j = i + 1; j < marks.length-1; j++)
			{
				if(marks[j] > marks[j+1])
				{
					temp = marks[j];
					marks[j] = marks[j+1];
					marks[j+1] = temp;
				}
			}
		}
		
		for(int m : marks)
			System.out.println(m);
		
		Arrays.sort(marks);
		
		System.out.println("Array After Sorting");
		/*for(int i = 0; i < marks.length; i++)
		{
			System.out.println(marks[i]);
		}*/
		
		for(int m : marks)
		{
			System.out.println(m);
		}
		/*
		 * Enhanced for loop / for each loop
		 * 1. It is forword only loop
		 * 2. It is read only loop
		 */
		
	}

}
