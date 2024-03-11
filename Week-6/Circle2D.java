
public class Circle2D {
	
	private double r;
	private double x;
	private double y;
	
	Circle2D() {
		this(1, 0, 0);
	}
	
	Circle2D(double x, double y, double r) {
		this.r = r;
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public double getR() {
		return this.r;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(r, 2);
	}
	
	public double getPerimeter() {
		return Math.PI * 2 * r;
	}
	
	public boolean contains(double x, double y) {
		if (Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)) < r) {
			return true;
		}
		return false;
	}
	
	public double getDistance(Circle2D circleA) {
		return Math.sqrt(Math.pow(this.x - circleA.x, 2) + Math.pow(this.y - circleA.y, 2));
	}

	public boolean overlaps(Circle2D circleB) {
		if (this.getDistance(circleB) > this.r + circleB.r) {
			return false;
		}
		return true;
	}
}
