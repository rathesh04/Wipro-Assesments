package rathesh;

import java.util.Scanner;

public class StudentsScore {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your name :");
	String s = sc.next();
	System.out.println("Enter your English Mark :");
	int a = sc.nextInt();
	System.out.println("Enter your Maths Mark :");
	int b = sc.nextInt();
	System.out.println("student" + s);
	System.out.println("English" + a);
	System.out.println("Maths" + b);
	System.out.println("Total : " + (a+b));
	double percentage = a+b/2.0;
	System.out.println("Percentage :"+percentage);
	if(percentage >=90)
		System.out.println("Grade : A");
	else if (percentage >=75 )
		System.out.println("Grade : B");
	else if (percentage >= 50)
		System.out.println("Grade : C");
	else
		System.out.println("Grade :Fail");
	
}
}
	

	

