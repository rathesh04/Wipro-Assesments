package com.java;

public class ThisClassExample {

	int a;

	ThisClassExample(int a) {
		this.a = a;
	}

	void didplay() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		ThisClassExample obj = new ThisClassExample(50);
		obj.didplay();
		
		
	}

}
