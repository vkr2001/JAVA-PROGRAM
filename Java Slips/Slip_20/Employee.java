public class Employee {
    private int id;
    private String name;
    private String deptName;
    private double salary;
    private static int objectCount = 0;

    public Employee() {
        this.id = 0;
        this.name = " ";
        this.deptName = " ";
        this.salary = 0.0;
        objectCount++;
    }

    public Employee(int id, String name, String deptName, double salary) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        objectCount++;
    }

    public static int getObjectCount() {
        return objectCount;
    }

    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department Name: " + deptName);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Vishal Dhare", "Sales", 50000.0);
        System.out.println("Object Count: " + Employee.getObjectCount());
        emp1.display();

        Employee emp2 = new Employee(2, "Vijay Kulkarni", "RND", 60000.0);
        System.out.println("Object Count: " + Employee.getObjectCount());
        emp2.display();
    }
}

