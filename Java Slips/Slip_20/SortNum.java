import java.util.Arrays;

public class SortNum {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide exactly 3 numbers as command-line arguments.");
            return;
        }

        // Convert the command-line arguments to integers
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please provide valid numbers as arguments.");
                return;
            }
        }

        // Sort the numbers
        Arrays.sort(numbers);

        // Display the sorted numbers
        System.out.print("Sorted Numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");           
        }
        System.out.println();
    }
}

