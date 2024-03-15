import java.util.Scanner;

public class B1144142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double side1, side2, side3;
		String color;
		boolean filled;
		Scanner input = new Scanner(System.in);
		
		System.out.print("請輸入三角形的三邊(side1): ");
		side1 = input.nextDouble();

		System.out.print("請輸入三角形的三邊(side2): ");
		side2 = input.nextDouble();
		
		System.out.print("請輸入三角形的三邊(side3): ");
		side3 = input.nextDouble();
		
		System.out.print("請輸入三角形的顏色: ");
		color = input.next();
		
		System.out.print("請輸入三角形是否為實心: ");
		filled = input.nextBoolean();
		
		System.out.println("");
		
		Triangle triangle1 = new Triangle(side1, side2, side3, color, filled);

		System.out.println(triangle1.toString());
		System.out.println("三角形的面積: " + triangle1.getArea());
		System.out.println("三角形的周邊長度: " + triangle1.getPerimeter());
		System.out.println("三角形的顏色: " + triangle1.getColor());
		System.out.print("三角形是否為實心: ");
		
		if (triangle1.isFilled())
			System.out.println("是, 實心");
		else
			System.out.println("否, 空心");

	}

}
