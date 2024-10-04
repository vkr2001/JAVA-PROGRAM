public class Student {
    private int rollno;
    private String name;
    private static int objectCount = 0;

    public Student() {
        objectCount++;
    }

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        objectCount++;
        System.out.println("Student object created. Object count: " + objectCount);
    }

    public static void main(String[] args) {
        Student student1 = new Student(101, "Manish");
        Student student2 = new Student(102, "Nitin");

        System.out.println("Total Student objects created: " + objectCount);
    }
}

