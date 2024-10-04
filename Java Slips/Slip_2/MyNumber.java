/* Define a class MyNumber having one private integer data member. Write a default constructor 
initialize it to 0 and another constructor to initialize it to a value. Write methods isNegative, 
isPositive, isOdd, iseven. Use command line argument to pass a value to the object and perform
the above operations.*/


public class MyNumber {
    private int number;

    // Default constructor initializes the number to 0
    public MyNumber() {
        number = 0;
    }

    // Constructor to initialize the number to a specific value
    public MyNumber(int value) {
        number = value;
    }

    public boolean isNegative() {
        return number < 0;
    }

    public boolean isPositive() {
        return number > 0;
    }

    public boolean isOdd() {
        return number % 2 != 0;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide one integer value as a command line argument.");
            return;
        }

        try {
            int value = Integer.parseInt(args[0]);
            MyNumber num = new MyNumber(value);

            System.out.println("Number: " + num.number);
            System.out.println("Is Negative? " + num.isNegative());
            System.out.println("Is Positive? " + num.isPositive());
            System.out.println("Is Odd? " + num.isOdd());
            System.out.println("Is Even? " + num.isEven());
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer value provided.");
        }
    }
}

