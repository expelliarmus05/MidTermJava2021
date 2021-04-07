package problemandsolutions;

import java.util.Scanner;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("\nb = ");
        b = input.nextInt();

        System.out.println("\nSum : "+ (a + b));
        System.out.println("Sub : "+ (a - b));
        System.out.println("Mul : "+ (a * b));
        System.out.println("Div : "+ (a / b));
    }




}
