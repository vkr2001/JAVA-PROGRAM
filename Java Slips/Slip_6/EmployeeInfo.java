import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees (n): ");
        int n = scanner.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Employee " + (i + 1) + " details:");
            System.out.print("Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Employee Name: ");
            String name = scanner.nextLine();
            System.out.print("Employee Salary: ");
            double salary = scanner.nextDouble();

            employees[i] = new Employee(id, name, salary);
        }

        double maxSalary = employees[0].getSalary();
        String maxSalaryEmployeeName = employees[0].getName();

        for (int i = 1; i < n; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                maxSalaryEmployeeName = employees[i].getName();
            }
        }

        System.out.println("Employee with the maximum salary:");
        System.out.println("Name: " + maxSalaryEmployeeName);
        System.out.println("Salary: " + maxSalary);

        scanner.close();
    }
}

