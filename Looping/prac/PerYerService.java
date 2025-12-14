/*Q41. Employee salary hike based on performance and years of service:
Input: Basic salary, Years of service, Performance rating (1–5)
Logic:
If rating >= 4 and service > 5 yrs → 20% hike
Else if rating >= 3 → 10%
Else → 5%
Output: New salary. */

import java.util.*;
public class PerYerService {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		//int num = sc.nextInt();
		double salary = sc.nextDouble();
        int years = sc.nextInt();
        int rating = sc.nextInt();
        double hike = 0;

        if (rating >= 4 && years > 5) hike = 0.20;
        else if (rating >= 3) hike = 0.10;
        else hike = 0.05;

        double newSalary = salary + (salary * hike);
        System.out.println("New Salary: " + newSalary);
    }
}
