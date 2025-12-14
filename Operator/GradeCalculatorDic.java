/*Q27. Write a java program to input marks of five subjects Physics, Chemistry, Biology,
        	    Mathematics and Computer, calculate percentage and grade according to given conditions:
                    	percentage >= 90% : Grade A
                    	percentage >= 80% : Grade B
                    	percentage >= 70% : Grade C
                    	percentage >= 60% : Grade D
                    	percentage >= 40% : Grade E
                    	percentage < 40% : Grade F	
*/
import java.util.Scanner;

public class GradeCalculatorDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for 5 subjects
        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks in Biology: ");
        int biology = sc.nextInt();

        System.out.print("Enter marks in Mathematics: ");
        int math = sc.nextInt();

        System.out.print("Enter marks in Computer: ");
        int computer = sc.nextInt();

        // Calculate total and percentage
        int totalMarks = physics + chemistry + biology + math + computer;
        float percentage = totalMarks / 5.0f;

        // Determine grade using if-else
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else if (percentage >= 40) {
            grade = "E";
        } else {
            grade = "F";
        }

        // Output
        System.out.println("\nTotal Marks = " + totalMarks);
        System.out.println("Percentage = " + percentage + "%");
        System.out.println("Grade = " + grade);

        sc.close();
    }
}
