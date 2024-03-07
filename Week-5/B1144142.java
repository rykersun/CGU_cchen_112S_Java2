import java.util.Scanner;

public class B1144142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, b, c;
		Scanner input = new Scanner(System.in);
		
		System.out.println("輸入一個一元二次方程式的三個係數值a、b和c");

		System.out.print("a: ");
		a = input.nextDouble();

		System.out.print("b: ");
		b = input.nextDouble();

		System.out.print("c: ");
		c = input.nextDouble();
		
		Q2Equation result = new Q2Equation(a, b, c);
		
		if (result.getDiscrimnant() > 0) {
			System.out.println("兩個根為 " + result.getRoot2() + " 與 " + result.getRoot1());
		}
		if (result.getDiscrimnant() == 0) {
			System.out.println("一個根為 " + result.getRoot1());
		}
		if (result.getDiscrimnant() < 0) {
			System.out.println("此方程式沒有根");
		}
	}
}
