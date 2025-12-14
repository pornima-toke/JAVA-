import java.util.Scanner;

public class PrimeCheck {

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }

        // Check divisibility from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // divisible by i → not prime
            }
        }
        return true; // no divisors found → prime
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Call the function
        if (isPrime(num)) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is NOT a Prime number.");
        }

        sc.close();
    }
}
