package Example;
import java.util.*;

class Staff 
{
    String name;
    double salary;

    // Constructor
    Staff(String name, double salary) 
    {
        this.name = name;
        this.salary = salary;
    }

    double incrementSalary() 
    {
        return salary; // Default, no increment
    }

    // Display method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Original Salary: " + salary);
    }
}

// Subclass for Teaching Staff
class TeachingStaff extends Staff 
{
    TeachingStaff(String name, double salary) 
    {
        super(name, salary); // Constructor chaining
    }

    // Overriding method
    double incrementSalary() 
    {
        double newSalary = salary + (salary * 0.15); // 15% increase
        return newSalary;
    }
}

// Subclass for Non-Teaching Staff
class NonTeachingStaff extends Staff 
{

    NonTeachingStaff(String name, double salary) 
    {
        super(name, salary);
    }

    // Overriding method
    double incrementSalary() 
    {
        double newSalary = salary + (salary * 0.10); // 10% increase
        return newSalary;
    }
}

// Main class
public class StaffSalaryDemo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Input Teaching staff details
        System.out.println("Enter Teaching Staff Name and Salary:");
        String tname = sc.next();
        double tsalary = sc.nextDouble();

        // Input Non-Teaching staff details
        System.out.println("Enter Non-Teaching Staff Name and Salary:");
        String ntname = sc.next();
        double ntsalary = sc.nextDouble();

        // Create objects
        TeachingStaff t = new TeachingStaff(tname, tsalary);
        NonTeachingStaff nt = new NonTeachingStaff(ntname, ntsalary);

        // Display results
        System.out.println("\n--- Teaching Staff ---");
        t.display();
        System.out.println("New Salary after 15% increment: " + t.incrementSalary());

        System.out.println("\n--- Non-Teaching Staff ---");
        nt.display();
        System.out.println("New Salary after 10% increment: " + nt.incrementSalary());

	}

}
