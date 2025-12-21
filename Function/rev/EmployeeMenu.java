/*Q2. Write a menu driven program in java to Create a class name
 as Employee to hold empid, empname , empemail , empcontact and empsalry. The menu options should be: 
 1. Add Employee Details. 2. Display All Employee Details. 3. Search Employee By Id then employee is found or not.
 4. Update Employee Details By empcontact. 5. Delete Employee Details By empsalary.*/
import java.util.ArrayList;
import java.util.Scanner;
 
class Employee {
    int empid;
    String empname;
    String empemail;
    String empcontact;
    double empsalary;

    // Parameterized Constructor
    Employee(int empid, String empname, String empemail, String empcontact, double empsalary) {
        this.empid = empid;
        this.empname = empname;
        this.empemail = empemail;
        this.empcontact = empcontact;
        this.empsalary = empsalary;
    }

    // Display method
    void display() {
        System.out.println(empid + "\t" + empname + "\t" + empemail + "\t" + empcontact + "\t" + empsalary);
    }
}

public class EmployeeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        int choice;
        do {
            System.out.println("\n----- EMPLOYEE MENU -----");
            System.out.println("1. Add Employee Details");
            System.out.println("2. Display All Employee Details");
            System.out.println("3. Search Employee By Id");
            System.out.println("4. Update Employee Details By Contact");
            System.out.println("5. Delete Employee Details By Salary");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Employee Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Employee Contact: ");
                    String contact = sc.nextLine();

                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();

                    list.add(new Employee(id, name, email, contact, salary));
                    System.out.println("Employee Added Successfully");
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("No Employee Records Found");
                    } else {
                        System.out.println("ID\tName\tEmail\tContact\tSalary");
                        for (Employee e : list) {
                            e.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int sid = sc.nextInt();
                    boolean found = false;

                    for (Employee e : list) {
                        if (e.empid == sid) {
                            System.out.println("Employee Found:");
                            e.display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee Not Found");
                    }
                    break;

                case 4:
                    System.out.print("Enter Contact Number to Update: ");
                    sc.nextLine();
                    String oldContact = sc.nextLine();
                    boolean updated = false;

                    for (Employee e : list) {
                        if (e.empcontact.equals(oldContact)) {
                            System.out.print("Enter New Name: ");
                            e.empname = sc.nextLine();

                            System.out.print("Enter New Email: ");
                            e.empemail = sc.nextLine();

                            System.out.print("Enter New Salary: ");
                            e.empsalary = sc.nextDouble();

                            updated = true;
                            System.out.println("Employee Updated Successfully");
                            break;
                        }
                    }
                    if (!updated) {
                        System.out.println("Employee Not Found");
                    }
                    break;

                case 5:
                    System.out.print("Enter Salary to Delete Employee: ");
                    double delSalary = sc.nextDouble();
                    boolean deleted = false;

                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).empsalary == delSalary) {
                            list.remove(i);
                            deleted = true;
                            System.out.println("Employee Deleted Successfully");
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Employee Not Found");
                    }
                    break;

                case 6:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 6);
    }
}


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Business Co</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

<!-- Header -->
<header class="header">
    <div class="logo">Business Co</div>
    <div class="menu">☰</div>
</header>

<!-- Hero Section -->
<section class="hero">
    <div class="hero-text">
        <h1>We help your brand to be recognizable</h1>
        <p>
            Quis autem vel eum iure reprehenderit qui in ea voluptate
            velit esse quam nihil molestiae consequatur.
        </p>
        <button>LEARN MORE</button>
    </div>
    <div class="hero-img">
        <img src="image1.jpg" alt="Team">
    </div>
</section>

<!-- Features -->
<section class="features">
    <div class="feature dark">
        <h3>Quality Product</h3>
        <p>Lorem ipsum dolor sit amet consectetur.</p>
    </div>
    <div class="feature cyan">
        <h3>Growth Strategy</h3>
        <p>Lorem ipsum dolor sit amet consectetur.</p>
    </div>
    <div class="feature light">
        <h3>Competitive Price</h3>
        <p>Lorem ipsum dolor sit amet consectetur.</p>
    </div>
</section>

<!-- About -->
<section class="about">
    <h2>About Company</h2>
    <p>
        Lorem ipsum dolor sit amet, consectetur adipiscing elit.
        Sed do eiusmod tempor incididunt.
    </p>
    <button>READ MORE</button>
</section>

<!-- Split Section -->
<section class="split">
    <div class="split-img">
        <img src="image2.jpg" alt="">
    </div>
    <div class="split-text">
        <h2>Doing The Right Thing, At The Right Time</h2>
        <p>
            Lorem ipsum dolor sit amet consectetur adipisicing elit.
        </p>
        <button>LEARN MORE</button>
    </div>
</section>

<!-- Services -->
<section class="services">
    <h2>Our Services</h2>
    <div class="service-box">
        <div class="service">Branding</div>
        <div class="service">Marketing</div>
        <div class="service">Development</div>
        <div class="service">Web Design</div>
        <div class="service">Social Media</div>
        <div class="service">Ecommerce</div>
    </div>
</section>

<!-- CTA -->
<section class="cta">
    <h2>We engage positive communication</h2>
    <button>LEARN MORE</button>
</section>

<!-- Footer -->
<footer class="footer">
    <p>Business and Marketing</p>
</footer>

</body>
</html>
