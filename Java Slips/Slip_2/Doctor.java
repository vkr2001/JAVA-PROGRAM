/* Write a program to accept Doctor Name from the user and check whether it is valid or not.(It 
should not contain digits and special symbol) If it is not valid then throw user defined Exception -
Name is Invalid -- otherwise display the name. */
import java.util.*;

class InvalidNameException extends Exception {
}

class Doctor {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name = s.nextLine();

        try {
            for (int i = 0; i < name.length(); i++) {
                int ch = (int) name.charAt(i);
                if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                    // Valid character, do nothing
                } else {
                    throw new InvalidNameException();
                }
            }
            System.out.println("Doctor Name is: " + name);
        } catch (InvalidNameException e) {
            System.out.println("Invalid Doctor Name");
        }
    }
}

