public class Account {
    private int accno;
    private String accname;
    private double balance;

    public Account(int accno, String accname, double balance) {
        this.accno = accno;
        this.accname = accname;
        this.balance = balance;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getAccname() {
        return accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void sortAccount(Account[] accounts) {
        for (int i = 0; i < accounts.length - 1; i++) {
            for (int j = i + 1; j < accounts.length; j++) {
                if (accounts[i].getBalance() > accounts[j].getBalance()) {
                    Account temp = accounts[i];
                    accounts[i] = accounts[j];
                    accounts[j] = temp;
                }
            }
        }
    }

    public static void displayAccountDetails(Account[] accounts) {
        for (Account account : accounts) {
            System.out.println("Account number: " + account.getAccno());
            System.out.println("Account name: " + account.getAccname());
            System.out.println("Balance: " + account.getBalance());
        }
    }

    public static void main(String[] args) {
        int n = 5;
        Account[] accounts = new Account[n];

        for (int i = 0; i < n; i++) {
            accounts[i] = new Account(i + 1, "Account " + (i + 1), 1000 + (i * 100));
        }

        // Sort the accounts array on the basis of balance
        sortAccount(accounts);

        // Display account details in sorted order
        System.out.println("Account details in sorted order:");
        displayAccountDetails(accounts);
    }
}

