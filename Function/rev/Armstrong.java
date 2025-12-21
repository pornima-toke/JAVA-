/*Q1. Write a Java program to create a class named Armstrong with the following methods:
 1. void setNum(int no) – to accept a number. 2. void checkArm() – to check whether the given number is an Armstrong number or not.*/
 class Armstrong {
    int no;

    // Method to accept number
    void setNum(int no) {
        this.no = no;
    }

    // Method to check Armstrong number
    void checkArm() {
        int temp = no, sum = 0, digit;

        while (temp > 0) {
            digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }

        if (sum == no)
            System.out.println(no + " is an Armstrong number");
        else
            System.out.println(no + " is not an Armstrong number");
    }

    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        a.setNum(153);
        a.checkArm();
    }
}
