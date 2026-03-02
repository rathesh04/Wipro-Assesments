package positive;

class vechicle1 {
		void start() {
		System.out.println("A vechicle starts");
		}
}
			
class Verna extends vechicle1{
			void start() {
				System.out.println("Verna starts");
			}
		

		public static void main(String[] args) {
			Verna v = new Verna();
			v.start();
		}
}
		

