package com.ExceptionDemos;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class D03VectorDemo {

	public static void main(String[] args) {
		List<String>st = new Vector<>();
		st.add("One");
		st.add("Two");
		st.add("Three");
		
		System.out.println(st);
		
		//java.util.Enumeration en = st.el
		
		Enumeration months;
        Vector<String> monthNames = new Vector<>();
 
        monthNames.add("January");
        monthNames.add("February");
        monthNames.add("March");
        monthNames.add("April");
        monthNames.add("May");
        monthNames.add("June");
        monthNames.add("July");
        monthNames.add("August");
        monthNames.add("September");
        monthNames.add("October");
        monthNames.add("November");
        monthNames.add("December");
        months = monthNames.elements();
 
        while (months.hasMoreElements()) {
            System.out.println(months.nextElement());
        }
	}

}
