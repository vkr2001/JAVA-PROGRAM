class AgeRangeException extends Exception {
    public AgeRangeException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeRangeException {
        if (age < 15 || age > 21) {
            throw new AgeRangeException("Age is not within the range of 15 to 21.");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class StudDetails {
    public static void main(String[] args) {
        try {
            // Create a student with valid age
            Student valstud = new Student(1, "Piyush Jadhav", 18, "Computer Science");
            valstud.display();

            // Create a student with an age outside the valid range (will throw an exception)
            Student invalstud = new Student(2, "Monika", 25, "Physics");
            invalstud.display(); // This won't be executed due to the exception
        } catch (AgeRangeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

