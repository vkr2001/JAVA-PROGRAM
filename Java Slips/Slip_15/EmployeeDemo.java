class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Developer extends Employee {
    String proj;

    public Developer(String name, double salary, String proj) {
        super(name, salary);
        this.proj = proj;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: Rs. " + salary);
        System.out.println("Project Name: " + proj);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Developer developer = new Developer("Madan Gaikwad", 60000, "Project X");
        developer.displayDetails();
    }
}

