class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Programmer extends Employee {
    String proglanguage;

    public Programmer(String name, double salary, String proglanguage) {
        super(name, salary);
        this.proglanguage = proglanguage;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: Rs. " + salary);
        System.out.println("Programming Language: " + proglanguage);
    }
    
    public static void main(String[] args) {
        Programmer pg = new Programmer("Mahesh Atole", 30000, "Java");
        pg.displayDetails();
    }
}

