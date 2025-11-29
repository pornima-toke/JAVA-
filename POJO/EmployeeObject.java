/*2. Employee Salary Increment
Task: Create an Employee class with fields: name, salary, and department.In the main method: Create an Employee object.
Increase the employee's salary by 10% and print the updated salary.
Explanation:
 This introduces instance variable manipulation and basic arithmetic operations. */

import java.util.*;

class Employee {
   private String name;
   private int  salary;
   private String department;
   
   public String getName()
   {
      return name;
   }
   public void setName( String name)
   {
      this.name = name;
   }
   
   public int getSalary()
   {
       return salary;
   }
   public void setSalary(int salary)
   {
       this.salary = salary;
   }   
   
   public String getDepartment()
   {
      return department;
   }
   public void setDepartment(String department)
   {
      this.department = department;
   }      
}

        //main method
	public class EmployeeObject
	{
		public static void main(String x [])
		{
			Scanner sc = new Scanner (System.in);
			System.out.print("Enter the employee's salary: ");
			Employee e = new Employee();
	
	System.out.println("Enter the Employee name:");
	String n = sc.nextLine();
	
	e.setName(n);
	
	System.out.println("Enter the Employee salary:");
	int s = sc.nextInt();
	
	sc.nextLine();
	
	e.setSalary(s);
	
	System.out.println("Enter the Employee department:");
	String d = sc.nextLine();
	
	e.setDepartment(d);
	
	int sal1 = e.getSalary();
	sal1=sal1 + (sal1*10)/100;
	
	e.setSalary(sal1);
	System.out.println();
	
	System.out.println(e.getName() +"\t"+ e.getSalary()+"\t"+ e.getDepartment());
		}
	}