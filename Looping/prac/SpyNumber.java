// Q23. Spy Number
public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0, prod = 1;
        while (num > 0) {
            int digit = num % 10; 
            sum += digit;
            prod *= digit;
            num /= 10;
        }
        if (sum == prod)
            System.out.println("Spy Number");
        else
            System.out.println("Not a Spy Number");
    }
}
