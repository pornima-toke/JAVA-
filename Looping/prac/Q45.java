/*Q45.Chef is watching TV. The current volume of the TV is XX. Pressing the volume up button of the TV remote increases 
the volume by 11 while pressing the volume down button decreases the volume by 11. The chef wants to change the volume from XX to YY.
 Find the minimum number of button presses required to do so. */
 
 
import java.util.Scanner;
public class Q45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int X = sc.nextInt(), Y = sc.nextInt();
            System.out.println(Math.abs(Y - X));
        }
    }
}
