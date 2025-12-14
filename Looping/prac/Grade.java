/*Q27. Write a java program to input marks of five subjects Physics, Chemistry, Biology,
        	    Mathematics and Computer, calculate percentage and grade according to given conditions:
                    	percentage >= 90% : Grade A
                    	percentage >= 80% : Grade B
                    	percentage >= 70% : Grade C
                    	percentage >= 60% : Grade D
                    	percentage >= 40% : Grade E
                    	percentage < 40% : Grade F	 */



import java.util.Scanner;

public class Grade { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Grade");
		int num = sc.nextInt();

        int phy = sc.nextInt();
        int chem = sc.nextInt();
        int bio = sc.nextInt();
        int math = sc.nextInt();
        int comp = sc.nextInt();

        int total = phy + chem + bio + math + comp;
        double percentage = total / 5.0;

        if (percentage >= 90)
            System.out.println("Grade A");
        else if (percentage >= 80)
            System.out.println("Grade B");
        else if (percentage >= 70)
            System.out.println("Grade C");
        else if (percentage >= 60)
            System.out.println("Grade D");
        else if (percentage >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade F");
    }
}