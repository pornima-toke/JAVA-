/*Q50. A study has shown that playing a musical instrument helps in increasing one's IQ by 77 points. Chef knows he can't beat Einstein 
in physics, but he wants to try to beat him in an IQ competition.
You know that Einstein had an IQ of 170170, and Chef currently has an IQ of XX.
Determine if, after learning to play a musical instrument, Chef's IQ will become strictly greater than Einstein's. 
Print "Yes" if it is possible for Chef to beat Einstein, else print "No" (without quotes).You may print each character of the string 
in either uppercase or lowercase (for example, the strings yEs, yes, Yes, and YES will all be treated as identical).*/


import java.util.Scanner;
public class Q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iq = sc.nextInt();

        if (iq + 7 > 170) System.out.println("YES");
        else System.out.println("NO");
    }
}
