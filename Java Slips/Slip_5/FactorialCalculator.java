import java.util.Scanner;

class ZeroNumberException extends Exception {
    public ZeroNumberException() {
        super("Number is 0");
    }
}

public class FactorialCalculator {
    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num == 0) {
                throw new ZeroNumberException();
            } else {
                int result = calculateFactorial(num);
                System.out.println("Factorial of " + num + " is " + result);
            }
        } catch (ZeroNumberException e) {
            System.out.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}

