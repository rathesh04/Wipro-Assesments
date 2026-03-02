package com.java;

public class LogicalOperator {
	public static void main(String[] args) {
		 int age = 20;     // AND operator
	        boolean hasID = true;

	        if (age >= 18 && hasID) {
	            System.out.println("Allowed");
	        } else {
	            System.out.println("Not Allowed");
	        }
	        
		 boolean hasTicket = false;    // OR operator
	        boolean hasPass = true;

	        if (hasTicket || hasPass) {
	            System.out.println("Can Enter");
	        } else {
	            System.out.println("Cannot Enter");
	        }
		  boolean isRaining = false;    // NOT operator

	        if (!isRaining) {
	            System.out.println("Go Outside");
	        }

        int a = 10;        // NOT equal to operator
        int b = 5;

        if (a != b) {
            System.out.println("Not Equal");
        }
		
	}

}
	