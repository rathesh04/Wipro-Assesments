package com.practice;

import java.util.Scanner;

public class IfElseLadder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		int roll = sc.nextInt();
		int English = sc.nextInt();
		int Maths = sc.nextInt();
		int Science = sc.nextInt();
		int Social = sc.nextInt();
		int Computer = sc.nextInt();
		sc.close();
		
		int total_marks = English+Maths+Science+Social+Computer;
		double avg = total_marks/5;
		
		System.out.println("Name :" + name);
		System.out.println("Roll :" + roll);
		System.out.println("Total marks :" + total_marks);
		System.out.println("Average :"+ avg);
		
		if (avg >= 50) {
			System.out.println("Result : Pass");
		
		if (avg >=90) {
			System.out.println("Grade : A");
		}else if (avg>=80) {
			System.out.println("Grade : B");
		}else if (avg >= 70) {
			System.out.println("Grade : C");
		}else {
			System.out.println("Grade  : D");
		}
		}else{
			System.out.println("Result : Fail");
			System.out.println("Grade : -");
			
		}
	}
}
