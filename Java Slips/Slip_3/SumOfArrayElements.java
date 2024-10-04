import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid positive integer for n.");
            return;
        }

        int[] numbers = new int[n]; // Create an array to store the numbers

        System.out.println("Enter " + n + " different numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Calculate the sum of the elements in the array
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum of the elements in the array is: " + sum);

        sc.close(); // Close the scanner to release resources
    }
}

