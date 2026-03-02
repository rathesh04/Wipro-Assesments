package com.java;


public class ChildClass extends ParentClass {
	
	void display() {
		System.out.println(super.x);
	}
	
	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		child.display();
	}

}
