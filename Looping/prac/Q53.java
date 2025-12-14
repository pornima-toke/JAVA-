/*Q53. Write a program that takes a grade (A, B, C, D, F) as input and displays the corresponding remark using switch:
A: Excellent
B: Good
C: Average
D: Poor
F: Fail
Explanation:
 Use a char or string in switch to match grades and print remarks.*/
 
 import java.util.*;
 public class Q53 {
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter Grade (A-F): ");
        char grade = sc.next().toUpperCase().charAt(0);

        switch (grade) {
            case 'A': System.out.println("Excellent"); break;
            case 'B': System.out.println("Good"); break;
            case 'C': System.out.println("Average"); break;
            case 'D': System.out.println("Poor"); break;
            case 'F': System.out.println("Fail"); break;
            default: System.out.println("Invalid Grade");
        }
    }
}
