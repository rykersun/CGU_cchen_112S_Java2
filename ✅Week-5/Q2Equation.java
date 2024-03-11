
public class Q2Equation {
	
	private double a;
	private double b;
	private double c;
	
	Q2Equation(double new_a, double new_b, double new_c) {
		a = new_a;
		b = new_b;
		c = new_c;
	}
	
	public double getDiscrimnant() {
		return b * b - (4 * a * c);
	}
	
	public double getRoot1() {
		if (this.getDiscrimnant() >= 0)
			return ((-1 * b) + Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
		return 0;
	}

	public double getRoot2() {
		if (this.getDiscrimnant() >= 0)
			return ((-1 * b) - Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
		return 0;
	}
}
