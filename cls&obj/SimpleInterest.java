/* 5. Calculate Simple Interest
   Create a class SimpleInterest with a method calculate 
   that computes simple interest given principal, rate, and time.
   Explanation: Demonstrates mathematical formula implementation.
*/

class SimpleInterest
{
    void calculate(double principal, double rate, double time)
    {
        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + si);
    }

    public static void main(String[] args)
    {
        SimpleInterest obj = new SimpleInterest();
        obj.calculate(10000, 5, 2);  // Example values
    }
}
