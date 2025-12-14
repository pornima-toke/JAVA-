/*Q60. Create a Java program to simulate a basic food ordering system using switch:
 1: Burger
 2: Pizza
 3: Pasta
 4: Sandwich
 Display the price for the selected item.
Explanation:
 Switch on food item number. Print item name and price. Default for invalid selection.
*/
import java.util.Scanner;

public class FoodOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display menu
        System.out.println("Menu:");
        System.out.println("1: Burger");
        System.out.println("2: Pizza");
        System.out.println("3: Pasta");
        System.out.println("4: Sandwich");
        System.out.print("Enter your choice (1–4): ");
        int choice = sc.nextInt();

        // Use switch to select item and display price
        switch (choice) {
            case 1:
                System.out.println("You selected: Burger");
                System.out.println("Price: ₹80");
                break;
            case 2:
                System.out.println("You selected: Pizza");
                System.out.println("Price: ₹120");
                break;
            case 3:
                System.out.println("You selected: Pasta");
                System.out.println("Price: ₹100");
                break;
            case 4:
                System.out.println("You selected: Sandwich");
                System.out.println("Price: ₹70");
                break;
            default:
                System.out.println("Invalid selection. Please choose a number between 1 and 4.");
        }
    }
}
