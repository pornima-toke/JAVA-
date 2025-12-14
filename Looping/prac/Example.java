//Q35. Write a Java program to check whether a number is divisible by 5 and 11 or not. 

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        char ch = new Scanner(System.in).next().charAt(0);
        System.out.println(((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) ? "Alphabet" : "Not Alphabet");
    }
}