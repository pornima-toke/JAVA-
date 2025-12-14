/*Q25.Write a java program to find the total number of notes in a given amount.  
                    	
            Enter the amount: 2528
Expected output : 500=5 , 100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1 */
import java.util.Scanner;

public class NoteCounterDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the amount
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        // Store the original amount for printing
        int originalAmount = amount;

        // Denominations to use
        int[] notes = {500, 100, 50, 20, 10, 5, 2, 1};

        System.out.println("Breakdown of " + originalAmount + ":");

        for (int note : notes) {
            int count = amount / note;     // Number of notes of this denomination
            amount = amount % note;        // Remaining amount
            System.out.println(note + " = " + count);
        }

        sc.close();
    }
}

