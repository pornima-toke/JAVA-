/*1. Create a Class and Print a Message
Create a class HelloWorld with a method printMessage that prints "Hello, World!" when called.
Explanation: Helps understand class and method creation.
*/

// Create a class named HelloWorld
public class HelloWorld {

    // Method to print a message
    public void printMessage() {
        System.out.println("Hello, World!");
    }

    // Main method (program starts here)
    public static void main(String[] args) {
        // Create an object of HelloWorld class
        HelloWorld obj = new HelloWorld();

        // Call the method using object
        obj.printMessage();
    }
}
