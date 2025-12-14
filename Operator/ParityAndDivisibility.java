/*Q55. Print Parity and Divisibility by 3.
Print :
"Even & Div by 3"


"Even"


"Div by 3"


"None"*/

import java.util.Scanner;

public class ParityAndDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("Even & Div by 3");
        } else if (num % 2 == 0) {
            System.out.println("Even");
        } else if (num % 3 == 0) {
            System.out.println("Div by 3");
        } else {
            System.out.println("None");
        }
    }
}
