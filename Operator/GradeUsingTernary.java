/*Q51. Print a grade using ternary operators:
90+: A
80–89: B
70–79: C
<70: F */

import java.util.Scanner;

public class GradeUsingTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score out of 100: ");
        int score = sc.nextInt();

        String grade = (score >= 90) ? "A" :
                       (score >= 80) ? "B" :
                       (score >= 70) ? "C" :
                       "F";

        System.out.println("Grade: " + grade);
    }
}
