
public class ConditionalStatement {
	
	public static void main(String[] args) {
		
		int i = 5;
switch (i) {
case 1:
	System.out.println("Tamil");
	break;
case 2:
	System.out.println("English");
	break;
	case 3:
		System.out.println("Telugu");
	break;
	case 4:
		System.out.println("Hindi");
default:
	System.out.println("Invalid Launguage");
} // Switch Statement
		
		
		
		int marks = 39;
		
		if (marks >= 90) {
			System.out.println("Grade : A");
		}else if (marks >= 75) {
			System.out.println("Grade : B");
			
		}else if (marks >= 60) {
			System.out.println("Grade : C");
			
		}else if (marks >= 40) {
			System.out.println("Grade : D");
		}else {
			System.out.println("Fail");
		}
		 // if else Ladder Statement
		
		
		
		
		int num = 11;
		
		if (num % 2 == 0) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is Odd");
		}
		
		// if else Statement
		
		
		int num = 5;
		
		if (num > 0) {
		System.out.println("Number is Positive");
			
		} // if Statement
	}

}
