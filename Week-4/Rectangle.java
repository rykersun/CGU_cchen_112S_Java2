
public class Rectangle {
	
	double width;
	double height;
	
	Rectangle() {
		width = 1;
		height = 1;
	}
	
	Rectangle(double new_w, double new_h) {
		width = new_w;
		height = new_h;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return (width + height) * 2;
	}

}
