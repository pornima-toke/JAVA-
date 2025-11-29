/*6. Maximum Sum Subarray of Size K

Approach: Sliding Window
Example: arr = [1,4,2,10,2,3,1,0,20], k = 4 → 24*/
public class SubarrK
{
	public static void main(String x[])
	{
		int a [] = {1,4,2,10,2,3,1,0,20};
		int sum = 0, max = 0, k = 4;
		
		if( i >= k-1) 
		{
			sum = sum + a[i];
		if(max < sum )
           {
			max = sum;
		   }
	         sum = sum - a[i - (k-1)];
	    }
		System.out.print(max);
	}
}

// Q9. Create a class Score with field int marks. Store multiple Score objects in a Vector and print top 3 highest scores.

import java.util.*;

class Score {
    int marks;

    // Constructor to initialize marks
    Score(int marks) {
        this.marks = marks;
    }
}

public class TopScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Score> scores = new Vector<>();

        System.out.print("Enter number of scores: ");
        int n = sc.nextInt();

        System.out.println("Enter marks of " + n + " students:");
        for (int i = 0; i < n; i++) {
            int mark = sc.nextInt();
            scores.add(new Score(mark)); // store Score object in Vector
        }

        // Extract marks from Score objects into a list for sorting
        ArrayList<Integer> marksList = new ArrayList<>();
        for (Score s : scores) {
            marksList.add(s.marks);
        }

        // Sort in descending order
        Collections.sort(marksList, Collections.reverseOrder());

        // Print top 3 scores
        System.out.println("\nTop 3 highest scores:");
        for (int i = 0; i < 3 && i < marksList.size(); i++) {
            System.out.println(marksList.get(i));
        }
    }
}
