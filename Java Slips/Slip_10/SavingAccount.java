// Custom exception class for Insufficient Fund
class InsufficientFundException extends Exception {
    public InsufficientFundException(String message) {
        super(message);
    }
}

// SavingAccount class
class SavingAccount {
    private int acno;
    private String name;
    private double balance;
    private static final double MIN_BALANCE = 500;

    // Constructor
    public SavingAccount(int acno, String name, double balance) {
        this.acno = acno;
        this.name = name;
        this.balance = balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) throws InsufficientFundException {
        if (amount > 0) {
            if (balance - amount >= MIN_BALANCE) {
                balance -= amount;
                System.out.println("Withdrawn: Rs. " + amount);
            } else {
                throw new InsufficientFundException("Insufficient funds for withdrawal");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // View account balance
    public void viewBalance() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: Rs. " + balance);
    }

    public static void main(String[] args) {
        SavingAccount account = new SavingAccount(6134, "Rohan Joshi", 5000);

        account.viewBalance();

        try {
            account.withdraw(700);
            account.viewBalance();
            account.deposit(300);
            account.viewBalance();
            account.withdraw(1000);
        } catch (InsufficientFundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

