/*Q2. Write a menu driven program in java to Create a class name as Employee to hold empid, empname , empemail , empcontact and empsalry. The menu options should be:
 1. Add Employee Details. 2. Display All Employee Details. 3. Search Employee By Id then employee is found or not.
 4. Update Employee Details By empcontact. 5. Delete Employee Details By empsalary.*/
 
 import java.util.*;

class Employee {
    int empid;
    String empname;
    String empemail;
    String empcontact;
    double empsalary;

    // Constructor
    Employee(int empid, String empname, String empemail, String empcontact, double empsalary) {
        this.empid = empid;
        this.empname = empname;
        this.empemail = empemail;
        this.empcontact = empcontact;
        this.empsalary = empsalary;
    }

    // Display employee details
    void display() {
        System.out.println(empid + "  " + empname + "  " + empemail + "  " + empcontact + "  " + empsalary);
    }
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Employee Details");
            System.out.println("2. Display All Employee Details");
            System.out.println("3. Search Employee By Id");
            System.out.println("4. Update Employee Details By Contact");
            System.out.println("5. Delete Employee Details By Salary");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1: // Add employee
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Email: ");
                    String email = sc.next();
                    System.out.print("Enter Contact: ");
                    String contact = sc.next();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    list.add(new Employee(id, name, email, contact, salary));
                    System.out.println("Employee Added Successfully");
                    break;

                case 2: // Display all
                    if (list.isEmpty()) {
                        System.out.println("No Employee Records");
                    } else {
                        for (Employee e : list) {
                            e.display();
                        }
                    }
                    break;

                case 3: // Search by ID
                    System.out.print("Enter Employee ID to Search: ");
                    int sid = sc.nextInt();
                    boolean found = false;

                    for (Employee e : list) {
                        if (e.empid == sid) {
                            e.display();
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Employee Not Found");
                    break;

                case 4: // Update by contact
                    System.out.print("Enter Contact to Update: ");
                    String oldContact = sc.next();
                    boolean updated = false;

                    for (Employee e : list) {
                        if (e.empcontact.equals(oldContact)) {
                            System.out.print("Enter New Salary: ");
                            e.empsalary = sc.nextDouble();
                            updated = true;
                            System.out.println("Employee Updated Successfully");
                            break;
                        }
                    }
                    if (!updated)
                        System.out.println("Employee Not Found");
                    break;

                case 5: // Delete by salary
                    System.out.print("Enter Salary to Delete: ");
                    double delSal = sc.nextDouble();

                    Iterator<Employee> it = list.iterator();
                    boolean deleted = false;

                    while (it.hasNext()) {
                        Employee e = it.next();
                        if (e.empsalary == delSal) {
                            it.remove();
                            deleted = true;
                        }
                    }

                    if (deleted)
                        System.out.println("Employee Deleted Successfully");
                    else
                        System.out.println("Employee Not Found");
                    break;

                case 6:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);
    }
}
