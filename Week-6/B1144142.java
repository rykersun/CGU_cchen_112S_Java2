
public class B1144142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle2D c1 = new Circle2D(2, 2, 4);
		Circle2D c2 = new Circle2D(5, 6, 2.0);
		
		System.out.println("c1's Area: " + c1.getArea());
		System.out.println("c2's Perimeter: " + c2.getPerimeter());
		
		System.out.println(c1.contains(3, 3));
		System.out.println(c1.getDistance(c2));
		System.out.println(c1.overlaps(c2));

	}

}
