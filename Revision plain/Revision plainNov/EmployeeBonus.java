package InheritanceExample;
import java.util.*;

// Base class
class Employee {
    String name;
    double salary;

    // Constructor to initialize employee details
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to calculate total salary (to be overridden by subclasses)
    double calculateTotalSalary() {
        return salary;
    }

    // Display employee details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + salary);
    }
}

// Subclass Manager
class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    // Override to include 20% bonus
    double calculateTotalSalary() {
        return salary + (salary * 0.20);
    }
}

// Subclass Developer
class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    // Override to include 10% bonus
    double calculateTotalSalary() {
        return salary + (salary * 0.10);
    }
}

// Main class
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Manager details
        System.out.print("Enter Manager Name: ");
        String mName = sc.nextLine();
        System.out.print("Enter Manager Salary: ");
        double mSalary = sc.nextDouble();

        // Input Developer details
        sc.nextLine(); // consume newline
        System.out.print("Enter Developer Name: ");
        String dName = sc.nextLine();
        System.out.print("Enter Developer Salary: ");
        double dSalary = sc.nextDouble();

        // Create objects
        Manager m = new Manager(mName, mSalary);
        Developer d = new Developer(dName, dSalary);

        // Display results
        System.out.println("\n--- Manager Details ---");
        m.display();
        System.out.println("Total Salary (with 20% bonus): " + m.calculateTotalSalary());

        System.out.println("\n--- Developer Details ---");
        d.display();
        System.out.println("Total Salary (with 10% bonus): " + d.calculateTotalSalary());
    }
}
