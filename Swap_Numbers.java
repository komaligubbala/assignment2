import java.io.*;
public class Swap_Numbers {
    public static void main(String[] args) {
        int a = 200;
        int b = 300;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("After swapping :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
