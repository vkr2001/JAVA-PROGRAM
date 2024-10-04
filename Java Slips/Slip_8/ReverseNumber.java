public class ReverseNumber {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ReverseNumber <number>");
            return;
        }

        // Parse the number from the command line argument
        int number = Integer.parseInt(args[0]);

        // Reverse the number
        int reversedNumber = reverseNumber(number);

        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        return reversedNumber;
    }
}

