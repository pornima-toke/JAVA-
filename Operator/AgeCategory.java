/*Q53.Given age, print category:
Teen (13–19)


Adult (20–59)


Senior (60+) */

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();  // Read age input

        if (age >= 13 && age <= 19) {
            System.out.println("Category: Teen");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Category: Adult");
        } else if (age >= 60) {
            System.out.println("Category: Senior");
        } else {
            System.out.println("Not categorized (child or invalid age)");
        }
    }
}

