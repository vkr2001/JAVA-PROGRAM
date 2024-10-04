public class MyNumber {
    private int number;

    public MyNumber(int value) {
        this.number = value;
    }

    public boolean isOdd() {
        return number % 2 != 0;
    }

    public static void main(String[] args) {
        if (args.length == 1) {
            try {
                int value = Integer.parseInt(args[0]);
                MyNumber myNumber = new MyNumber(value);

                if (myNumber.isOdd()) {
                    System.out.println(value + " is an odd number.");
                } else {
                    System.out.println(value + " is an even number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please provide a valid integer.");
            }
        } else {
            System.out.println("Please enter any number at command line.");
        }
    }
}

