import java.util.*;

public class EmployeeHashTable {
    public static void main(String[] args) {
        // Create a Hashtable to store employee details
        Hashtable<String, Double> employeeSalaries = new Hashtable<>();

        // Add employee names and salaries to the Hashtable
        employeeSalaries.put("Ravi", 50000.0);
        employeeSalaries.put("Kiran", 60000.0);
        employeeSalaries.put("Vrushabh", 55000.0);
        employeeSalaries.put("Jatin", 70000.0);

        // Display the details of the Hashtable
        System.out.println("Employee Details:");

        // Using Enumeration to iterate through keys and values
        Enumeration<String> keys = employeeSalaries.keys();
        while (keys.hasMoreElements()) {
            String name = keys.nextElement();
            double salary = employeeSalaries.get(name);
            System.out.println("Name: " + name + ", Salary: " + salary);
        }
    }
}

