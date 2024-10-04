class RollNoException extends Exception {
    public RollNoException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws RollNoException {
        if (rollNo < 13001 || rollNo > 13080) {
            throw new RollNoException("Roll Number is Not Within The Range");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        try {
            // Create a Student object with a valid roll number
            Student valStud = new Student(13015, "Mohan Sharma", 20, "Computer Science");
            valStud.displayInfo();

            // Try to create a Student object with an invalid roll number
            Student invalStud = new Student(13100, "Harsh Kamble", 25, "Physics");
            invalStud.displayInfo(); // This won't be reached due to the exception
        } catch (RollNoException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

