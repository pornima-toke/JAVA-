/*Q5. Write program to create POJO class name as Employee with id,name and salary attribute and
store data in object and retrieve data from object*/

import java.util.*;
class Employee{
	private int id;
	private String name;
	private int salary;
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setSalary(int salary){
		this.salary = salary;
	}
	
	public int getSalary(){
		return salary;
	}
}

public class EmployeeAppRevision{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	Employee e = new Employee();
	
	System.out.println("Enter the Employee id:");
	int i = sc.nextInt();
	e.setId(i);
	
	System.out.println("Enter the Employee name:");
	String n = sc.next();
	e.setName(n);
	
	System.out.println("Enter the Employee salary:");
	int s = sc.nextInt();
	e.setSalary(s);
	System.out.println("Id"+"\t"+"Name"+"\t"+ "salary");
	System.out.println(e.getId()+ "\t" +e.getName() + "\t" + e.getSalary());
	}
}
