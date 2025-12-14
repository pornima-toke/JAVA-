/*Q10. Write a menu-driven program in java using switch case. 
            1. input any alphabet and check whether it is vowel or consonant. 
            2.Find the max number using 3 numbers. 
 3. input any number & check number is divisible by 5 & 11.*/
 
 import java.util.*;
 public class SwitchCase
 {
 public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("The number is divisible by both 5 and 11.");
        } else {
            System.out.println("The number is NOT divisible by both 5 and 11.");
        }
    }
}
