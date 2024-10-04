import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private double percentage;

    // Default constructor
    public Student() {
        this.rollNo = 0;
        this.name = "N/A";
        this.percentage = 0.0;
    }

    // Parameterized constructor
    public Student(int rollNo, String name, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }

    public void display() {
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("Percentage: " + this.percentage + "%");
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Percentage: ");
            double percentage = scanner.nextDouble();

            students[i] = new Student(rollNo, name, percentage);
        }

        System.out.println("Student Details:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1));
            students[i].display();
        }
    }
}

