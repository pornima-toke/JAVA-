/*Q1. Write a program to create class name as Cube with two methods
void setValue(int x): this function accept number as parameter
int getCube(): this function can calculate a cube of a number and return it. */

class Cube
 {
    int num;

    void setValue(int x)
	{
        num = x;
    }

    int getCube() 
	{
        return num * num * num;
    }
}

public class CubeTest
 {
    public static void main(String[] args) 
	{
        Cube c = new Cube();
        c.setValue(5);
        System.out.println("Cube: " + c.getCube());
    }
}
