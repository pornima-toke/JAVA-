/*3. Person Age Verification Task: Create a Person class with fields: name and age.In the main method:
Create a Person object.Check if the person is eligible to vote (age >= 18) and print the result.Explanation:
 This demonstrates condition checking using instance variables. */

package PojoClass;

import java.util.*;
public class PersonObjects 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
        // Create a person object
		Age person = new Age();
		
		System.out.print("Enter a name: ");
		person.setName(sc.nextLine());
		
		System.out.print("Enter a Age: ");
		person.setAge(sc.nextInt());
		
		// Check eligibility to vote
		if (person.getAge() >= 18)
		{
            System.out.println(person.getName() + " is eligible to vote.");
        }
		else
        {
            System.out.println(person.getName() + " is NOT eligible to vote.");
        }
		
	}

}

// create a class 
class Age {
	private String name;
	private int age;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
}
