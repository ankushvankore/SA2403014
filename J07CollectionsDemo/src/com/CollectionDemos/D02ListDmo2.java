package com.CollectionDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D02ListDmo2 {

	public static void main(String[] args) {
		List<Integer>nos = new ArrayList<Integer>();
		nos.add(43);
		nos.add(54);
		nos.add(86);
		nos.add(33);
		nos.add(65);
		nos.add(23);
		
		System.out.println("Original List");
		System.out.println(nos);
		Collections.sort(nos);
		System.out.println("After sorting");
		System.out.println(nos);
		Collections.reverse(nos);
		System.out.println("After reversing");
		System.out.println(nos);
		
		//We cannot create collection of permeative data type
		//Wrapper class represents premeative data type to non premeative data type
	}

}
