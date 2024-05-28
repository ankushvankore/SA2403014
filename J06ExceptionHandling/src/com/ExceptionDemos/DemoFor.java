package com.ExceptionDemos;

public class DemoFor {

	public static void main(String[] args) {
		int i = 1;

		for (;;) {
			if (i <= 10)
				System.out.println(i);
			else
				break;
			i++;
		}
		/*
		*****
		*****
		*****
		*****
		*****
		*/

		for (i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

		/*
		 * 
		 * *
		 * * * 
		 * * * * 
		 * * * * *
		 */
		
		for (i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
