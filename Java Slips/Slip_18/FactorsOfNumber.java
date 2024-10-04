public class FactorsOfNumber {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single number as a command-line argument.");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);
            if (number < 1) {
                System.out.println("Please enter a positive integer.");
                return;
            }

            System.out.print("Factors of " + number + ": ");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}

