	package rathesh;

public class Empolyeename {
	public static void main(String[] args) {
	String array[]= {"rathesh prabu","reshma sri","thavamani","prabu"};
	for(int i=0;i<array.length;i++) {
		String name=array[i];
		if(name.length()>10) {
			System.out.println("Long name");}
			else if (!name.contains(" ")) {
				System.out.println("Single word name");}
			else {
				System.out.println("Normal name");}
				System.out.println(name.toUpperCase());
				StringBuffer rev = new StringBuffer(name);
				System.out.println(rev.reverse());
				StringBuilder app = new StringBuilder(name);
				System.out.println(app.append("-verified"));
	}
	}
}
