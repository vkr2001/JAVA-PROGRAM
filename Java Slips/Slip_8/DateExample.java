import java.util.Scanner;

// Custom exception class to handle invalid dates
class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

// MyDate class with day, month, and year fields
class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public void acceptDate() throws InvalidDateException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day (dd): ");
        int inputDay = scanner.nextInt();
        System.out.print("Enter the month (mm): ");
        int inputMonth = scanner.nextInt();
        System.out.print("Enter the year (yyyy): ");
        int inputYear = scanner.nextInt();

        if (isValidDate(inputDay, inputMonth, inputYear)) {
            this.day = inputDay;
            this.month = inputMonth;
            this.year = inputYear;
        } else {
            throw new InvalidDateException("Invalid date input.");
        }
    }

    private boolean isValidDate(int day, int month, int year) {
        if (year < 1 || month < 1 || month > 12 || day < 1 || day > getDaysInMonth(month, year)) {
            return false;
        }
        return true;
    }

    private int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else {
            return daysInMonth[month];
        }
    }

    private boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    public void displayDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}

public class DateExample {
    public static void main(String[] args) {
        MyDate myDate = new MyDate();

        try {
            myDate.acceptDate();
            myDate.displayDate();
        } catch (InvalidDateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

