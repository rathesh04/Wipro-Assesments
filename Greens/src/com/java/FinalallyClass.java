package com.java;

public class FinalallyClass {
	public static void main(String[] args) {
		
		
		try {
			int a = 10/0;
			System.out.println(a);
						
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}finally {
			System.out.println("Finaly Block Always Executes");
		}
	}

}
