import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String usr = sc.nextLine();

        // Convert the user's name to uppercase
        String ucase = usr.toUpperCase();

        // Greet the user
        System.out.println("Hello " + ucase + ", nice to meet you!");

        sc.close();
    }
}

