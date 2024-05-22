package com.SecondPackage;

import java.util.Scanner;

//import com.AbstractDemos.TrialClass;
//import com.AbstractDemos.Circle;
import com.AbstractDemos.*;

public class DefaultDemo {

	public static void main(String[] args) {
		//com.AbstractDemos.TrialClass t1 = new com.AbstractDemos.TrialClass();
		//t1.sayHello();
		//t1.goodBye();
		
		TrialClass t1 = new TrialClass();
		t1.toString();
		
		Circle c1 = new Circle(5);
		
		String s = "ss";
		Scanner scn = new Scanner(System.in);
		
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println("Enter element");
			arr[i] = scn.nextInt();
		}
		System.out.println(arr[5]);
		
		for(int n : arr)
			System.out.println(n);
		
		/*for(int i = 0; i < 5; )
		{
			System.out.println(i);
		}*/
	}

}
