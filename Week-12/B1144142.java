import java.util.InputMismatchException;
import java.util.Scanner;

public class B1144142 {
    public static void main(String[] args) {
        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int [] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int num = 0;
        boolean bError = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("輸入一個介於1和12之間的整數: ");

        do {
            try {
                num = scanner.nextInt();
                if (num >= 1 && num <= 12)
                    bError = false;
                else
                    throw new ArrayIndexOutOfBoundsException();
            } catch (InputMismatchException e) {
                System.out.println("Input is not an integer");
                System.out.print("輸入一個介於1和12之間的整數: ");
                scanner.nextLine();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Input is a wrong month number");
                System.out.print("輸入一個介於1和12之間的整數: ");
                scanner.nextLine();
            }
        } while (bError);

        System.out.println(months[num-1] + " 有 " + daysOfMonth[num-1] + " 天");
        scanner.close();

    }
}
