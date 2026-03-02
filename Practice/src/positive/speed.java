package positive;

public class speed {
	private int vechicleSpeed;
	
	public void setSpeed(int speed) {
		vechicleSpeed = speed;
	}
	public int getSpeed() {
		return vechicleSpeed;
	}
	
	public static void main(String[] args) {
		speed n = new speed();
		n.setSpeed(200);
		System.out.println(n.getSpeed());
	}

}

// Encapsulation
