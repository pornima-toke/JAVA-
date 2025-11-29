/*7. Implement Voting Eligibility
Create a class Voter with a method isEligible that checks if a
 person (age provided) is eligible to vote.
Explanation: Introduces basic logical validation.*/

import java.util.*;
 class  Voter {
 	public boolean isEligible(int age) {
 		return age >= 18;
 	}
 	public static void main(String [] args){
 		Scanner sc = new Scanner (System.in);

 		System.out.print("Enter your age :");
 		int age = sc.nextInt();

 		Voter Voter = new Voter();
 		if (Voter.isEligible(age)) {
 			System.out.println("You are eligible to vote");
 		} else {
 			System.out.println("You are NOT eligible to vote.");
 		}
 	}
 }