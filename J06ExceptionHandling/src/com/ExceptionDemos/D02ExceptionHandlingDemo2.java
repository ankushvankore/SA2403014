package com.ExceptionDemos;


public class D02ExceptionHandlingDemo2 {

	public static void showMessage() throws InterruptedException
	{
		System.out.println("I am in method");
		Thread.sleep(5000);
		System.out.println("Method ended...");
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Started...");
		
		showMessage();
		
		System.out.println("Main Ended...");
		
		int arr[] = {3,4,5,2,6,9,4,21,66};
		
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			if(max < arr[i])
				max = arr[i];
		}
		
		System.out.println("Max: " + max);
	}

}
