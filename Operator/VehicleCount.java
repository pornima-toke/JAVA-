/*Q32. An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:
• 1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
• 2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
Example :
Input : • 200 -> Value of V
• 540 -> Value of W
Output : • TW =130   FW=70
Explanation: 130+70 = 200 vehicles (70*4)+(130*2)= 540 wheels
*/
import java.util.Scanner;

public class VehicleCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input total vehicles and total wheels
        System.out.print("Enter total number of vehicles: ");
        int V = sc.nextInt();

        System.out.print("Enter total number of wheels: ");
        int W = sc.nextInt();

        // Validate total wheels (must be even and possible)
        if (W % 2 != 0 || W < 2 * V || W > 4 * V) {
            System.out.println("Invalid input! Check the number of wheels and vehicles.");
        } else {
            int FW = (W - 2 * V) / 2;       // Calculate four-wheelers
            int TW = V - FW;                // Calculate two-wheelers

            System.out.println("Two-Wheelers (TW) = " + TW);
            System.out.println("Four-Wheelers (FW) = " + FW);
        }

        sc.close();
    }
}
