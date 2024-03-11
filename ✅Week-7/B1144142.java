
public class B1144142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(6, 8);
		
		System.out.println("p1's x: " + p1.getX());
		System.out.println("p2's y: " + p2.getY());
		System.out.println("p1.getDistance(p2): " + p1.getDistance(p2));
		System.out.println("p2.getDistance(3, 4): " + p2.getDistance(3, 4));
		System.out.println("MyPoint.getDistance(p1, p2): " + MyPoint.getDistance(p1, p2));

	}

}
