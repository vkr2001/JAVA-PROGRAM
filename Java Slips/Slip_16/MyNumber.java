public class MyNumber {
    private int value;

    public MyNumber(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide one integer as a command line argument.");
            return;
        }

        try {
            int inputValue = Integer.parseInt(args[0]);
            MyNumber myNumber = new MyNumber(inputValue);
            System.out.println("The Number " + inputValue + " is even ? " + myNumber.isEven());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid integer as a command line argument.");
        }
    }
}

