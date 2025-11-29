public class Pattern1 {
    public static void main(String[] args) {
        int num = 1;
        char ch = 'A';
        for (int i = 1; i <= 5; i++) {
            if (i % 2 != 0) { // Odd row - print numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
                }
            } else { // Even row - print characters
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch + " ");
                    ch++;
                }
            }
            System.out.println();
        }
    }
}
