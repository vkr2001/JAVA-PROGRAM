import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the size of array
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        // Create an array of size 'n'
        int[] numbers = new int[n];

        // Prompt the user to enter 'n' different numbers
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Find the maximum number in the array
        int max = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Display the maximum number
        System.out.println("The maximum number in the array is: " + max);

        // Close the scanner
        sc.close();
    }
}

