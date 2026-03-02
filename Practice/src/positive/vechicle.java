package positive;

public class vechicle {
	String name = "Rathesh";
	
	void show() {
	System.out.println(name);
	}
	
	class student extends vechicle{
		void showB() {
			System.out.println("12345");
		}
	}
	
	public static void main(String[] args) {
		vechicle v = new vechicle();
		vechicle.student a = v.new student();
		a.show();
		a.showB();
	}
}
// Inheritance
