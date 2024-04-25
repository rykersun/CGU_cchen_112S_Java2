import java.util.*;

//public class InputMismatchExceptionDemo {
public class B1144142 {
    public static int bin2Dec(int number) throws NumberFormatException {
        String n = Integer.toString(number);
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) != '1' && n.charAt(i) != '0') {
                throw new NumberFormatException();
            }
        }
        return Integer.parseInt(n, 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter an integer: ");
                int number = input.nextInt();
                int result = bin2Dec(number);

                // Display the result
                System.out.println(
                        "The number entered is " + number);
                System.out.println("The binary number corresponds to " + result);

                continueInput = false;
            }
            catch (InputMismatchException ex) {
//                System.out.println("Try again. (" +
//                        "Incorrect input: an integer is required)");
                System.out.println("Try again. (Mismatch input: a binary number is required)");
                input.nextLine(); // discard input
            }
            catch (NumberFormatException ex) {
                System.out.println("Try again. (Incorrect number: a binary number is required)");
                input.nextLine();
            }
        } while (continueInput);
    }
}