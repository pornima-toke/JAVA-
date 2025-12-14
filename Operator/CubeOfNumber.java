//Q19. Write a Java program that reads a number and display the cube.
import java.util.Scanner;

public class CubeOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Calculate cube
        int cube = number * number * number;

        // Output the cube
        System.out.println("Cube of " + number + " is: " + cube);
    }
}
